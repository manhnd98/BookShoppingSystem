package repository;


import connector.PostgreConnector;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 * Base repository for CRUD functions
 * @param <T>: Entity Model
 */
public abstract class BaseRepository<T> {
    String tableName;
    Connection connection = null;

    public abstract T save(T entity);

    public void deleteById(int id) {

    }

    public void deleteMany(Iterable<? extends T> entities) {

    }

    public ResultSet getById(int id) {
        try {
            PreparedStatement statement = connection.prepareStatement("SELECT * FROM ? WHERE id = ?");
            statement.setString(1, tableName);
            statement.setInt(2, id);

            return statement.executeQuery();
        }catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

}
