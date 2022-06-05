package model.logic.sorter;

import model.entity.vehicles.abstractEntity.Vehicle;

public interface Sortable {
    boolean compare(Vehicle vh1, Vehicle vh2);
}
