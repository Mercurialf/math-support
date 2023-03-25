package ui;

import config.Config;

import javax.swing.*;

public class TextField extends JTextField
{
    public TextField(int columns, int[] coordinates) {
        this.setColumns(columns);
        this.setFont(Config.STANDARD_FONT);
        this.setBounds(coordinates[0], coordinates[1], coordinates[2], coordinates[3]);
    }
}
