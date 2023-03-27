package validation.modules;

import config.Config;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CorrectnessCheck
{
    public static boolean check(String expression) {
        Pattern pattern = Pattern.compile(Config.MAIN_PATTERN);
        Matcher matcher = pattern.matcher(expression);
        return matcher.matches();
    }
}
