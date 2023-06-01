package dev.jdbc.exercise.data;

import dev.jdbc.exercise.dto.UserDTO;

import java.sql.SQLException;
import java.util.List;

public interface UserDAO {

    void save(UserDTO user) throws SQLException;

    List<UserDTO> getAll() throws SQLException;

    void put(int id, UserDTO user) throws SQLException;

    void delete(int id) throws SQLException;

    UserDTO getUserById(int id) throws SQLException;
}
