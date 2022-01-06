package StatePattern;

public class Main_State {
    /**
     * 객체의 내부상태가 바뀔 때 객체의 동작을 변경 가능케 하는것.
     * State : 시점에 따라 특정 상태에 있어야 한다.
     * Transition(전이) : 외부 입력에 따라 가능한 상태로 전환 되는것.
     * 문제: if문으로 상태를 통제
     * 결과: 변경 최소화
     * Finite state Machine: 유한 상태 기계 유한한 상태 안에서 움직이는 기계
     *
     * */
    final static int SOLD_OUT=0;
    final static int NO_QUARTER=1;
    final static int HAS_QUARTER=2;
    final static int SOLD=3;
    int state=SOLD_OUT;
    public static void main(String[] args){

        GumbleMachine gumballMachine= new GumbleMachine(5);
        System.out.println(gumballMachine);
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();
        System.out.println(gumballMachine);
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();
        gumballMachine.ejectQuarter();
        System.out.println(gumballMachine);
        gumballMachine.insertQuarter();
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();
        System.out.println(gumballMachine);


    }

}
