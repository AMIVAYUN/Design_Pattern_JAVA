package StatePattern;

public class SoldOutState implements State {
    GumbleMachine gumbleMachine;
    public SoldOutState(GumbleMachine gumbleMachine) {
        this.gumbleMachine=gumbleMachine;
    }

    @Override
    public void insertQuarter() {

    }

    @Override
    public void ejectQuarter() {

    }

    @Override
    public void turnCrank() {

    }

    @Override
    public void dispense() {

    }
}
