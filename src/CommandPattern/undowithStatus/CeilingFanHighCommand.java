package CommandPattern.undowithStatus;

public class CeilingFanHighCommand implements Command{
    CeilingFan fan;
    int PrevSpeed;
    public CeilingFanHighCommand(CeilingFan fan){
        this.fan=fan;
    }

    @Override
    public void execute(){
        this.PrevSpeed= fan.getSpeed();
        fan.high();

    }

    @Override
    public void undo() {
        if(PrevSpeed== CeilingFan.HIGH){
            fan.high();
        }
        else if (PrevSpeed==CeilingFan.MEDIUM){
            fan.medium();
        }
        else if(PrevSpeed==CeilingFan.LOW){
            fan.low();
        }
        else{
            fan.off();
        }
    }
}
