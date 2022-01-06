import java.math.BigInteger;
import java.util.Scanner;

public class PracMain {
    public static void main(String[] args){
        Call_By_Ref ref=new Call_By_Ref();
        ref.setA(1);
        ref.setB(2);
        swap(ref.getA(),ref.getB());
        print(ref.getA(),ref.getB());

        int x=1;
        int y=2;
        swap(x,y);
        print(x,y);

    }
    static class Call_By_Ref{
        int a,b;

        public int getA() {
            return a;
        }

        public void setA(int a) {
            this.a = a;
        }

        public int getB() {
            return b;
        }

        public void setB(int b) {
            this.b = b;
        }
    }
    static void swap(int a, int b){
        int temp;
        temp = a;
        a= b;
        b= temp;
    }
    static void print(int a, int b){
        System.out.println("a= "+a +"b= "+b);
    }

}
