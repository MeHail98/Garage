package model.logic.iterator;

import model.entity.garage.FixedGarage;
import model.entity.vehicles.abstractEntity.Vehicle;

public class FixedGarageIterator implements Iterable{
    private final FixedGarage fixedGarage;
    int current;

    public FixedGarageIterator(FixedGarage fixedGarage){
        this.fixedGarage = fixedGarage;
        current = 0;
    }

    @Override
    public boolean hasNext() {
        return current<fixedGarage.getCapacity();
    }

    @Override
    public Vehicle next() {
        return fixedGarage.getVehicle(current++);
    }

    @Override
    public void reset() {
        current = 0;
    }
}
