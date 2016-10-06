package ua.epam.dao;

import ua.epam.model.Personal;

/**
 * Created by Viktoriia_Marynchak on 10/4/2016.
 */
public abstract class DaoFactory {
    public abstract GuestDao createGuestDao();
    public abstract ChildrenDao createChildrenDao();
    public abstract PersonalDao createPersonalDao();
    public abstract CalendarDao createCalendarDao();
    public abstract RoomDao createRoomDao();
    public abstract DescriptionDao createDescriptionDao();
    public abstract ViewDao createViewDao();
    public abstract ClassRoomDao createClassRoomDao();

    public static DaoFactory getInstance(){
        String factoryClassName = "ua.epam.dao.jdbs.mysql.MySqlJdbcDaoFactory";
        try {
            return (DaoFactory) Class.forName(factoryClassName)
                    .newInstance();
        } catch (Exception e) {
            //log
            throw new RuntimeException(e);
        }
    }
}
