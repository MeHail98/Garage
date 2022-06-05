package model.entity.fabique.autoConstructor;

public class SmallWheel extends Wheel{
    private final int WHEEL_WEIGHT = 10;

    public SmallWheel() {
    }

    public int getWeight(){
        return WHEEL_WEIGHT;
    }

    @Override
    public String toString() {
        return "Small wheel weight: " + WHEEL_WEIGHT;
    }
}
