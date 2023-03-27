package validation.modules;

import config.Config;

public class CharacterCheck {
    public static boolean check(String expression) {
        return expression.matches(Config.REGULAR_CHARACTER_PATTERN);
    }
}
