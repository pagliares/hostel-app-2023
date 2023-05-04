package hostelapp.model;
public class Guest {
    private String name;
    private String lastName;

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
}
