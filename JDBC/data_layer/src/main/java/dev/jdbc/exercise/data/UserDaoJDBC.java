package dev.jdbc.exercise.data;

import dev.jdbc.exercise.dto.UserDTO;
import dev.jdbc.refactor.StandardConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UserDaoJDBC implements UserDAO {

    //  QUERIES
    private static final String SQL_SELECT = "SELECT id_user, user, password FROM test.user";
    private static final String SQL_SELECT_BY_ID = "SELECT id_user, user, password FROM test.user WHERE(id_user = ?)";
    private static final String SQL_INSERT = "INSERT INTO test.user(id_user, user, password) VALUES(?, ?, ?)";
    private static final String SQL_UPDATE = "UPDATE test.user SET user = ?, password = ? WHERE(id_user = ?)";
    private static final String SQL_DELETE = "DELETE FROM test.user WHERE(id_user = ?)";
    private Connection transactionalConnection;

    public UserDaoJDBC() {
    }

    public UserDaoJDBC(Connection transactionalConnection) {
        this.transactionalConnection = transactionalConnection;
    }

    @Override
    public void save(UserDTO user) throws SQLException {
        Connection connection = this.transactionalConnection != null ? this.transactionalConnection : StandardConnection.getConnection("test");
        PreparedStatement statement = connection.prepareStatement(SQL_INSERT);
        statement.setString(1, user.getUser());
        statement.setString(2, user.getPassword());
        statement.executeUpdate();
        System.out.println("\033[32mSAVE SUCCESSFULLY\033[0m");
        if (this.transactionalConnection == null) {
            StandardConnection.close(connection);
        }
        StandardConnection.close(statement);
    }

    @Override
    public List<UserDTO> getAll() throws SQLException {
        Connection connection = this.transactionalConnection != null ? this.transactionalConnection : StandardConnection.getConnection("test");
        ResultSet resultSet = connection.prepareStatement(SQL_SELECT).executeQuery();
        List<UserDTO> users = new ArrayList<>();
        while (resultSet.next()) {
            users.add(new UserDTO(resultSet.getInt("id_user"),
                    resultSet.getString("user"),
                    resultSet.getString("password")));
        }
        System.out.println("\033[32mDATA TRANSFER SUCCESSFULLY\033[0m");
        if (this.transactionalConnection == null) {
            StandardConnection.close(connection);
        }
        StandardConnection.close(resultSet);
        return users;
    }

    @Override
    public void put(int id, UserDTO user) throws SQLException {
        Connection connection = this.transactionalConnection != null ? this.transactionalConnection : StandardConnection.getConnection("test");
        PreparedStatement statement = connection.prepareStatement(SQL_UPDATE);
        UserDTO currentUser = getUserById(id);
        statement.setString(1, user.getUser() == null ? currentUser.getUser() : user.getUser());
        statement.setString(2, user.getPassword() == null ? currentUser.getPassword() : user.getPassword());
        statement.setInt(3, id);
        statement.executeUpdate();
        System.out.println("\033[32mUPDATE SUCCESSFULLY\033[0m");
        if (this.transactionalConnection == null) {
            StandardConnection.close(connection);
        }
        StandardConnection.close(statement);
    }

    @Override
    public void delete(int id) throws SQLException {
        Connection connection = this.transactionalConnection != null ? this.transactionalConnection : StandardConnection.getConnection("test");
        PreparedStatement statement = connection.prepareStatement(SQL_DELETE);
        statement.setInt(1, id);
        statement.executeUpdate();
        System.out.println("\033[32mDELETE SUCCESSFULLY\033[0m");
        if (this.transactionalConnection == null) {
            StandardConnection.close(connection);
        }
        StandardConnection.close(statement);
    }

    @Override
    public UserDTO getUserById(int id) throws SQLException {
        Connection connection = this.transactionalConnection != null ? this.transactionalConnection : StandardConnection.getConnection("test");
        PreparedStatement statementUser = connection.prepareStatement(SQL_SELECT_BY_ID);
        statementUser.setInt(1, id);
        ResultSet resultSet = statementUser.executeQuery();
        resultSet.next();
        UserDTO user = new UserDTO(resultSet.getInt("id_user"),
                resultSet.getString("user"),
                resultSet.getString("password"));
        if (this.transactionalConnection == null) {
            StandardConnection.close(connection);
        }
        StandardConnection.close(resultSet);
        return user;
    }
}
