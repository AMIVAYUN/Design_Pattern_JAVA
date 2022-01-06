package TestPrac.Command;

import javax.swing.*;

public abstract class CommandButton extends JButton implements Command{
    Calculator calculator;
    public CommandButton(Calculator calculator){
        this.calculator=calculator;
    }

    @Override
    public abstract void execute();
}
