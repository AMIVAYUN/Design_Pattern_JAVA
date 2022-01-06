package StatePattern;

public class NoQuarterState implements State{
    GumbleMachine gumbleMachine;
    public NoQuarterState(GumbleMachine gumbleMachine){
        this.gumbleMachine=gumbleMachine;
    }
    public void insertQuarter() {
        System.out.println("동전을넣으셨습니다");
        gumbleMachine.setState(
                gumbleMachine.getHasQuarterState());
    }
    public void ejectQuarter() {
        System.out.println("동전을넣어주세요");
    }

    public void turnCrank() {
        System.out.println("동전을넣어주세요");
    }
    public void dispense() {
        System.out.println("동전을넣어주세요");
    }
}
