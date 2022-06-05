package model.logic.sorter;

import model.entity.vehicles.abstractEntity.Vehicle;

public class SortByWeightDesc implements Sortable{

    @Override
    public boolean compare(Vehicle vh1, Vehicle vh2) {
        return vh1.getWeight() < vh2.getWeight();
    }
}
