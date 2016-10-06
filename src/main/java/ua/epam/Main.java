package ua.epam;

import ua.epam.controller.Controller;
import ua.epam.dao.ChildrenDao;
import ua.epam.dao.DaoFactory;
import ua.epam.model.Children;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws Exception {
        /*Controller controller = new Controller();

        controller.create();*/


        ChildrenDao dao = DaoFactory.getInstance().createChildrenDao();
        //List<Children> c = dao.findAll();
        Children child = new Children(5, "Emmy", "Cooper", 16, 2);
        /*dao.insert(child);
        dao.delete(6);
        dao.insert(child);*/
        //child.setFirstName("Ann");
        dao.update(child);
        //Children a = dao.find(6);
        //dao.delete(1);

    }
}
