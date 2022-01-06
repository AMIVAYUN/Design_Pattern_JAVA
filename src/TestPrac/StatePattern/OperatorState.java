package TestPrac.StatePattern;

public class OperatorState implements State{
    CalcV1 calcV1;
    public OperatorState(CalcV1 calcV1) {
        this.calcV1=calcV1;
    }

    @Override
    public void processNumber(String ch) {
        this.calcV1.operand2 = Integer.parseInt(ch);
        this.calcV1.state=this.calcV1.secondOperateState;
    }

    @Override
    public void processOperator(char ch) {

    }
}
