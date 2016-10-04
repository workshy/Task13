package ua.epam.model;

import java.util.Date;

/**
 * Created by Viktoriia_Marynchak on 9/30/2016.
 */
public class Calendar {
    private int id;
    private Date dateIn;
    private Date dateOut;

    /*public Calendar() {
    }*/

    public Calendar(int id, Date dateIn, Date dateOut) {
        this.id = id;
        this.dateIn = dateIn;
        this.dateOut = dateOut;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDateIn() {
        return dateIn;
    }

    public void setDateIn(Date dateIn) {
        this.dateIn = dateIn;
    }

    public Date getDateOut() {
        return dateOut;
    }

    public void setDateOut(Date dateOut) {
        this.dateOut = dateOut;
    }
}
