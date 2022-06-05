package model.logic.sorter.comparator;

import model.entity.vehicles.abstractEntity.Vehicle;

import java.util.Comparator;

public class SortByMaxSpeedDesc implements Comparator<Vehicle> {
    @Override
    public int compare (Vehicle vh1, Vehicle vh2){
        return vh2.getMaxSpeed() - vh1.getMaxSpeed();
    }
}
