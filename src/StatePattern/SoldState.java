package StatePattern;

public class SoldState implements State{
    GumbleMachine gumballMachine;
    public SoldState(GumbleMachine gumballMachine) {
        this.gumballMachine= gumballMachine;
    }
    public void insertQuarter() {
        System.out.println("잠깐만기다려주세요. 알맹이가나가고있습니다");
    }
    public void ejectQuarter() {
        System.out.println("이미알맹이를뽑으셨습니다");
    }
    public void turnCrank() {
        System.out.println("손잡이는한번만돌려주세요");
    }
    public void dispense() {
        gumballMachine.releaseBall();
        if (gumballMachine.getCount() > 0) {
            gumballMachine.setState(
                    gumballMachine.getNoQuarterState());
        } else {
            System.out.println("Oops, out of gumballs!");
            gumballMachine.setState(
                    gumballMachine.getSoldOutState());
        }
    }
}
