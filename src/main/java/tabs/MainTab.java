package tabs;

import config.Config;
import tabs.modules.ExpressionCheckForm;
import tabs.modules.SquareRootForm;
import validation.Validation;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainTab extends JFrame
{
    private final ExpressionCheckForm expressionCheckForm;
    private final SquareRootForm squareRootForm;

    public MainTab() {
        this.setTitle("MathSupport");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(Config.WINDOW_WIDTH, Config.WINDOW_HEIGHT);
        this.setResizable(false);
        this.setLocationRelativeTo(null);

        expressionCheckForm = new ExpressionCheckForm();
        expressionCheckForm.getCheckButton().addActionListener(new checkButtonActionListener());
        squareRootForm = new SquareRootForm();

        this.setLayout(null);
        this.add(squareRootForm);
        this.add(expressionCheckForm);
        this.setVisible(true);
    }

    class checkButtonActionListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            expressionCheckForm.getResultTextArea().setText(
                    Validation.validation(expressionCheckForm.getExpressionTextField().getText())
            );
        }
    }
}
