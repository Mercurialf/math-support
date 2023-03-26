package validation.modules;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;


class CorrectnessCheckTest
{
    @Test
    void check() {
        String expression_one = "2*x+5=17";
        String expression_two = "-1.3*5/x=1.2";
        String expression_three = "4*-7";

        String expression_four = "3+*4";
        String expression_five = "33*5-*x=33";
        String expression_six = "x+(33-33/+33)=88";

        assertTrue(CorrectnessCheck.check(expression_one));
        assertTrue(CorrectnessCheck.check(expression_two));
        assertTrue(CorrectnessCheck.check(expression_three));

        assertFalse(CorrectnessCheck.check(expression_four));
        assertFalse(CorrectnessCheck.check(expression_five));
        assertFalse(CorrectnessCheck.check(expression_six));
    }
}