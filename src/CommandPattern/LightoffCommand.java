package CommandPattern;

public class LightoffCommand implements Command{
    Light light;
    public LightoffCommand(Light light){
        this.light=light;
    }

    @Override
    public void execute() {
        light.off();
    }

    @Override
    public void undo() {
        light.off();
    }
}
