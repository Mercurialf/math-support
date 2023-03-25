package tabs.modules;

import config.Config;
import ui.Button;
import ui.TextArea;
import ui.TextField;

import javax.swing.*;

public class ExpressionCheckForm extends JPanel
{
    private final TextField expressionTextField;
    private final TextArea resultTextArea;
    private final Button checkButton;

    public ExpressionCheckForm() {
        expressionTextField = new TextField(20, new int[] {10, 10, 250, 30});
        resultTextArea = new TextArea(new int[] {10, 50, 400, 200});
        checkButton = new Button("Check", new int[] {260, 10, 150, 30});

        this.add(expressionTextField);
        this.add(resultTextArea);
        this.add(checkButton);

        this.setBackground(Config.BACKGROUND_COLOR);
        this.setLayout(null);
        this.setVisible(true);
    }

    public Button getCheckButton() {
        return checkButton;
    }

    public TextField getExpressionTextField() {
        return expressionTextField;
    }

    public TextArea getResultTextArea() {
        return resultTextArea;
    }
}
