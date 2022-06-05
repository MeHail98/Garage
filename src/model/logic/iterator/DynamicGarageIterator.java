package model.logic.iterator;

import model.entity.garage.DynamicGarage;
import model.entity.vehicles.abstractEntity.Vehicle;

public class DynamicGarageIterator implements Iterable{
    private final DynamicGarage dynamicGarage;
    int current;

    public DynamicGarageIterator(DynamicGarage dynamicGarage){
        this.dynamicGarage = dynamicGarage;
        current = 0;
    }

    @Override
    public boolean hasNext() {
        return current<dynamicGarage.getCapacity();
    }

    @Override
    public Vehicle next() {
        return dynamicGarage.getVehicle(current++);
    }

    @Override
    public void reset() {
        current = 0;
    }
}
