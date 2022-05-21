package model.entity.garage;

import model.entity.garage.abstractEntity.Garage;
import model.entity.vehicles.abstractEntity.Vehicle;

public class ListGarage extends Garage {
    private Node first;

    public ListGarage() {
        first = null;
        setCapacity(0);
        setNumberOfVehicles(0);
    }

    public Vehicle getVehicle(int index) {
        if(index>getNumberOfVehicles() && index<=0){
            return null;
        }
        Node temp = first;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp.vehicle;
    }

    public void addVehicle(Vehicle vehicle) {
        if (getCapacity() == 0) {
            first = new Node(vehicle);
        } else {
            Node temp = first;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = new Node(vehicle);
        }

    }

    private class Node {
        public Vehicle vehicle;
        public Node next;

        public Node(Vehicle vehicle) {
            this.vehicle = vehicle;
        }
        public Node() {
        }
    }
}
