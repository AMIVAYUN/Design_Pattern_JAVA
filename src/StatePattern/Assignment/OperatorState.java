package StatePattern.Assignment;

public class OperatorState implements State{
    private CalcV1 calculator;

    public OperatorState(CalcV1 calc){
        this.calculator=calc;
    }
    @Override
    public void processNumber(String ch) {
        this.calculator.operand2 = Integer.parseInt(ch);
        this.calculator.setState(this.calculator.SecondOperandState);
    }

    @Override
    public void processOperator(char ch) {

    }


}
