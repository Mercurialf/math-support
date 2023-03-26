package validation.modules;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CountingNumbersTest
{
    @Test
    void countingNumberInExpression() {
        String expression_one = "2+x+5=20";
        String expression_two = "-1.3*5/x=1.2";
        String expression_three = "x+(33-33/+33)=88";

        assertEquals(CountingNumbers.countingNumberInExpression(expression_one), 3);
        assertEquals(CountingNumbers.countingNumberInExpression(expression_two), 3);
        assertEquals(CountingNumbers.countingNumberInExpression(expression_three), 4);
    }
}