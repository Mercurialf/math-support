package validation.modules;

import config.Config;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CountingNumbers
{
    public static int countingNumberInExpression(String expression) {
        int count = 0;

        Pattern pattern = Pattern.compile(Config.СOUNT_PATTERN);
        Matcher matcher = pattern.matcher(expression);

        while (matcher.find())
            count++;

        return count;
    }
}
