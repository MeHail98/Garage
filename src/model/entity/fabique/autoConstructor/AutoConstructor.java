package model.entity.fabique.autoConstructor;

import model.entity.vehicles.abstractEntity.Vehicle;

public class AutoConstructor {
    private static AutoConstructor instance;
    private Vehicle vehicle;
    private Wheel wheel;

    public static AutoConstructor getInstance(){
        if (instance == null) return new AutoConstructor();
        return instance;
    }

    private AutoConstructor() {
        vehicle = null;
        wheel = null;
    }

    public void addVehicleToConstructor (Vehicle vehicle){
        this.vehicle = vehicle;
    }

    public void addWheelsOnVehicle (Wheel newWheel){
        if (this.wheel == null){
            this.wheel = newWheel;
            vehicle.setWeight(vehicle.getWeight()+ newWheel.getWeight());
        } else {
            vehicle.setWeight(vehicle.getWeight() - this.wheel.getWeight() + newWheel.getWeight());
            this.wheel = newWheel;
        }
    }

    @Override
    public String toString() {
        return "Vehicle:" + vehicle + ", wheels: "+ wheel;
    }
}
