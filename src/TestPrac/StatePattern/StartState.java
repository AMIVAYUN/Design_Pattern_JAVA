package TestPrac.StatePattern;

public class StartState implements State{
    CalcV1 calcV1;

    public StartState(CalcV1 calcV1) {
        this.calcV1 = calcV1;
    }

    @Override
    public void processNumber(String ch) {
        this.calcV1.operand1 = Integer.parseInt(ch);
        this.calcV1.state=this.calcV1.firstOperandState;
    }

    @Override
    public void processOperator(char ch) {

    }
}
