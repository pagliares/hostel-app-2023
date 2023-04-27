import hostelapp.model.Guest;

public class GuestTest {
    public static void main(String[] args) {
        Guest florentino = new Guest();

        boolean resultado = florentino.setName("Florentino");
        if (resultado)
            System.out.println("Hóspede cadastrado com sucesso");
        else
            System.out.println("O nome deve ter mais que 2 caracteres");
        florentino.setLastName("Ariza");

        Guest fermina = new Guest();
        fermina.setName("Fermina");
        fermina.setLastName("Daza");

        System.out.println("Name...: " + florentino.getName());
        System.out.println("Surname...: " + florentino.getLastName());
        System.out.println();
        System.out.println("Name...: " + fermina.getName());
        System.out.println("Surname...: " + fermina.getLastName());

    }
}
