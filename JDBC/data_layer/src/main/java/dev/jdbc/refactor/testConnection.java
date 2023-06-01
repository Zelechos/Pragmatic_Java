package dev.jdbc.refactor;

import java.sql.Connection;
import java.sql.SQLException;

public class testConnection {

    public static void main(String[] args) throws SQLException {

//        DAO --> Data Access Object

        Connection connection = StandardConnection.getConnection("test");

        if (connection.getAutoCommit()) {
            connection.setAutoCommit(false);
        }

        PersonDAO dao = new PersonJDBC(connection);
        dao.getAll().forEach(System.out::println);

        connection.commit();

    }
}
