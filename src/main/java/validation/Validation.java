package validation;

import database.DataBaseConnector;
import validation.modules.CharacterCheck;
import validation.modules.CorrectnessCheck;
import validation.modules.CountingNumbers;
import validation.modules.ParenthesesCheck;

public class Validation
{
    public static String validation(String expression) {
        String result = "";
        boolean parenthesesCheckResult = ParenthesesCheck.check(expression);
        boolean characterCheckResult = CharacterCheck.check(expression);

        if (parenthesesCheckResult) {
            result += "Parentheses are placed correctly.\n";
        } else {
            result += "Parentheses are placed incorrectly!\n";
        }

        if (characterCheckResult) {
            result += "All characters are correct.\n";
        } else {
            result += "Not all characters are correct!\n";
        }

        result += CorrectnessCheck.check(expression);

        if (parenthesesCheckResult & characterCheckResult) {
            DataBaseConnector dataBaseConnector = new DataBaseConnector();
            result += dataBaseConnector.addNewExpression(expression);
        }

        return (result + "\nNumber of numbers in expression:" + CountingNumbers.countingNumberInExpression(expression));
    }
}
