package config;

import java.awt.*;

public class Config
{
    public final static int WINDOW_WIDTH = 880;
    public final static int WINDOW_HEIGHT = 320;
    public final static Font STANDARD_FONT = new Font("Tahoma", Font.BOLD, 16);
    public final static Color BACKGROUND_COLOR = new Color(0xEFC8BB);
    public final static String MAIN_PATTERN = "^(?:(?:[-+]?\\d+(?:\\.\\d+)?|\\w+)\\s*" +
            "(?:[-+*/]\\s*(?:[-+]?\\d+(?:\\.\\d+)?|\\w+)\\s*)*[=]\\s*" +
            "(?:[-+]?\\d+(?:\\.\\d+)?|\\w+)\\s*)$";
    public final static String СOUNT_PATTERN = "-?\\d+(\\.\\d+)?";
}
