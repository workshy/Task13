package ua.epam.dao.jdbs.mysql;

import ua.epam.dao.*;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

/**
 * Created by Viktoriia_Marynchak on 10/4/2016.
 */
public class MySqlJdbcDaoFactory extends DaoFactory {
    private static final String DB_CONFIG_FILE_NAME = "/db.properties";
    private static final String DB_USER = "db.user";
    private static final String DB_PASS = "db.pass";
    private static final String DB_URL = "db.url";

    private static Connection connection ;

    static Connection getConnection(){
        try{
            if( connection == null ){
                InputStream in = MySqlJdbcDaoFactory
                        .class.getResourceAsStream(DB_CONFIG_FILE_NAME);
                Properties props = new Properties();
                props.load(in);
                connection =  DriverManager
                        .getConnection( props.getProperty(DB_URL) ,
                                props.getProperty(DB_USER),
                                props.getProperty(DB_PASS));
            }
            return connection;
        }catch(Exception ex){
            throw new RuntimeException( ex );
        }
    }


    @Override
    public GuestDao createGuestDao() {
        return null;
    }

    @Override
    public ChildrenDao createChildrenDao() {
        return new MySqlChildenDao();
    }

    @Override
    public PersonalDao createPersonalDao() {
        return null;
    }

    @Override
    public CalendarDao createCalendarDao() {
        return null;
    }

    @Override
    public RoomDao createRoomDao() {
        return null;
    }

    @Override
    public DescriptionDao createDescriptionDao() {
        return null;
    }

    @Override
    public ViewDao createViewDao() {
        return null;
    }

    @Override
    public ClassRoomDao createClassRoomDao() {
        return null;
    }
}
