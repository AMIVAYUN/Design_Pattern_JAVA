package TestPrac;

import java.util.Enumeration;
import java.util.Vector;

public class MainTP {
    public static void main(String[] args){
        Vector v = new Vector();
        for(int i =0 ;i<10; i++){
            v.add(i);
        }
        Enumeration e = v.elements();
        EnumerationAdapter enumerationAdapter = new EnumerationAdapter(e);
        while(enumerationAdapter.hasNext()){
            System.out.println(enumerationAdapter.next());
        }
    }
}
