package validation;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidationTest {

    @Test
    void validation() {
        String[] correctExpression = {
                "Parentheses are placed correctly.\n" +
                "All characters are correct.\n" +
                "The expression is correct.\n" +
                "The expression already exists in the database\n" +
                "Number of numbers in expression:3",
                "-1.3*5/x=1.2"
        };
        String[] incorrectExpression = {
                "Parentheses are placed incorrectly!\n" +
                "All characters are correct.\n" +
                "Expression is invalid!\n" +
                "\n" +
                "Number of numbers in expression:3",
                "85-(55*x))=0"
        };

        String[] incorrectCharacters = {
                "Parentheses are placed correctly.\n" +
                "Not all characters are correct!\n" +
                "Expression is invalid!\n" +
                "\n" +
                "Number of numbers in expression:1",
                "x*y=√50"};

        assertEquals(Validation.validation(correctExpression[1]), correctExpression[0]);
        assertEquals(Validation.validation(incorrectExpression[1]), incorrectExpression[0]);
        assertEquals(Validation.validation(incorrectCharacters[1]), incorrectCharacters[0]);
    }
}