package CommandPattern.undowithStatus;

public interface Command {
    public void execute();
    public void undo();
}
