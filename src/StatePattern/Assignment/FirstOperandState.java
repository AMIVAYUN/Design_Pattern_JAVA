package StatePattern.Assignment;

public class FirstOperandState implements State{
    private CalcV1 calculator;

    public FirstOperandState(CalcV1 calc){
        this.calculator=calc;
    }
    @Override
    public void processNumber(String ch) {

    }

    @Override
    public void processOperator(char ch) {
        this.calculator.setState(this.calculator.OperatorState);
        this.calculator.operator = ch;
    }


}
