package models;

public class Room {
    private int room_num;
    private RoomType type;
    private boolean isAvailable;
    private double price;

    public Room(int roomNumber, RoomType type, double pricePerNight) {
        this.room_num = roomNumber;
        this.type = type;
        this.isAvailable = true; 
        this.price = pricePerNight;
    }

  
    public int getRoomNum() {
        return room_num;
    }

    public void setRoomNum(int roomNumber) {
        this.room_num = roomNumber;
    }

    public RoomType getType() {
        return type;
    }

    public void setType(RoomType type) {
        this.type = type;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double pricePerNight) {
        this.price = pricePerNight;
    }
}
