package model.logic.sorter;

import model.entity.garage.DynamicGarage;
import model.entity.garage.abstractEntity.Garage;
import model.entity.vehicles.abstractEntity.Vehicle;

public class Sorter {
    public static void sort (Garage garage, Sortable direction){
        for (int i = 0; i < garage.getNumberOfVehicles(); i++) {
            for (int j = 0; j < garage.getNumberOfVehicles()-1-i; j++) {
                if(direction.compare(garage.getVehicle(j), garage.getVehicle(j+1))){
                    Vehicle temp = garage.getVehicle(j);
                    garage.setVehicle(j,garage.getVehicle(j+1));
                    garage.setVehicle(j+1,temp);
                }
            }
        }
    }
}
