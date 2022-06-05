package model.entity.garage;

import model.entity.garage.abstractEntity.Garage;
import model.entity.vehicles.abstractEntity.Vehicle;

public class ListGarage extends Garage {
    private Node first;

    public ListGarage() {
        first = null;
        capacity =0;
        numberOfVehicles = 0;
    }

    public Vehicle getVehicle(int index) {
        if(index>=numberOfVehicles || index<0){
            return null;
        }
        Node temp = first;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp.vehicle;
    }

    public void addMinor(Vehicle vehicle) {
        if (capacity == 0) {
            first = new Node(vehicle);
        } else {
            Node temp = first;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = new Node(vehicle);
        }
        capacity++;
        numberOfVehicles++;
    }

    public void addMajor(Vehicle ...vehicles){
        if(capacity == 0){
            first = new Node(vehicles[0]);
            Node temp = first;
            for (int i = 1; i < vehicles.length; i++) {
                temp.next = new Node(vehicles[i]);
                temp = temp.next;
            }
        } else{
            Node temp = first;
            while(temp.next != null){
                temp = temp.next;
            }
            for (Vehicle vehicle : vehicles) {
                temp.next = new Node(vehicle);
                temp = temp.next;
            }
        }
        capacity += vehicles.length;
        numberOfVehicles +=vehicles.length;
    }

    public void removeVehicle(int index){
        if(index>numberOfVehicles || index<0) return;
        if(index == 0) {
            first = first.next;
            numberOfVehicles--;
            return;
        }
        Node temp = first;
        int current = 1;
        while (temp.next!=null){
            if(current++ == index){
                temp.next = temp.next.next;
                numberOfVehicles--;
                return;
            }
            temp = temp.next;
        }
    }

    private static class Node {
        public Vehicle vehicle;
        public Node next;

        public Node(Vehicle vehicle) {
            this.vehicle = vehicle;
        }
        public Node() {
        }
    }

    public void setVehicle(int index, Vehicle vehicle){
    }

    @Override
    public String toString(){
        StringBuilder builder = new StringBuilder();
        if(first == null) return "Empty garage";
        Node temp = first;
        for (int i = 0; i < numberOfVehicles; i++) {
            builder.append(temp.vehicle).append("\n");
            temp = temp.next;
        }
        return builder.toString();
    }

}
