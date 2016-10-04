package ua.epam.controller;

import ua.epam.model.*;

import java.sql.*;

/**
 * Created by Viktoriia_Marynchak on 9/30/2016.
 */
public class Controller {
    private Connection connection;
    private DataBase dataBase;

    public Controller() throws SQLException {
        this.connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "root", "root");
        this.dataBase = new DataBase();
    }

    public void create() throws SQLException {
        initGuest();
        initChildren();
        initPersonal();
        initCalendar();
        initRoom();
        initDescription();
        initView();
        initClassRoom();
    }

    private void initGuest() throws SQLException {
        try(PreparedStatement query = connection.prepareStatement("SELECT * FROM guest")) {
            ResultSet rs = query.executeQuery();
            while (rs.next()) {
                Guest guest = new Guest(rs.getInt("id"), rs.getString("first_name"), rs.getString("last_name"));
                dataBase.getGuests().add(guest);
            }
        }
    }

    private void initChildren() throws SQLException {
        try(PreparedStatement query = connection.prepareStatement("SELECT * FROM children")) {
            ResultSet rs = query.executeQuery();
            while (rs.next()) {
                Children children = new Children(rs.getInt("id"), rs.getString("first_name"), rs.getString("last_name"), rs.getInt("age"));
                dataBase.getChildrens().add(children);
            }
        }
    }

    private void initPersonal() throws SQLException {
        try(PreparedStatement query = connection.prepareStatement("SELECT * FROM personal")) {
            ResultSet rs = query.executeQuery();
            while (rs.next()) {
                Personal personal = new Personal(rs.getInt("id"), rs.getString("credit_card"), rs.getString("passport"),
                                                    rs.getString("phone"), rs.getString("address"));
                dataBase.getPersonals().add(personal);
            }
        }
    }

    private void initCalendar() throws SQLException {
        try(PreparedStatement query = connection.prepareStatement("SELECT * FROM calendar")) {
            ResultSet rs = query.executeQuery();
            while (rs.next()) {
                Calendar calendar = new Calendar(rs.getInt("id"), rs.getDate("date_in"), rs.getDate("date_out"));
                dataBase.getCalendars().add(calendar);
            }
        }
    }

    private void initRoom() throws SQLException {
        try(PreparedStatement query = connection.prepareStatement("SELECT * FROM room")) {
            ResultSet rs = query.executeQuery();
            while (rs.next()) {
                Room room = new Room(rs.getInt("id"), rs.getInt("room_number"), rs.getDouble("price"));
                dataBase.getRooms().add(room);
            }
        }
    }

    private void initDescription() throws SQLException {
        try(PreparedStatement query = connection.prepareStatement("SELECT * FROM description")) {
            ResultSet rs = query.executeQuery();
            while (rs.next()) {
                Description description = new Description(rs.getInt("id"), rs.getInt("capacity"), rs.getInt("quantity_of_rooms"),
                        rs.getInt("floor"), rs.getDouble("square_of_room"));
                dataBase.getDescriptions().add(description);
            }
        }
    }

    private void initView() throws SQLException {
        try(PreparedStatement query = connection.prepareStatement("SELECT * FROM view")) {
            ResultSet rs = query.executeQuery();
            while (rs.next()) {
                View view = new View(rs.getInt("id"), rs.getString("side"), rs.getString("photo"));
                dataBase.getViews().add(view);
            }
        }
    }

    private void initClassRoom() throws SQLException {
        try(PreparedStatement query = connection.prepareStatement("SELECT * FROM class")) {
            ResultSet rs = query.executeQuery();
            while (rs.next()) {
                ClassRoom classRoom = new ClassRoom(rs.getInt("id"), rs.getString("class_of_room"), rs.getString("description"));
                dataBase.getClassRooms().add(classRoom);
            }
        }
    }
}
