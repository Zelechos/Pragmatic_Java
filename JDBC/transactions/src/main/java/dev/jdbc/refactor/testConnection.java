package dev.jdbc.refactor;

import dev.jdbc.domain.Person;

import java.sql.Connection;
import java.sql.SQLException;

public class testConnection {

    public static void main(String[] args) throws SQLException {

//        DAO --> Data Access Object

        Connection connection = StandardConnection.getConnection("test");

        if (connection.getAutoCommit()) {
            connection.setAutoCommit(false);
        }

        PersonDAO dao = new PersonDAO(connection);
        Person person = new Person();
        person.setName("Alex");
        person.setLastname("LanCaster");
        dao.put(8, person);
        dao.getAll().forEach(System.out::println);

        connection.commit();

    }
}
