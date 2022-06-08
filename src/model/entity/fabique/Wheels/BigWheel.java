package model.entity.fabique.Wheels;

public class BigWheel extends Wheel{
    private final int WHEEL_WEIGHT = 20;

    public BigWheel() {
    }

    public int getWeight(){
        return WHEEL_WEIGHT;
    }

    @Override
    public String toString() {
        return "Big wheel weight: " + WHEEL_WEIGHT;
    }
}
