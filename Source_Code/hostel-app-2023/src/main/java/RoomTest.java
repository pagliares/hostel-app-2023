import hostelapp.model.Address;
import hostelapp.model.Hostel;
import hostelapp.model.Room;
import hostelapp.model.RoomType;
import hostelapp.model.exceptions.RoomNotFoundException;

public class RoomTest {

    public static void main(String[] args) {

        Hostel hostel = Hostel.getHostel();
        hostel.setName("Hostel Sparkling Water");
        hostel.setPhone("+(55) 35-91111-1123");
        hostel.setContactEmail("sparkling_water@gmail.com");

        Address address = new Address();
        address.setAddress("Nightmare street, 13");
        address.setCity("Caxambu");
        address.setCountry("Brazil");
        address.setZipCode("12-440-000");
        address.setState("MG");

        hostel.setAddress(address);

        Room room1 = new Room("101", "D. Leopoldina", 1);
        Room room2 = new Room("102", "D. Pedro", 1);
        Room room3 = new Room("301", "Dr. Viotti", 3);


        room1.setRoomType(RoomType.SINGLE);
        room2.setRoomType(RoomType.DOUBLE);
        room3.setRoomType(RoomType.SINGLE);

        room1.setDescription("Pleasant room with balcony");
        room2.setDescription("Large room with an extra bed");
        room3.setDescription("Standard room without balcony");

        room1.setDimension(15.50);
        room2.setDimension(50);
        room3.setDimension(7.80);


        hostel.addRoom(room1);
        hostel.addRoom(room2);
        hostel.addRoom(room3);

//        System.out.println(hostel);

        try {
            System.out.println(hostel.getRoomByNumber("101"));
        } catch (RoomNotFoundException e) {
            System.out.println(e.getMessage());
        }


    }
}
