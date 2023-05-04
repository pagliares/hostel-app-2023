import hostelapp.model.Guest;

public class GuestTest {
    public static void main(String[] args) {
        Guest florentino = new Guest();
        florentino.setName("Florentino");
        florentino.setLastName("Ariza");

        Guest fermina = new Guest();
        fermina.setName("Fermina");
        fermina.setLastName("Daza");

        Guest atticus = new Guest("Atticus", "Finch");

        Guest gregor = new Guest("Gregor");
        gregor.setLastName("Samsa");

        System.out.println("Name...: " + florentino.getName());
        System.out.println("Last name...: " + florentino.getLastName());

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
