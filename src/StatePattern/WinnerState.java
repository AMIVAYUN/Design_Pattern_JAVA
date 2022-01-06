package StatePattern;

public class WinnerState implements State{
    GumbleMachine gumbleMachine;
    public WinnerState(GumbleMachine gbMachine) {
        this.gumbleMachine= gbMachine;
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
        System.out.println("축하드립니다. 알맹이를한개더받으실수있습니다");
        gumbleMachine.releaseBall();
        if (gumbleMachine.getCount() == 0) {
            gumbleMachine.setState(
                    gumbleMachine.getSoldOutState());
        } else {
            gumbleMachine.releaseBall();
            if (gumbleMachine.getCount() > 0) {
                gumbleMachine.setState(
                        gumbleMachine.getNoQuarterState());
            } else {
                System.out.println("더이상알맹이가없습니다");
                gumbleMachine.setState(
                        gumbleMachine.getSoldOutState());
            }
        }
    }
}
