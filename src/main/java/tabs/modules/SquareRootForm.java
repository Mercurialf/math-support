package tabs.modules;

import config.Config;
import ui.Button;
import ui.TextArea;
import ui.TextField;

import javax.swing.*;
import java.util.ArrayList;

public class SquareRootForm extends JPanel
{
    private final TextField expressionTextField;
    private final TextArea resultTextArea;
    private final Button checkButton;

    public SquareRootForm() {
        expressionTextField = new TextField(20, new int[] {10, 10, 250, 30});
        resultTextArea = new TextArea(new int[] {10, 50, 400, 200});
        JScrollPane scrollPane = new JScrollPane(resultTextArea);
        scrollPane.setBounds(10, 50, 400, 200);
        checkButton = new Button("Search", new int[] {260, 10, 150, 30});

        this.setLayout(null);
        this.add(expressionTextField);
        this.add(scrollPane);
        this.add(checkButton);

        this.setBounds(430, 10, 500, 500);
        this.setSize(420, 260);
        this.setBackground(Config.BACKGROUND_COLOR);
        this.setVisible(true);
    }

    public Button getCheckButton() {
        return checkButton;
    }

    public TextField getExpressionTextField() {
        return expressionTextField;
    }

    public void setResultTextArea(ArrayList<String> expression) {
        StringBuilder result = new StringBuilder();

        for (String s : expression) {
            String temp = s + "\n";
            result.append(temp);
        }
        resultTextArea.setText(result.toString());
    }
}
