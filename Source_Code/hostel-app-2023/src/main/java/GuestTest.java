import hostelapp.model.Address;
import hostelapp.model.Date;
import hostelapp.model.Guest;
import hostelapp.model.Reservation;

import java.util.*;

public class GuestTest {
    public static void main(String[] args) {
        Guest florentino = new Guest();
        florentino.setName("Florentino");
        florentino.setLastName("Ariza");
        florentino.setEmail("ariza@gmail.com");

        Date birthday = new Date();
        birthday.setDay(35);
        birthday.setMonth(2);
        birthday.setYear(1970);

        florentino.setBirthday(birthday);

        Address address = new Address();
        address.setAddress("Rua Joaquim Lázaro Gomes");
        address.setCity("Alfenas");
        address.setZipCode("37130-000");
        address.setState("MG");
        address.setCountry("Brazil");

        florentino.setAddress(address);


        Reservation reservation1 = new Reservation();
        Date reservationDate1 = new Date(12, 5, 2023);
        Date checkinDate1 = new Date(15, 7, 2023);
        Date checkoutDate1 = new Date(22, 7, 2023);
        reservation1.setReservationDate(reservationDate1);
        reservation1.setCheckinDate(checkinDate1);
        reservation1.setCheckoutDate(checkoutDate1);

        Reservation reservation2 = new Reservation();
        Date reservationDate2 = new Date(10, 2, 2023);
        Date checkinDate2 = new Date(20, 8, 2023);
        Date checkoutDate2 = new Date(23, 8, 2023);
        reservation2.setReservationDate(reservationDate2);
        reservation2.setCheckinDate(checkinDate2);
        reservation2.setCheckoutDate(checkoutDate2);

//        ArrayList<Reservation> reservations = new ArrayList<>();
//        reservations.add(reservation1);
//        reservations.add(reservation2);

//        florentino.setReservations(reservations);

        florentino.addReservation(reservation1);
        florentino.addReservation(reservation2);

        Address florentinoAddress = florentino.getAddress();
        String city = florentinoAddress.getCity();

        System.out.println("Name...: " + florentino.getName());
        System.out.println("Last name...: " + florentino.getLastName());
        System.out.println("Email...: " + florentino.getEmail());
        System.out.println("Birthdate..: " + florentino.getBirthday());
        System.out.println("Address...: " + florentino.getAddress().getAddress());
        System.out.println("City....: " + city);
        System.out.println("State...: " + florentino.getAddress().getState());
        System.out.println("Zip Code..: " + florentino.getAddress().getZipCode());
        System.out.println("Country..: " + florentino.getAddress().getCountry());

        List<Reservation> temp = florentino.getReservations();
        for (Reservation reservation: temp){
            System.out.println(reservation);
        }


        Guest fermina = new Guest();
        fermina.setName("Fermina");
        fermina.setLastName("Daza");

        Guest atticus = new Guest("Atticus", "Finch");

        Guest gregor = new Guest("Gregor");
        gregor.setLastName("Samsa");

        System.out.println();
        System.out.println("Name...: " + fermina.getName());
        System.out.println("Last name...: " + fermina.getLastName());

        System.out.println();
        System.out.println("Name...: " + atticus.getName());
        System.out.println("Last name...: " + atticus.getLastName());

        System.out.println();
        System.out.println("Name...: " + gregor.getName());
        System.out.println("Last name...: " + gregor.getLastName());

    }
}
