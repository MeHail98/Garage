package model.entity.garage.abstractEntity;

import model.entity.vehicles.abstractEntity.Vehicle;

import java.util.Arrays;
import java.util.Objects;

public abstract class  Garage {
    protected int capacity;
    protected int numberOfVehicles;

    public int getCapacity() {
        return capacity;
    }
    public int getNumberOfVehicles() {
        return numberOfVehicles;
    }
    public void setCapacity(int capacity) {
        if(capacity<numberOfVehicles) return;
        this.capacity = capacity;
    }
    public void setNumberOfVehicles(int numberOfVehicles) {
        if(numberOfVehicles>capacity) return;
        this.numberOfVehicles = numberOfVehicles;
    }

    protected void checkNumberOfVehicles(Vehicle[] vehicles){
        for (Vehicle vehicle:vehicles) {
            if(vehicle != null) numberOfVehicles++;
        }
    }
    protected void moveNulls(Vehicle[] vehicles){
        int size = vehicles.length;
        for (int i = 0; i < size; i++) {
            if(vehicles[i] == null){
                for (int j = i; j < size; j++) {
                    if(vehicles[j] != null){
                        vehicles[i] = vehicles[j];
                        vehicles[j] = null;
                        break;
                    }
                }
            }
        }
    }
    protected Vehicle[] removeNulls(Vehicle[] array){
        return Arrays.stream(array).filter(Objects::nonNull).toArray(Vehicle[]::new);
    }

    public abstract Vehicle getVehicle (int index);

    public abstract void setVehicle(int index, Vehicle vehicle);
}
