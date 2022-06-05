package model.logic.iterator;

import model.entity.vehicles.abstractEntity.Vehicle;

public interface Iterable<T> {
    boolean hasNext();
    Vehicle next();
    void reset();
}
