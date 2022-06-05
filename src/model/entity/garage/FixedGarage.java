package model.entity.garage;

import model.entity.garage.abstractEntity.Garage;
import model.entity.vehicles.abstractEntity.Vehicle;

public class FixedGarage extends Garage {
    public final int DEFAULT_CAPACITY = 10;
    private Vehicle[] vehicles;

    public FixedGarage(Vehicle[] array) {
        moveNulls(array);
        this.vehicles = array;
        capacity = array.length;
        super.checkNumberOfVehicles(array);
    }
    public FixedGarage(){
        vehicles = new Vehicle[DEFAULT_CAPACITY];
        capacity = DEFAULT_CAPACITY;
        numberOfVehicles = 0;
    }
    public FixedGarage(int capacity){
        vehicles = new Vehicle[capacity];
        super.capacity = capacity;
        numberOfVehicles = 0;
    }

    public void setVehiclesInGarage(Vehicle[] array) {
        moveNulls(array);
        this.vehicles = array;
        capacity = array.length;
        checkNumberOfVehicles(array);
    }

    public void add(Vehicle vehicle){
        if(vehicle == null) return;
        if(numberOfVehicles<capacity){
            vehicles[numberOfVehicles] = vehicle;
            numberOfVehicles++;
        }
    }

    public void remove (Vehicle vehicle){
        for (int i = 0; i < capacity; i++) {
            if (vehicles[i] ==vehicle) remove(i);
        }
    }

    public void remove(int index){
        if(index == capacity-1) vehicles[index] = null;
        if(index>=0 && index<capacity) {
            System.arraycopy(vehicles, index + 1, vehicles, index, getCapacity() - index - 1);
            vehicles[numberOfVehicles-1] = null;
            numberOfVehicles--;
        }
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        if (numberOfVehicles== 0) return "Empty garage";
        for (Vehicle vh:vehicles) {
            if(vh == null) builder.append("Nothing here yet").append("\n");
            else builder.append(vh).append("\n");
        }
        return builder.toString();
    }

    @Override
    public Vehicle getVehicle(int index) {
        if(index<0 || index>vehicles.length) return null;
        return vehicles[index];
    }

    public void setVehicle(int index, Vehicle vehicle){
        if(index>=0 && index<vehicles.length)
            this.vehicles[index] = vehicle;
    }
}
