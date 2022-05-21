package model.entity.vehicles;
import model.entity.vehicles.abstractEntity.Vehicle;
public class Bicycle extends Vehicle {
    private String frameMaterial;

    public Bicycle(String model, int weight, int maxSpeed, boolean hasEngine, String frameMaterial) {
        super(model, weight, maxSpeed, hasEngine);
        this.frameMaterial = frameMaterial;
    }
    public Bicycle(){
    }
    public String getFrameMaterial() {
        return frameMaterial;
    }
    public void setFrameMaterial(String frameMaterial) {
        this.frameMaterial = frameMaterial;
    }
    @Override
    public String toString(){
        return "Bicycle... "+super.toString() + ", frame material: "+frameMaterial;
    }
}
