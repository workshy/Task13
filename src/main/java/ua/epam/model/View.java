package ua.epam.model;

/**
 * Created by Viktoriia_Marynchak on 9/30/2016.
 */
public class View {
    private int id;
    private String side;
    private String photo;

    /*public View() {
    }*/

    public View(int id, String side, String photo) {
        this.id = id;
        this.side = side;
        this.photo = photo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSide() {
        return side;
    }

    public void setSide(String side) {
        this.side = side;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }
}
