package validation.modules;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ParenthesesCheckTest
{
    @Test
    void check() {
        String expression_one = "2*x+5=17";
        String expression_two = "-1.3*5/x=1.2";
        String expression_three = "(3+3)=6";
        String expression_four = "33-5)*5=140";
        String expression_five = "-x*23+(100-1=300";
        String expression_six = "(50 + 50) + 31 - 30)=101";

        assertTrue(ParenthesesCheck.check(expression_one));
        assertTrue(ParenthesesCheck.check(expression_two));
        assertTrue(ParenthesesCheck.check(expression_three));

        assertFalse(ParenthesesCheck.check(expression_four));
        assertFalse(ParenthesesCheck.check(expression_five));
        assertFalse(ParenthesesCheck.check(expression_six));
    }
}