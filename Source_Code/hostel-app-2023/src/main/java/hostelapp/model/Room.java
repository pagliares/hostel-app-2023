package hostelapp.model;

import java.util.Objects;

public class Room {
    private String number;
    private String name;
    private int floor;
    private String description;
    private double dimension;
    private RoomType roomType;

    public Room() {
    }

    public Room(String number, String name, int floor) {
        this.number = number;
        this.name = name;
        this.floor = floor;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


    public double getDimension() {
        return dimension;
    }

    public void setDimension(double dimension) {
        this.dimension = dimension;
    }

    public RoomType getRoomType() {
        return roomType;
    }

    public void setRoomType(RoomType roomType) {
        this.roomType = roomType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Room room)) return false;
        return floor == room.floor && number.equals(room.number) && name.equals(room.name) && roomType == room.roomType;
    }

    @Override
    public int hashCode() {
        return Objects.hash(number, name, floor, roomType);
    }

    @Override
    public String toString() {
        return "Room{" +
                "number='" + number + '\'' +
                ", name='" + name + '\'' +
                ", floor=" + floor +
                ", description='" + description + '\'' +
                ", dimension=" + dimension +
                ", roomType=" + roomType +
                '}';
    }
}
