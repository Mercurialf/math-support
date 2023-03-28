package validation.modules;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ParenthesesCheckTest
{
    @Test
    void check() {
        String[] correctExpression = {"2*x+5=17", "-1.3*5/x=1.2", "(3+3)=6"};
        String[] incorrectExpression = {"33-5)*5=140", "-x*23+(100-1=300", "(50 + 50) + 31 - 30)=101"};

        for (String s : correctExpression) {
            assertTrue(ParenthesesCheck.check(s));
        }

        for (String s : incorrectExpression) {
            assertFalse(ParenthesesCheck.check(s));
        }
    }
}