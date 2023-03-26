package validation;

import validation.modules.CorrectnessCheck;
import validation.modules.CountingNumbers;
import validation.modules.ParenthesesCheck;

public class Validation
{
    public static String validation(String expression) {
        String result = "";

        if (ParenthesesCheck.check(expression)) {
            result += "Parentheses are placed correctly.\n";
        } else {
            result += "Parentheses are placed incorrectly!\n";
        }

        if (CorrectnessCheck.check(expression)) {
            result += "The expression is correct.\n";
        } else {
            result += "Expression is invalid!\n";
        }

        result += "Number of numbers in expression:" + CountingNumbers.countingNumberInExpression(expression);
        return result;
    }
}
