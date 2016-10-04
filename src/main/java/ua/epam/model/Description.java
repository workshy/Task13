package ua.epam.model;

/**
 * Created by Viktoriia_Marynchak on 9/30/2016.
 */
public class Description {
    private int id;
    private int capacity;
    private int quantityRooms;
    private int floor;
    private double squareRoom;

    /*public Description() {
    }*/

    public Description(int id, int capacity, int quantityRooms, int floor, double squareRoom) {
        this.id = id;
        this.capacity = capacity;
        this.quantityRooms = quantityRooms;
        this.floor = floor;
        this.squareRoom = squareRoom;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getQuantityRooms() {
        return quantityRooms;
    }

    public void setQuantityRooms(int quantityRooms) {
        this.quantityRooms = quantityRooms;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public double getSquareRoom() {
        return squareRoom;
    }

    public void setSquareRoom(double squareRoom) {
        this.squareRoom = squareRoom;
    }
}
