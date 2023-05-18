package hostelapp.model;

import java.util.*;

public class Guest {
    private String name;
    private String lastName;

    private Address address;

    private String email;

    private Date birthday;

    private List<Reservation> reservations = new ArrayList<>();

    private Title title;

    public Guest() {
       this("");
    }
    public Guest(String name){
        this(name, "");
    }

    public Guest(String name, String lastName){
        this.name = name;
        this.lastName = lastName;
    }

     public String getName() {
        return name;
    }

     public boolean setName(String name) {
        if (name.length() > 2) {
            this.name = name;
            return true;
        }
        return false;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public List<Reservation> getReservations() {
        return reservations;
    }

    public void setReservations(List<Reservation> reservations) {
        this.reservations = reservations;
    }

    public void addReservation(Reservation reservation) {
        reservations.add(reservation);
    }

    public Title getTitle() {
        return title;
    }

    public void setTitle(Title title) {
        this.title = title;
    }
}
