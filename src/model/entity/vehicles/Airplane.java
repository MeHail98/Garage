package model.entity.vehicles;

import model.entity.vehicles.abstractEntity.Vehicle;

public class Airplane extends Vehicle {
    private boolean canFly;

    public Airplane(String model, int weight, int maxSpeed, boolean hasEngine, boolean canFly) {
        super(model, weight, maxSpeed, hasEngine);
        this.canFly = canFly;
    }
    public Airplane(){
    }

    public boolean canFly() {
        return canFly;
    }

    public void setCanFly(boolean canFly) {
        this.canFly = canFly;
    }

    @Override
    public String toString(){
        return "Airplane... "+super.toString()+", can fly: "+canFly;
    }
}
