package StatePattern;

public class GumbleMachine {
    State soldOutState;
    State noQuarterState;
    State hasQuarterState;
    State soldState;
    State state;
    State WinnerState;
    int count=0;
    public GumbleMachine(int numberGumballs) {
        soldOutState= new SoldOutState(this);
        noQuarterState= new NoQuarterState(this);
        hasQuarterState= new HasQuarterState(this);
        soldState= new SoldState(this);
        state = soldOutState;
        this.count= numberGumballs;
        if (numberGumballs> 0 ) {
            state = noQuarterState;
        }
    }
    public void insertQuarter() {
        state.insertQuarter();
    }
    public void ejectQuarter() {
        state.ejectQuarter();
    }
    public void turnCrank() {
        state.turnCrank();
        state.dispense();
    }
    public void setState(State state) {
        this.state= state;
    }
    void releaseBall() {
        System.out.println("A gumball comes rolling out the slot…");
        if (count != 0) {
            count = count -1;
        }
    }
    public int getCount() { return count; }
    public State getState() { return state; }
    public State getSoldOutState() { return soldOutState; }
    public State getNoQuarterState() {
        return noQuarterState;
    }
    public State getHasQuarterState() {
        return hasQuarterState;
    }
    public State getSoldState() { return soldState; }

    public State getWinnerState() {
        return WinnerState;
    }

    /*
    final static int SOLD_OUT=0;
    final static int NO_QUARTER=1;
    final static int HAS_QUARTER=2;
    final static int SOLD=3;
    int state=SOLD_OUT;
    int count=0;
    public GumbleMachine(int count){
        this.count=count;
        if(count>0){
            state=NO_QUARTER;
        }
    }
    public void insertQuarter(){
        if(state== HAS_QUARTER){
            System.out.println("동전은 한개만 넣어주세요");
        }
        else if(state==SOLD_OUT){
            System.out.println("매진되었습니다. 다음 기회에 이용해주세요");
        }
        else if(state==SOLD){
            System.out.println("잠깐만 기다려 주세요. 알맹이가 배출되고 있습니다.");
        }
        else if(state==NO_QUARTER){
            state=HAS_QUARTER;
            System.out.println("동전이 투입되었습니다.");
        }
    }
    public void ejectQuarter(){
        if(state==HAS_QUARTER){
            System.out.println("동전이 반환됩니다.");
            state=NO_QUARTER;
        }
        else if(state == NO_QUARTER){
            System.out.println("동전을 넣어주세요");
        }
        else if(state==SOLD){
            System.out.println("이미 알맹이를 뽑으셨습니다.");
        }
        else if(state==SOLD_OUT){
            System.out.println("동전을 넣지 않으셨습니다. 동전이 반환되지 않습니다.");
        }


    }
    public void turnCrank() {
        if (state == SOLD) {
            System.out.println("손잡이는한번만돌려주세요");
        } else if (state == NO_QUARTER) {
            System.out.println("동전을넣어주세요");
        } else if (state == SOLD_OUT) {
            System.out.println("매진되었습니다");
        } else if (state == HAS_QUARTER) {
            System.out.println("손잡이를돌리셨습니다");
            state = SOLD;
            dispense();
        }
    }
    public void dispense() {
        if (state == SOLD) {
            System.out.println("알맹이가나가고있습니다");
            count = count-1;
            if (count == 0) {
                System.out.println("더이상알맹이가없습니다");
                state = SOLD_OUT;
            } else {
                state = NO_QUARTER;
            }
        } else if (state == NO_QUARTER) {
            System.out.println("동전을넣어주세요");
        } else if (state == SOLD_OUT) {
            System.out.println("매진입니다");
        } else if (state == HAS_QUARTER) {
            System.out.println("알맹이가나갈수없습니다");
        }
    }

     */
// 기타메소드

}

