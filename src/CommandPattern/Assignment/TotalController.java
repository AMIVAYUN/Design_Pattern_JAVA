package CommandPattern.Assignment;

import javax.swing.*;



public class TotalController implements Command{
    JButton cmdButton;
    JButton[] buttons;
    Calculator calculator;
    JLabel display;
    ResultCommand resultCommand;
    OperatorCommand operatorCommand;
    OperandSetCommand operandSetCommand;
    public TotalController(JButton cmdButton, JButton[] buttons, Calculator calculator, JLabel display) {
        this.cmdButton = cmdButton;
        this.buttons=buttons;
        this.calculator=calculator;
        this.display=display;
        this.operandSetCommand=new OperandSetCommand(this.calculator,this.cmdButton);
        this.resultCommand= new ResultCommand(this.calculator,this.display);
        this.operatorCommand=new OperatorCommand(this.calculator,this.cmdButton,this.display);
    }
    public void execute(){
        if (cmdButton == buttons[0] || cmdButton == buttons[1]  || cmdButton == buttons[2]  ||
                cmdButton == buttons[3]  || cmdButton == buttons[4]  || cmdButton == buttons[5]  ||
                cmdButton == buttons[6]  || cmdButton == buttons[7]  || cmdButton == buttons[8]  ||
                cmdButton == buttons[9] ) { // 0-9 버튼
                operatorCommand.execute();
        }
        else if (cmdButton == buttons[14]) { // = 버튼
            resultCommand.execute();

        }
        else if (cmdButton == buttons[10] || cmdButton == buttons[11] ||
                cmdButton == buttons[12] || cmdButton == buttons[13]) { // +, -, *, / 버튼
                operandSetCommand.execute();
        }
    }
}
