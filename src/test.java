import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class test {
    public static void main(String[] args){
        int[] a = {1,1,2,2,2,8};
        Scanner s = new Scanner(System.in);
        for(int i = 0; i<6; i++){
            int k=s.nextInt();
            a[i]=a[i]-k;
            System.out.print(""+a[i]+"\t");
            System.out.print("주석");
        }

    }

    public static int gcd(int a, int b) {
        start:
        for (; ; ) {
            if (a == b) {
                break start;
            } else if (a > b) {
                a = a - b;
            }
            else{
                b = b - a;
            }
        }
        return a;
    }


}
