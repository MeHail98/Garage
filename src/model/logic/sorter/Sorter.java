package model.logic.sorter;

import model.entity.garage.DynamicGarage;
import model.entity.garage.abstractEntity.Garage;
import model.entity.garage.abstractEntity.GarageInterface;
import model.entity.vehicles.abstractEntity.Vehicle;

public class Sorter {
    public static void sort (GarageInterface garage){
        for (int i = 0; i < garage.getSize(); i++) {
            for (int j = 0; j < garage.getSize()-1-i; j++) {
                if(garage.getVehicle(j).getWeight()>garage.getVehicle(j+1).getWeight()){
                    Vehicle temp = garage.getVehicle(j);
                    garage.setVehicle(j,garage.getVehicle(j+1));
                    garage.setVehicle(j+1,temp);
                }
            }
        }
    }
}
