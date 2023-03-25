package ui;

import config.Config;

import javax.swing.*;

public class TextArea extends JTextArea
{
    public TextArea(int[] coordinates) {
        this.setBounds(coordinates[0], coordinates[1], coordinates[2], coordinates[3]);
        this.setEditable(false);
        this.setFont(Config.STANDARD_FONT);
    }
}
