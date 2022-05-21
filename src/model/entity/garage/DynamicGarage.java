package model.entity.garage;

import model.entity.garage.abstractEntity.Garage;
import model.entity.garage.abstractEntity.GarageInterface;
import model.entity.vehicles.abstractEntity.Vehicle;

public class DynamicGarage extends Garage implements GarageInterface {
    private Vehicle[] vehicles;

    public DynamicGarage(Vehicle[] array) {
        this.vehicles = removeNulls(array);
        setCapacity(this.vehicles.length);
        setNumberOfVehicles(this.vehicles.length);
    }
    public DynamicGarage(){
        vehicles = new Vehicle[0];
        setCapacity(0);
        setNumberOfVehicles(0);
    }
    public void add(Vehicle... vehicles){
        Vehicle[] array = new Vehicle[this.vehicles.length+vehicles.length];
        System.arraycopy(this.vehicles, 0,array,0,this.vehicles.length);
        System.arraycopy(vehicles,0,array,this.vehicles.length,vehicles.length);
        removeNulls(array);
        this.vehicles = array;
        super.setCapacity(array.length);
        super.setNumberOfVehicles(array.length);
    }
    public void remove(int index){
        if(index< vehicles.length && index>=0){
            vehicles[index] = null;
            vehicles = removeNulls(vehicles);
            setCapacity(getCapacity()-1);
            setNumberOfVehicles(getNumberOfVehicles()-1);
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
        if (getNumberOfVehicles()== 0) return "Empty garage";
        for (Vehicle vh:vehicles) {
            builder.append(vh).append("\n");
        }
        return builder.toString();
    }
}
