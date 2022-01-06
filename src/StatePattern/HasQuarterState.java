package StatePattern;

import java.util.Random;

public class HasQuarterState implements State{
    GumbleMachine gumbleMachine;
    public HasQuarterState(GumbleMachine gumbleMachine) {
        this.gumbleMachine= gumbleMachine;
    }
    public void insertQuarter() {
        System.out.println("동전은한개만넣어주세요");
    }
    public void ejectQuarter() {
        System.out.println("동전이반환됩니다");
        gumbleMachine.setState(
                gumbleMachine.getNoQuarterState());
    }
    Random random= new Random(
            System.currentTimeMillis());
    public void turnCrank() {
        System.out.println("손잡이를돌리셨습니다");
        int winner = random.nextInt(10);
        if ((winner == 0)
                && (gumbleMachine.getCount() > 1)) {
            gumbleMachine.setState(
                    gumbleMachine.getWinnerState());
        } else {
            gumbleMachine.setState(
                    gumbleMachine.getSoldState());
        }
    }
    public void dispense() {
        System.out.println("알맹이가나갈수없습니다");
    }
}
