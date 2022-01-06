package CommandPattern.Assignment;

import javax.swing.*;

public class ResultCommand implements Command{
    Calculator calculator;
    JLabel display;
    int result=0;
    ResultCommand(Calculator calculator,JLabel display){
        this.calculator=calculator;
        this.display=display;
    }
    @Override
    public void execute() {
        if (calculator.isOperand1Set() && calculator.isOperand2Set() && calculator.isOperatorSet()) { // 두 개 피 연산자값과 연산자가 지정되었다면
            if (calculator.getOperator() == '+') {
                result = calculator.getOperand1() + calculator.getOperand2();
            }
            else if (calculator.getOperator() == '-') {
                result = calculator.getOperand1() - calculator.getOperand2();
            }
            else if (calculator.getOperator() == '*') {
                result = calculator.getOperand1() * calculator.getOperand2();
            }
            else if (calculator.getOperator() == '/') {
                result = calculator.getOperand1() / calculator.getOperand2();
            }
        }
        display.setText("" + result);
        calculator.clearFlags();
    }
}
