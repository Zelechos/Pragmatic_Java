package dev.jdbc.exercise;

import java.sql.SQLException;

public class TestUser {

    public static void main(String[] args) throws SQLException {

        UserDAO dao = new UserDAO();
        User user = new User("virus", "jnfv90384t03bf54703");
//        dao.save(user);

        dao.getAll().forEach(System.out::println);

//        dao.put(3, user);

        dao.delete(4);

        dao.getAll().forEach(System.out::println);

    }
}
