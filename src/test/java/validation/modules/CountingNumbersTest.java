package validation.modules;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CountingNumbersTest
{
    @Test
    void countingNumberInExpression() {
        String[] expression = {"2+x+5=20", "-1.3*5/x=1.2", "x+(33-33/+33)=88"};
        int[] ints = {3, 3, 4};

        for (int i = 0; i < expression.length; i++) {
            assertEquals(CountingNumbers.countingNumberInExpression(expression[i]), ints[i]);
        }
    }
}