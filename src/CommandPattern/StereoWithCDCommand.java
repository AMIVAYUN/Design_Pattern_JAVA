package CommandPattern;

public class StereoWithCDCommand implements Command{
    Stereo stereo;
    public StereoWithCDCommand(Stereo stereo){
        this.stereo=stereo;
    }

    @Override
    public void execute() {
        stereo.on();
        stereo.setCD("Stereo Mix");
        stereo.setVolume(11);
    }

    @Override
    public void undo() {
        stereo.off();
    }
}
