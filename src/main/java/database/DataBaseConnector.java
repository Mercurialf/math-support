package database;

import java.sql.*;
import java.util.ArrayList;

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

    private boolean checkExistsExpression(String expression) {
        boolean searchResult = false;

        try {
            Connection connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            Statement statement = connection.createStatement();
            String query = "select * from math_expression.expression where expression='" + expression + "'";
            ResultSet resultSet = statement.executeQuery(query);

            searchResult = resultSet.next();

            resultSet.close();
            statement.close();
            connection.close();
        } catch (SQLException exception) {
            exception.printStackTrace();
        }

        return searchResult;
    }

    public String addNewExpression(String expression) {
        String operationResult = "";
        if (checkExistsExpression(expression))
            return "The expression already exists in the database";

        try {
            Connection connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            String query = "insert into math_expression.expression (expression) value (?);";
            PreparedStatement statement = connection.prepareStatement(query);

            statement.setString(1, expression);
            statement.executeUpdate();
            operationResult += "Expression added to database";

            statement.close();
            connection.close();
        } catch (SQLException exception) {
            exception.printStackTrace();
        }
        return operationResult;
    }

    public ArrayList<String> getExpressions(String searchString) {
        ArrayList<String> result = new ArrayList<>();

        try {
            Connection connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            PreparedStatement preparedStatement = connection.
                    prepareStatement("select * from expression where expression like ?");
            preparedStatement.setString(1, "%" + searchString + "%");
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                String expression = resultSet.getString("expression");
                result.add(expression);
            }

            resultSet.close();
            preparedStatement.close();
            connection.close();

        } catch (SQLException exception) {
            exception.printStackTrace();
        }
        return result;
    }
}
