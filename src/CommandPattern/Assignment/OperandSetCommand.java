package CommandPattern.Assignment;

import javax.swing.*;

public class OperandSetCommand implements Command{
    Calculator calculator;
    JButton cmdButton;
    public OperandSetCommand(Calculator calculator,JButton cmdButton){
        this.calculator=calculator;
        this.cmdButton=cmdButton;
    }
    @Override
    public void execute() {
        if (calculator.isOperand1Set()) {  // 첫 번째 피연산자 값이 지정되어야만 연산자 처리 가능
            calculator.setOperatorSet(true);
            calculator.setOperator(cmdButton.getText().charAt(0));
        }

    }
}
