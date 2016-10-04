package ua.epam.model;

/**
 * Created by Viktoriia_Marynchak on 9/30/2016.
 */
public class Personal {
    private int id;
    private String creditCard;
    private String passport;
    private String phone;
    private String address;

    /*public Personal() {
    }*/

    public Personal(int id, String creditCard, String passport, String phone, String address) {
        this.id = id;
        this.creditCard = creditCard;
        this.passport = passport;
        this.phone = phone;
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCreditCard() {
        return creditCard;
    }

    public void setCreditCard(String creditCard) {
        this.creditCard = creditCard;
    }

    public String getPassport() {
        return passport;
    }

    public void setPassport(String passport) {
        this.passport = passport;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
