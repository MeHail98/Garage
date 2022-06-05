package model.logic.sorter;

import model.entity.vehicles.abstractEntity.Vehicle;

public class SortByWeightAsc implements Sortable {
    public boolean compare(Vehicle vh1, Vehicle vh2) {
        return vh1.getWeight() > vh2.getWeight();
    }
}
