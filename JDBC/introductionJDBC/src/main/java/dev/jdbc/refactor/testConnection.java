package dev.jdbc.refactor;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class testConnection {

    public static void main(String[] args) throws SQLException {

        Connection connection = StandardConnection.getConnection("test");
        Statement statement = connection.createStatement();
        var sql = "SELECT * FROM person";
        var insertSql = "INSERT INTO test.person(name, lastname, email, phone) VALUES('Alan', 'Turing', 'alant@parallel.dev', '394237924') ";

//        var sql = "SELECT * FROM language";
//        var insertSql = "INSERT INTO technologies.language(name, date) VALUES('JavaScript','1998-09-10') ";

        statement.execute(insertSql);
        ResultSet resultSet = statement.executeQuery(sql);


        while (resultSet.next()) {
            System.out.println("{ \nId Person : " + resultSet.getInt("id_person"));
            System.out.println("Name : " + resultSet.getString("name"));
            System.out.println("LastName : " + resultSet.getString("lastname"));
            System.out.println("Email : " + resultSet.getString("email"));
            System.out.println("Phone : " + resultSet.getString("phone") + "\n }");
            System.out.println("---------------------------------------------------------");
//            System.out.println("Id Language : " + resultSet.getInt("id_person"));
//            System.out.println("Name : " + resultSet.getString("name"));
//            System.out.println("Date of Creation : " + resultSet.getDate("date"));
//            System.out.println("---------------------------------------------------------");
        }

        StandardConnection.close(resultSet);
        StandardConnection.close(connection);
        StandardConnection.close(statement);

    }
}
