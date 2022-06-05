package model.logic.iterator;

import model.entity.vehicles.abstractEntity.Vehicle;

public interface Iterable {
    boolean hasNext();
    Vehicle next();
    void reset();
}
