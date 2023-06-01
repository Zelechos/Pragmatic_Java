package dev.jdbc.exercise;

import dev.jdbc.exercise.data.UserDAO;
import dev.jdbc.exercise.data.UserDaoJDBC;
import dev.jdbc.exercise.dto.UserDTO;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Scanner;

public class TestUserConnection {

    public static void main(String[] args) throws SQLException {

        Connection connection = StandardConnection.getConnection("test");
        UserDAO dao = new UserDaoJDBC(connection);

        int option;
        int id;
        String response, user, password;
        UserDTO userDTO;

        do {
            System.out.println(
                    """
                    1 .- create user
                    2 .- update user
                    3 .- show user by id
                    4 .- show users
                    5 .- delete user
                    0 .- exit
                    """
            );
            System.out.print("select one option : ");

            Scanner input = new Scanner(System.in);
            option = input.nextInt();

            switch (option) {

                case 0 -> System.out.println("\033[32mFINISH PROGRAM\033[0m");
                case 1 -> {

                    System.out.print("insert a user : ");
                    user = input.next();
                    System.out.print("insert a password : ");
                    password = input.next();
                    userDTO = new UserDTO(user, password);
                    dao.save(userDTO);
                }
                case 2 -> {
                    System.out.print("insert a id : ");
                    id = input.nextInt();
                    userDTO = new UserDTO();
                    System.out.println("do you want insert a new user? (Y/N)");
                    response = input.next();
                    if (response.equalsIgnoreCase("Y")) {
                        System.out.print("insert a new user : ");
                        user = input.next();
                        userDTO.setUser(user);
                    }
                    System.out.println("do you want insert a new password? (Y/N)");
                    response = input.next();
                    if (response.equalsIgnoreCase("Y")) {
                        System.out.print("insert a  new password : ");
                        password = input.next();
                        userDTO.setPassword(password);
                    }
                    if (userDTO.getUser() != null || userDTO.getPassword() != null) dao.put(id, userDTO);
                    System.out.println("NOTHING TO UPDATE");
                }
                case 3 -> {
                    System.out.print("insert a id to show the user: ");
                    id = input.nextInt();
                    dao.getUserById(id);
                }
                case 4 -> dao.getAll().forEach(System.out::println);
                case 5 -> {
                    System.out.print("insert a id to delete one user: ");
                    id = input.nextInt();
                    dao.delete(id);
                }
                default -> System.out.println("option is not valid");
            }

        } while (option != 0);

    }
}
