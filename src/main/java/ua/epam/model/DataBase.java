package ua.epam.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Viktoriia_Marynchak on 9/30/2016.
 */
public class DataBase {
    private List<Guest> guest;
    private List<Children> children;
    private List<Personal> personal;
    private List<Calendar> calendar;
    private List<Room> room;
    private List<Description> description;
    private List<View> view;
    private List<ClassRoom> classRoom;

    public DataBase() {
        guest = new ArrayList<Guest>();
        children = new ArrayList<Children>();
        personal = new ArrayList<Personal>();
        calendar = new ArrayList<Calendar>();
        room = new ArrayList<Room>();
        description = new ArrayList<Description>();
        view = new ArrayList<View>();
        classRoom = new ArrayList<ClassRoom>();
    }

    public List<Guest> getGuests() {
        return guest;
    }

    public void setGuests(List<Guest> guests) {
        this.guest = guests;
    }

    public List<Children> getChildrens() {
        return children;
    }

    public void setChildrens(List<Children> childrens) {
        this.children = childrens;
    }

    public List<Personal> getPersonals() {
        return personal;
    }

    public void setPersonals(List<Personal> personals) {
        this.personal = personals;
    }

    public List<Calendar> getCalendars() {
        return calendar;
    }

    public void setCalendars(List<Calendar> calendars) {
        this.calendar = calendars;
    }

    public List<Room> getRooms() {
        return room;
    }

    public void setRooms(List<Room> rooms) {
        this.room = rooms;
    }

    public List<Description> getDescriptions() {
        return description;
    }

    public void setDescriptions(List<Description> descriptions) {
        this.description = descriptions;
    }

    public List<View> getViews() {
        return view;
    }

    public void setViews(List<View> views) {
        this.view = views;
    }

    public List<ClassRoom> getClassRooms() {
        return classRoom;
    }

    public void setClassRooms(List<ClassRoom> classRooms) {
        this.classRoom = classRooms;
    }
}


