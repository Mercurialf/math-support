package ui;

import config.Config;

import javax.swing.*;

public class Button extends JButton
{
    public Button(String text, int[] coordinates) {
        this.setText(text);
        this.setFont(Config.STANDARD_FONT);
        this.setBounds(coordinates[0], coordinates[1], coordinates[2], coordinates[3]);
        this.setFocusable(false);
    }
}
