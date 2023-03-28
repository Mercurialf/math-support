package database;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DataBaseConnectorTest {
    private final String expression = "-1.3*5/x=1.2";
    private final DataBaseConnector dataBaseConnector = new DataBaseConnector();

    @Test
    void addNewExpression() {
        String expectedResult = "The expression already exists in the database";
        assertEquals(dataBaseConnector.addNewExpression(expression), expectedResult);
    }

    @Test
    void getExpressions() {
        String unfinishedExpression = "-1.3*5/";
        assertEquals(String.valueOf(dataBaseConnector.getExpressions(unfinishedExpression).get(0)), expression);
    }
}