package TestPrac.StatePattern;

public class SecondOperateState implements State{
    CalcV1 calcV1;

    public SecondOperateState(CalcV1 calcV1) {
        this.calcV1 = calcV1;
    }

    @Override
    public void processNumber(String ch) {

    }

    @Override
    public void processOperator(char ch) {
        if (ch == '=') {
            this.calcV1.printOutResult();
            this.calcV1.state = this.calcV1.startState;
        }
        else{
            System.out.println("Error By Misinputing!");
            this.calcV1.state=this.calcV1.startState;
        }
    }
}
