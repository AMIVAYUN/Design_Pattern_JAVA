package CommandPattern;

/**
 * invoker undo는 가장 마지막에 실행한 코드 실행
 */
public class SimpleRemoteControl {
    Command[] onCommand;
    Command[] offCommand;
    Command undoCommand;

    public SimpleRemoteControl(){
        onCommand = new Command[7];
        offCommand= new Command[7];
        Command noCommand= new NoCommand();
        for(int i=0; i<7; i++){
            onCommand[i]=noCommand;
            offCommand[i]=noCommand;
        }
        undoCommand=noCommand;
    }
    public void setCommand(int slot,Command oncommand,Command offcommand){
        onCommand[slot]=oncommand;
        this.offCommand[slot]=offcommand;

    }
    public void onbuttonwasPressed(int slot){
        onCommand[slot].execute();
        undoCommand=onCommand[slot];

    }
    public void offbuttonwasPressed(int slot){
        offCommand[slot].execute();
        undoCommand=offCommand[slot];
    }
    public void undobuttonwasPressed(){
        undoCommand.undo();
    }
    public String toString(){
        StringBuffer stringBuffer=new StringBuffer();
        stringBuffer.append("\n--------Remote Control---------\n");
        for(int i=0; i<onCommand.length; i++){
            stringBuffer.append("[slot"+i+"]"+onCommand[i].getClass().getName()+"   "+offCommand[i].getClass().getName()+"\n");
        }
        return stringBuffer.toString();
    }
}
