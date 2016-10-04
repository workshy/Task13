package ua.epam.model;

/**
 * Created by Viktoriia_Marynchak on 9/30/2016.
 */
public class Guest {
    private int id;
    private String firstName;
    private String lastName;

    /*public Guest() {
    }*/

    public Guest(int id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
