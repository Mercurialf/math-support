package database;

import java.sql.*;

public class DataBaseConnector
{
    private final String URL = "jdbc:mysql://localhost:3306/math_expression";
    private final String USERNAME = "root";
    private final String PASSWORD = "root";

    public DataBaseConnector() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException exception) {
            exception.printStackTrace();
        }
    }

    public void addNewExpression(String expression) {
        try {
            Connection connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            String query = "insert into math_expression.expression (expression) value (?);";
            PreparedStatement statement = connection.prepareStatement(query);

            statement.setString(1, expression);
            statement.executeUpdate();
            statement.close();
            connection.close();
        } catch (SQLException exception) {
            exception.printStackTrace();
        }
    }
}
