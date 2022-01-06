package CommandPattern;

public class StereoOffwitchCDCommand implements Command{
    Stereo stereo;

    public StereoOffwitchCDCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        stereo.off();
        stereo.setCD(null);
        stereo.setVolume(0);
    }

    @Override
    public void undo() {
        stereo.off();
    }
}
