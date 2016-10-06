package ua.epam.dao;

import java.util.List;

/**
 * Created by Viktoriia_Marynchak on 10/4/2016.
 */
public interface GenericDao<T> {
    T find(int id);
    List<T> findAll() throws Exception;
    void update(T entity);
    void delete(int id) throws Exception;
    void insert(T entity);
}
