package model.logic.iterator;

import model.entity.garage.abstractEntity.Garage;
import model.entity.vehicles.abstractEntity.Vehicle;

public class OneIteratorForEverything {
    private final Garage garage;
    int current = 0;

    public OneIteratorForEverything(Garage garage){
        this.garage = garage;
    }

    public boolean hasNext() {
        return current<garage.getCapacity();
    }

    public Vehicle next() {
        return garage.getVehicle(current++);
    }

    public void reset() {
        current = 0;
    }

}
