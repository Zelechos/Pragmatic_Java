package dev.jdbc.refactor;

import dev.jdbc.domain.Person;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class PersonDAO {

    private static final String SQL_SELECT = "SELECT id_person, name, lastname, email, phone FROM test.person";
    private static final String SQL_SELECT_BY_ID = "SELECT id_person, name, lastname, email, phone FROM test.person WHERE id_person = ?";
    private static final String SQL_INSERT = "INSERT INTO test.person(name, lastname, email, phone) VALUES(?, ?, ?, ?)";
    private static final String SQL_UPDATE = "UPDATE test.person SET name = ?, lastname = ?, email = ?, phone = ? WHERE (id_person = ?)";
    private static final String SQL_DELETE = "DELETE FROM test.person WHERE (id_person = ?)";


    public List<Person> getAll() throws SQLException {
        Connection connection = StandardConnection.getConnection("test");
        ResultSet resultSet = connection.prepareStatement(SQL_SELECT).executeQuery();
        List<Person> people = new ArrayList<>();
        while (resultSet.next()) {
            people.add(new Person(resultSet.getInt("id_person"),
                    resultSet.getString("name"),
                    resultSet.getString("lastname"),
                    resultSet.getString("email"),
                    resultSet.getString("phone")));
        }
        System.out.println("\033[32mDATA TRANSFER SUCCESSFULLY\033[0m");
        StandardConnection.close(connection);
        StandardConnection.close(resultSet);
        return people;
    }

    public void save(Person person) throws SQLException {
        Connection connection = StandardConnection.getConnection("test");
        PreparedStatement statement = connection.prepareStatement(SQL_INSERT);
        statement.setString(1, person.getName());
        statement.setString(2, person.getLastname());
        statement.setString(3, person.getEmail());
        statement.setString(4, person.getPhone());
        statement.executeUpdate();
        System.out.println("\033[32mSAVE SUCCESSFULLY\033[0m");
        StandardConnection.close(connection);
        StandardConnection.close(statement);
    }

    public void put(int id, Person person) throws SQLException {
        Connection connection = StandardConnection.getConnection("test");
        PreparedStatement statement = connection.prepareStatement(SQL_UPDATE);
        Person currentPerson = getPerson(id);
        statement.setString(1, person.getName() == null ? currentPerson.getName() : person.getName());
        statement.setString(2, person.getLastname() == null ? currentPerson.getLastname() : person.getLastname());
        statement.setString(3, person.getEmail() == null ? currentPerson.getEmail() : person.getEmail());
        statement.setString(4, person.getPhone() == null ? currentPerson.getPhone() : person.getPhone());
        statement.setInt(5, id);
        System.out.println("\033[32mUPDATE SUCCESSFULLY\033[0m");
        statement.executeUpdate();
        StandardConnection.close(connection);
        StandardConnection.close(statement);
    }

    public void delete(int id) throws SQLException {
        Connection connection = StandardConnection.getConnection("test");
        PreparedStatement statement = connection.prepareStatement(SQL_DELETE);
        statement.setInt(1, id);
        statement.executeUpdate();
        System.out.println("\033[32mDELETE SUCCESSFULLY\033[0m");
        StandardConnection.close(connection);
        StandardConnection.close(statement);
    }

    public Person getPerson(int id) throws SQLException {
        Connection connection = StandardConnection.getConnection("test");
        PreparedStatement statementUser = connection.prepareStatement(SQL_SELECT_BY_ID);
        statementUser.setInt(1, id);
        ResultSet resultSet = statementUser.executeQuery();
        resultSet.next();
        Person person = new Person(resultSet.getInt("id_person"),
                resultSet.getString("name"),
                resultSet.getString("lastname"),
                resultSet.getString("email"),
                resultSet.getString("phone"));
        StandardConnection.close(connection);
        StandardConnection.close(resultSet);
        return person;
    }
}
