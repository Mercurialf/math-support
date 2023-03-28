package validation.modules;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class CorrectnessCheckTest
{
    @Test
    void check() {
        String[] resultExpression = {"The expression is correct.\n", "Expression is invalid!\n"};
        String[] correctExpression = {"2*x+5=17", "-1.3*5/x=1.2", "4*-7" };
        String[] incorrectExpression = {"3+*4", "33*5-*x=33", "x+(33-33/+33)=88"};

        for (String s : correctExpression) {
            assertEquals(CorrectnessCheck.check(s), resultExpression[0]);
        }

        for (String s : incorrectExpression) {
            assertEquals(CorrectnessCheck.check(s), resultExpression[1]);
        }
    }
}