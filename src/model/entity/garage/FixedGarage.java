package model.entity.garage;

import model.entity.garage.abstractEntity.Garage;
import model.entity.vehicles.abstractEntity.Vehicle;

public class FixedGarage extends Garage {
    public final int DEFAULT_CAPACITY = 10;
    private Vehicle[] vehicles;

    public FixedGarage(Vehicle[] array) {
        moveNulls(array);
        this.vehicles = array;
        super.setCapacity(array.length);
        super.checkNumberOfVehicles(array);
    }
    public FixedGarage(){
        vehicles = new Vehicle[DEFAULT_CAPACITY];
        setCapacity(DEFAULT_CAPACITY);
        setNumberOfVehicles(0);
    }
    public FixedGarage(int capacity){
        vehicles = new Vehicle[capacity];
        super.setCapacity(capacity);
        setNumberOfVehicles(0);
    }

    public void setVehiclesInGarage(Vehicle[] array) {
        moveNulls(array);
        this.vehicles = array;
        setCapacity(array.length);
        checkNumberOfVehicles(array);
    }

    public void add(Vehicle vehicle){
        if(vehicle == null) return;
        if(super.getNumberOfVehicles()<super.getCapacity()){
            vehicles[getNumberOfVehicles()] = vehicle;
            setNumberOfVehicles(getNumberOfVehicles()+1);
        }
    }

//    public void remove(<T> obj){
//        [1,0,3,0,5,0,0,0]
//    }

    public void remove(int index){
        if(index == getCapacity()-1) vehicles[index] = null;
        if(index>=0 && index<getCapacity()) {
            System.arraycopy(vehicles, index + 1, vehicles, index, getCapacity() - index - 1);
            setNumberOfVehicles(getNumberOfVehicles()-1);
        }
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        if (getNumberOfVehicles()== 0) return "Empty garage";
        for (Vehicle vh:vehicles) {
            if(vh == null) builder.append("Nothing here yet").append("\n");
            else builder.append(vh).append("\n");
        }
        return builder.toString();
    }
}
