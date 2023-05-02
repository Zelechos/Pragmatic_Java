package dev.jdbc;

import dev.jdbc.refactor.StandardConnection;

import java.sql.*;

public class Main {
    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/test?useSSL=false&useTimezone=true&serverTimezone=UTC&allowPublicKeyRetrieval=true";

        try {
//            Class.forName("com.mysql.cj.jdbc.Driver"); // para trabajar con aplicaciones web
            Connection connection = DriverManager.getConnection(url, "root", "admin");
            Statement instruction = connection.createStatement();
            var sql = "SELECT id_person, name, lastname, email, phone FROM person";
            ResultSet resultSet = instruction.executeQuery(sql);

            while (resultSet.next()) {
                System.out.println("{ \nId Person : " + resultSet.getInt("id_person"));
                System.out.println("Name : " + resultSet.getString("name"));
                System.out.println("LastName : " + resultSet.getString("lastname"));
                System.out.println("Email : " + resultSet.getString("email"));
                System.out.println("Phone : " + resultSet.getString("phone") + "\n }");
                System.out.println("---------------------------------------------------------");
            }

//            Cerramos todos los objetos y conexiones que hicimos
            resultSet.close();
            instruction.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace(System.out);
        }
    }
}