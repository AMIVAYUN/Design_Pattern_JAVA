package StatePattern.Assignment;

public class SecondOperandState implements State {
    private CalcV1 calculator;
    public SecondOperandState(CalcV1 calculator){
        this.calculator=calculator;
    }
    @Override
    public void processNumber(String ch) {

    }

    @Override
    public void processOperator(char ch) {
        if (ch == '=') {
            this.calculator.printOutResult();
            this.calculator.setState(this.calculator.StartState);
        }
    }
}
