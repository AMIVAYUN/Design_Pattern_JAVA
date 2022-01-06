package TestPrac.Command;

import javax.swing.*;

public class OperatorCommand extends CommandButton{

    private JLabel display;
    public OperatorCommand(Calculator calculator,JLabel display) {
        super(calculator);

        this.display=display;
    }

    @Override
    public void execute() {
        calculator.setOperatorSet(true);
        calculator.setOperator(this.getText().charAt(0));
    }


}
