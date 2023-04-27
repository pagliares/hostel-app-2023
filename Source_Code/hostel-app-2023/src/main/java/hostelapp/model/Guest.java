package hostelapp.model;
public class Guest {
    private String name = "";
    private String lastName;

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
