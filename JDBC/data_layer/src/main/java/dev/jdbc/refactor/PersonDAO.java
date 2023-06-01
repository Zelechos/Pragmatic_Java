package dev.jdbc.refactor;

import dev.jdbc.domain.Person;

import java.sql.SQLException;
import java.util.List;

public interface PersonDAO {

    void save(Person person) throws SQLException;

    List<Person> getAll() throws SQLException;

    void put(int id, Person person) throws SQLException;

    void delete(int id) throws SQLException;

    Person getPerson(int id) throws SQLException;
}
