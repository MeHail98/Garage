package controller;

import model.entity.garage.DynamicGarage;
import model.entity.garage.ListGarage;
import model.entity.vehicles.Airplane;
import model.entity.vehicles.Automobile;
import model.entity.vehicles.Bicycle;
import model.entity.vehicles.abstractEntity.Vehicle;
import model.logic.iterator.Iterable;
import model.logic.iterator.OneIteratorForEverything;

public class Main {
    public static void main (String[] a){
        Bicycle bicycle = new Bicycle("plane",100,10,true,"Steel");
        Vehicle airplane = new Airplane("bicycle",10,1000,false,true);
        Vehicle automobile = new Automobile("auto",100,100,true,true);

//        Wheel smallWheel = new SmallWheel();
//        Wheel bigWheel = new BigWheel();
//
//
//        System.out.println(automobile);
//        AutoConstructor autoConstructor = AutoConstructor.getInstance();
//        System.out.println(autoConstructor);
//        autoConstructor.addVehicleToConstructor(automobile);
//        System.out.println(autoConstructor);
//        autoConstructor.addWheelsOnVehicle(smallWheel);
//        System.out.println(autoConstructor);
//        autoConstructor.addWheelsOnVehicle(bigWheel);
//        System.out.println(autoConstructor);

        Vehicle[] array = {bicycle,airplane,automobile};
        DynamicGarage dg = new DynamicGarage(array);
        ListGarage lg = new ListGarage();
        lg.addMajor(bicycle,airplane,automobile);

//        Iterable iterator = dg.getIterator();
//            while(iterator.hasNext()){
//                System.out.println(iterator.next());
//        }
//
//        List<Vehicle> vhList = new ArrayList<>();
//        vhList.add(bicycle);
//        vhList.add(airplane);
//        vhList.add(automobile);
//        vhList.sort(new SortByMaxSpeedAsc());
//        System.out.println(vhList);
//
//
//        List<Vehicle> vhList1 = new LinkedList<>(vhList);
//        vhList1.sort(new SortByMaxSpeedAsc());
//        System.out.println(vhList1);
    }
}
