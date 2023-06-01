package dev.jdbc.refactor;

import java.sql.*;

public class StandardConnection {

    private static final String JDBC_USER = "root";
    private static final String JDBC_PASSWORD = "admin";
    private static final String PORT = "jdbc:mysql://localhost:3306/";
    private static final String USE_SSL = "?useSSL=false";
    private static final String USE_TIMEZONE = "&useTimezone=true";
    private static final String SERVER_TIMEZONE = "&serverTimezone=UTC";
    private static final String ALLOW_PUBLIC_KEY_RETRIEVAL = "&allowPublicKeyRetrieval=true";

    private static String setUrl(String db) {
        StringBuilder url = new StringBuilder(PORT);
        return url.append(db)
                .append(USE_SSL)
                .append(USE_TIMEZONE)
                .append(SERVER_TIMEZONE)
                .append(ALLOW_PUBLIC_KEY_RETRIEVAL)
                .toString();
    }

    public static Connection getConnection(String db) throws SQLException {
        return DriverManager.getConnection(setUrl(db), JDBC_USER, JDBC_PASSWORD);
    }

    public static void close(ResultSet resultSet) throws SQLException {
        resultSet.close();
    }


    public static void close(Statement statement) throws SQLException {
        statement.close();
    }


    public static void close(PreparedStatement preparedStatement) throws SQLException {
        preparedStatement.close();
    }


    public static void close(Connection connection) throws SQLException {
        connection.close();
    }
}
