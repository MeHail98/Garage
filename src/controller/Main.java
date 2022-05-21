package controller;

import model.entity.garage.DynamicGarage;
import model.entity.vehicles.abstractEntity.Vehicle;
import model.entity.garage.FixedGarage;
import model.logic.sorter.Sorter;

public class Main {
    public static void main (String[] a){
        Vehicle vh1 = new Vehicle("plane",100,1000,true);
        Vehicle vh2 = new Vehicle("bicycle",10,10,false);
        Vehicle vh3 = new Vehicle("auto",100,1000,true);

        DynamicGarage dg = new DynamicGarage();
        dg.add(vh1,vh2,vh3);
        System.out.println(dg);
        Sorter.sort(dg);
        System.out.println(dg);

    }
}
