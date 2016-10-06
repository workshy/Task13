package ua.epam.dao.jdbs.mysql;

import ua.epam.dao.CalendarDao;
import ua.epam.dao.ChildrenDao;
import ua.epam.model.Calendar;
import ua.epam.model.Children;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Viktoriia_Marynchak on 10/4/2016.
 */
public class MySqlChildenDao implements ChildrenDao {
    private static final String SELECT_ALL_CHILDREN = "SELECT * FROM children";
    private static final String SELECT_CHILDREN_BY_ID = "SELECT * FROM children WHERE children.id = ?";
    private static final String DELETE = "DELETE FROM children WHERE id = ?";
    private static final String INSERT_INTO = "INSERT INTO children (first_name, last_name, age, id_guest) VALUES (?, ?, ?, ?)";
    private static final String UPDATE = "UPDATE children SET first_name = ?, last_name = ?, age = ?, id_guest = ? WHERE id = ?";

    @Override
    public Children find(int id) {
        Connection connection =  MySqlJdbcDaoFactory.getConnection();
        Children result;

        try(PreparedStatement query = connection.prepareStatement(SELECT_CHILDREN_BY_ID)){
            query.setInt(1, id);
            ResultSet rs = query.executeQuery();
            result = getChildrenFromResultSet(rs);
        }catch(Exception ex){
            throw new RuntimeException(ex);
        }

        return result;
    }

    @Override
    public List<Children> findAll() throws Exception {
        List<Children> result = new ArrayList<>();
        Connection connection =  MySqlJdbcDaoFactory.getConnection();
        try(Statement query = connection.createStatement()){

            ResultSet rs = query.executeQuery(SELECT_ALL_CHILDREN);
            while( rs.next() ){
                result.add(getChildrenFromResultSet(rs));
            }
        }catch(Exception ex){
            throw new RuntimeException(ex);
        }
        return result;
    }

    private Children getChildrenFromResultSet(ResultSet resultSet) throws SQLException {
        Children children = new Children();
        children.setId(resultSet.getInt("id"));
        children.setFirstName(resultSet.getString("first_name"));
        children.setLastName(resultSet.getString("last_name"));
        children.setAge(resultSet.getInt("age"));
        return children;
    }

    @Override
    public void update(Children entity) {
        Connection connection =  MySqlJdbcDaoFactory.getConnection();

        try(PreparedStatement query = connection.prepareStatement(UPDATE)){
            query.setString(1, entity.getFirstName());
            query.setString(2, entity.getLastName());
            query.setInt(3, entity.getAge());
            query.setInt(4, entity.getIdGuest());
            query.setInt(5, entity.getId());
        }catch(Exception ex){
            throw new RuntimeException(ex);
        }
    }

    @Override
    public void delete(int id) throws Exception {
        Connection connection =  MySqlJdbcDaoFactory.getConnection();

        try(PreparedStatement query = connection.prepareStatement(DELETE)){
            query.setInt(1, id);

            int result = query.executeUpdate();
        }catch(Exception ex){
            throw new RuntimeException(ex);
        }

    }

    @Override
    public void insert(Children entity) {
        Connection connection =  MySqlJdbcDaoFactory.getConnection();

        try(PreparedStatement query = connection.prepareStatement(INSERT_INTO)){
            query.setString(1, entity.getFirstName());
            query.setString(2, entity.getLastName());
            query.setInt(3, entity.getAge());
            query.setInt(4, entity.getIdGuest());

            boolean result = query.execute();
        }catch(Exception ex){
            throw new RuntimeException(ex);
        }
    }
}
