package hostelapp.model;

import hostelapp.model.exceptions.RoomNotFoundException;

import java.util.HashSet;
import java.util.Set;

public class Hostel {
    private String name;
    private Address address;
    private String phone;
    private String email;

    private static final Hostel hostel = new Hostel();

    private Set<Room> rooms = new HashSet<>();

    private Hostel() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public static Hostel getHostel(){
        return hostel;
    }

    public Set<Room> getRooms() {
        return rooms;
    }

    public void setRooms(Set<Room> rooms) {
        this.rooms = rooms;
    }

    public Room getRoomByNumber(String number) throws RoomNotFoundException {
        for (Room room: rooms) {
            if (room.getNumber().equals(number))
                return room;
        }
        throw new RoomNotFoundException("Room not found! : ", number);
    }

    public void addRoom(Room room){
        this.rooms.add(room);
    }

    @Override
    public String toString() {
        return "Hostel{" +
                "name='" + name + '\'' +
                ", address=" + address +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", rooms=" + rooms +
                '}';
    }
}
