package validation.modules;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CharacterCheckTest {

    @Test
    void check() {
        String[] correctExpression = {"2*x+5=17", "-1.3*5/x=1.2", "4*-7" };
        String[] incorrectExpression = {"3+*4f", "33*5-*y=33", "x+(33-33/$+33)=88"};

        for (String s : correctExpression) {
            assertTrue(CharacterCheck.check(s));
        }

        for (String s : incorrectExpression) {
            assertFalse(CharacterCheck.check(s));
        }
    }
}