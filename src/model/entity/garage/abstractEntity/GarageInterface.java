package model.entity.garage.abstractEntity;

import model.entity.vehicles.abstractEntity.Vehicle;

public interface GarageInterface {
    Vehicle getVehicle(int index);
    void setVehicle(int index, Vehicle vehicle);
    int getSize();

}
