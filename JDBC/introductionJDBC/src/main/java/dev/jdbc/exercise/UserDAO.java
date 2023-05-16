package dev.jdbc.exercise;

import dev.jdbc.refactor.StandardConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UserDAO {


    /**
     * Query to User Table
     */

    private static final String MYSQL_DB = "test";
    private static final String SQL_SELECT = "SELECT id_user, user, password FROM test.user";
    private static final String SQL_SELECT_BY_ID = "SELECT id_user, user, password FROM test.user WHERE id_user = ?";
    private static final String SQL_INSERT = "INSERT INTO test.user(user, password) VALUES(?, ?)";
    private static final String SQL_UPDATE = "UPDATE test.user SET user = ?, password = ? WHERE (id_user = ?)";
    private static final String SQL_DELETE = "DELETE FROM test.user WHERE (id_user = ?)";


    public void save(User user) throws SQLException {
        Connection connection = StandardConnection.getConnection(MYSQL_DB);
        PreparedStatement statement = connection.prepareStatement(SQL_INSERT);
        statement.setString(1, user.getUser());
        statement.setString(2, user.getPassword());
        statement.executeUpdate();
        System.out.println("\033[32mSAVE SUCCESSFULLY\033[0m");
        StandardConnection.close(connection);
        StandardConnection.close(statement);
    }

    public List<User> getAll() throws SQLException {
        Connection connection = StandardConnection.getConnection(MYSQL_DB);
        ResultSet resultSet = connection.prepareStatement(SQL_SELECT).executeQuery();
        List<User> users = new ArrayList<>();
        while (resultSet.next()) {
            users.add(new User(resultSet.getInt("id_user"),
                    resultSet.getString("user"),
                    resultSet.getString("password")
            ));
        }
        System.out.println("\033[32mDATA TRANSFER SUCCESSFULLY\033[0m");
        StandardConnection.close(connection);
        StandardConnection.close(resultSet);
        return users;
    }

    public void put(int id, User user) throws SQLException {
        Connection connection = StandardConnection.getConnection(MYSQL_DB);
        PreparedStatement preparedStatement = connection.prepareStatement(SQL_UPDATE);
        User currentUser = getUser(id);
        preparedStatement.setString(1, user.getUser() == null ? currentUser.getUser(): user.getUser());
        preparedStatement.setString(2, user.getPassword() == null ? currentUser.getPassword(): user.getPassword());
        preparedStatement.setInt(3, id);
        System.out.println("\033[32mUPDATE SUCCESSFULLY\033[0m");
        preparedStatement.executeUpdate();
        StandardConnection.close(connection);
        StandardConnection.close(preparedStatement);
    }

    public void delete(int id) throws SQLException {
        Connection connection = StandardConnection.getConnection(MYSQL_DB);
        PreparedStatement statement = connection.prepareStatement(SQL_DELETE);
        statement.setInt(1, id);
        statement.executeUpdate();
        System.out.println("\033[32mDELETE SUCCESSFULLY\033[0m");
        StandardConnection.close(connection);
        StandardConnection.close(statement);
    }

    public User getUser(int id) throws SQLException {
        Connection connection = StandardConnection.getConnection(MYSQL_DB);
        PreparedStatement preparedStatement = connection.prepareStatement(SQL_SELECT_BY_ID);
        preparedStatement.setInt(1, id);
        ResultSet resultSet = preparedStatement.executeQuery();
        resultSet.next();
        User user =  new User(resultSet.getString("user"), resultSet.getString("password"));
        StandardConnection.close(connection);
        StandardConnection.close(preparedStatement);
        StandardConnection.close(resultSet);
        return user;
    }

}
