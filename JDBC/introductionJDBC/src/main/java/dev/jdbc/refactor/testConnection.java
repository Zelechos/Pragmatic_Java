package dev.jdbc.refactor;

import dev.jdbc.domain.Person;

import java.sql.SQLException;

public class testConnection {

    public static void main(String[] args) throws SQLException {

//        Connection connection = StandardConnection.getConnection("test");
//        Statement statement = connection.createStatement();
//        var sql = "SELECT * FROM person";
//        var insertSql = "INSERT INTO test.person(name, lastname, email, phone) VALUES('JavaEE', 'JPA', 'jpa@parallel.dev', '21212121') ";

//        var sql = "SELECT * FROM language";
//        var insertSql = "INSERT INTO technologies.language(name, date) VALUES('JavaScript','1998-09-10') ";

//        statement.execute(insertSql);
//        ResultSet resultSet = statement.executeQuery(sql);

//        while (resultSet.next()) {
//            System.out.println("Id Language : " + resultSet.getInt("id_person"));
//            System.out.println("Name : " + resultSet.getString("name"));
////            System.out.println("Date of Creation : " + resultSet.getDate("date"));
//            System.out.println("---------------------------------------------------------");
//        }

//        StandardConnection.close(resultSet);
//        StandardConnection.close(connection);
//        StandardConnection.close(statement);


//        DAO --> Data Access Object
        PersonDAO dao = new PersonDAO();
        Person person = new Person("Cyber", "Punk", "2999", "3542374395");
        Person person1 = new Person();
        person1.setEmail("cyberpunk@reality.cyber");
        Person person2 = new Person();
        person2.setEmail("swartsz@reality.punk");

        dao.save(person); // to insert person in the DB

        dao.getAll().forEach(System.out::println);// to get all persons of DB

        System.out.println(dao.getPerson(8));
        System.out.println(dao.getPerson(11));

        dao.put(8, person1);
        dao.put(11, person2);

        System.out.println(dao.getPerson(8));
        System.out.println(dao.getPerson(11));

        dao.delete(6);

    }
}
