package model.logic.iterator;

import model.entity.garage.ListGarage;
import model.entity.vehicles.abstractEntity.Vehicle;

public class ListGarageIterator implements Iterable {
    private final ListGarage listGarage;
    int current;

    public ListGarageIterator(ListGarage listGarage){
        this.listGarage = listGarage;
        current = 0;
    }

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
