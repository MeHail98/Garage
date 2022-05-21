package model.entity.vehicles;

import model.entity.vehicles.abstractEntity.Vehicle;

public class Automobile extends Vehicle {
    private boolean hasTrunk;
    private int passengerSeats;

    public Automobile() {
    }
    public Automobile(String model, int weight, int maxSpeed,boolean hasEngine, boolean trunk) {
        super(model, weight, maxSpeed, hasEngine);
        this.hasTrunk = trunk;
    }
    public boolean hasTrunk() {
        return hasTrunk;
    }
    public void setHasTrunk(boolean trunk) {
        this.hasTrunk = trunk;
    }
    public int getPassengerSeats() {
        return passengerSeats;
    }
    public void setPassengerSeats(int passengerSeats) {
        this.passengerSeats = passengerSeats;
    }
    @Override
    public String toString(){
        return "Automobile... "+super.toString()+", has trunk: "+hasTrunk+", passenger seats: "+passengerSeats;
    }

}
