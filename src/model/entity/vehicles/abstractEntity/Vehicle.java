package model.entity.vehicles.abstractEntity;

public abstract class Vehicle {
    private String model;
    private int weight;
    private int maxSpeed;
    private boolean hasEngine;

    public Vehicle(){
    }

    public Vehicle(String model, int weight, int maxSpeed, boolean hasEngine){
        this.model = model;
        this.weight = weight;
        this.maxSpeed = maxSpeed;
        this.hasEngine = hasEngine;
    }

    public void setModel(String model) {
        this.model = model;
    }
    public String getModel() {
        return model;
    }
    public void setWeight(int weight) {
        this.weight = weight;
    }
    public int getWeight() {
        return weight;
    }
    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setHasEngine(boolean hasEngine) {
        this.hasEngine = hasEngine;
    }
    public boolean hasEngine() {
        return hasEngine;
    }
    public String toString(){
        return String.format("model: %s, weight: %d, max speed: %d, has engine: %b"
                , model, weight, maxSpeed, hasEngine);
    }
}
