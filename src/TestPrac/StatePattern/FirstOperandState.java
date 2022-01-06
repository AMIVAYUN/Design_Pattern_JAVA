package TestPrac.StatePattern;

public class FirstOperandState implements State{
    CalcV1 calcV1;

    public FirstOperandState(CalcV1 calcV1) {
        this.calcV1 = calcV1;
    }

    @Override
    public void processNumber(String ch) {

    }

    @Override
    public void processOperator(char ch) {
        this.calcV1.operator = ch;
        this.calcV1.state=this.calcV1.operatorState;
    }
}
