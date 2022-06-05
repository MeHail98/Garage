package model.logic.sorter.comparator;

import model.entity.vehicles.abstractEntity.Vehicle;

import java.util.Comparator;

public class SortByMaxSpeedAsc implements Comparator<Vehicle> {
    @Override
    public int compare(Vehicle vehicle1, Vehicle vehicle2) {
        return vehicle1.getMaxSpeed() - vehicle2.getMaxSpeed();
    }
}
