package hostelapp.model;

public class Hostel {
    private String name;
    private Address address;
    private String phone;
    private String email;

    private static final Hostel hostel = new Hostel();

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

    @Override
    public String toString() {
        return "name='" + name + '\'' +
                ", address=" + address +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'';
    }
}
