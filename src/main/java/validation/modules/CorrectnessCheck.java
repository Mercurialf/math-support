package validation.modules;

import config.Config;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CorrectnessCheck
{
    public static String check(String expression) {
        Pattern pattern = Pattern.compile(Config.MAIN_PATTERN);
        Matcher matcher = pattern.matcher(expression);

        if (matcher.matches()) {
            return "The expression is correct.\n";
        } else {
            return "Expression is invalid!\n";
        }
    }
}
