package TestPrac.StatePattern.RightAnswer;

public class MainNew1 {
    public static void main(String[] args) {
        CalcV1 calcv1 = new CalcV1();
        boolean run = true;
        while (run) {
            run = calcv1.run();
        }
    }
}
