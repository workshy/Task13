package ua.epam.model;

/**
 * Created by Viktoriia_Marynchak on 9/30/2016.
 */
public class Children {
    private int id;
    private String firstName;
    private String lastName;
    private int age;
    private int idGuest;

    public Children() {
    }

    public Children(int id, String firstName, String lastName, int age, int idGuest) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.idGuest = idGuest;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getIdGuest() {
        return idGuest;
    }

    public void setIdGuest(int idGuest) {
        this.idGuest = idGuest;
    }

    @Override
    public String toString() {
        return "Children{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", idGuest=" + idGuest +
                '}';
    }
}
