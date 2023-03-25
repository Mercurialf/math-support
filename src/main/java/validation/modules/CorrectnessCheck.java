package validation.modules;

import config.Config;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CorrectnessCheck
{
    public static boolean check(String expression) {
        String patternExample = Config.MAIN_PATTERN;
        Pattern pattern = Pattern.compile(patternExample);
        Matcher matcher = pattern.matcher(expression);

        return matcher.matches();
    }
}
