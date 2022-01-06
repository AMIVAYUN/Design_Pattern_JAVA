package StatePattern.Assignment;

public class Main_Assign {
    public static void main(String[] args) {
        CalcV1 calcv1 = new CalcV1();
        boolean run = true;
        while (run) {
            run = calcv1.run();
        }
    }
}
