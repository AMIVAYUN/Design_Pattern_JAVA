package TestPrac;

import java.util.Enumeration;
import java.util.Iterator;

public class EnumerationAdapter implements Iterator {
    Enumeration e;
    EnumerationAdapter(Enumeration e){
        this.e=e;
    }
    @Override
    public boolean hasNext() {
        return e.hasMoreElements();
    }

    @Override
    public Object next() {
        return e.nextElement();
    }
}
