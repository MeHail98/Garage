package model.entity.garage;

import model.entity.garage.abstractEntity.Garage;
import model.entity.vehicles.abstractEntity.Vehicle;
import model.logic.iterator.DynamicGarageIterator;
import model.logic.iterator.FixedGarageIterator;
import model.logic.iterator.Iterable;

public class DynamicGarage extends Garage {
    private Vehicle[] vehicles;

    public DynamicGarage(Vehicle[] array) {
        this.vehicles = removeNulls(array);
        capacity = this.vehicles.length;
        numberOfVehicles = this.vehicles.length;
    }
    public DynamicGarage(){
        vehicles = new Vehicle[0];
        capacity = 0;
        numberOfVehicles=0;
    }
    public void add(Vehicle... vehicles){
        Vehicle[] array = new Vehicle[this.vehicles.length+vehicles.length];
        System.arraycopy(this.vehicles, 0,array,0,this.vehicles.length);
        System.arraycopy(vehicles,0,array,this.vehicles.length,vehicles.length);
        removeNulls(array);
        this.vehicles = array;
        numberOfVehicles = capacity = array.length;
    }

    public void remove(int index){
        if(index< vehicles.length && index>=0){
            vehicles[index] = null;
            vehicles = removeNulls(vehicles);
            capacity--;
            numberOfVehicles--;
        }
    }
    public void remove (Vehicle vehicle){
        for (int i = 0; i < capacity; i++) {
            if (vehicles[i] ==vehicle) remove(i);
        }
    }

    public Vehicle[] getVehicles() {
        return vehicles;
    }
    public Vehicle getVehicle(int index){
        if(index<0 || index>vehicles.length) return null;
        return vehicles[index];
    }


    public void setVehicles(Vehicle[] vehicles) {
        this.vehicles = vehicles;
    }
    public void setVehicle(int index, Vehicle vehicle){
        if(index>=0 && index<vehicles.length)
        this.vehicles[index] = vehicle;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        if (numberOfVehicles== 0) return "Empty garage";
        for (Vehicle vh:vehicles) {
            builder.append(vh).append("\n");
        }
        return builder.toString();
    }

    public Iterable getIterator(){
        return new DynamicGarageIterator(this);
    }
}
