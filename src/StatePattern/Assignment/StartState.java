package StatePattern.Assignment;

public class StartState implements State{
    private CalcV1 calculator;
    public StartState(CalcV1 calculator){
        this.calculator=calculator;
    }
    @Override
    public void processNumber(String ch) {
        this.calculator.operand1 = Integer.parseInt(ch);
        this.calculator.setState(this.calculator.FirstOperandState);

    }

    @Override
    public void processOperator(char ch) {

    }


}
