package model.logic.iterator;

import model.entity.garage.ListGarage;
import model.entity.vehicles.abstractEntity.Vehicle;

public class ListGarageIterator implements Iterable {
    private ListGarage listGarage;
    int current = 0;

    @Override
    public boolean hasNext() {
        return current<listGarage.getCapacity();
    }

    @Override
    public Vehicle next() {
        return listGarage.getVehicle(current++);
    }

    @Override
    public void reset() {
        current = 0;
    }
}
