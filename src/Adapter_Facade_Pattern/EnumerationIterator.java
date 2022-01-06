package Adapter_Facade_Pattern;

import java.util.Enumeration;
import java.util.Iterator;

public class EnumerationIterator implements Iterator {
    Enumeration e;
    public EnumerationIterator(Enumeration e){
        this.e=e;
    }
    public boolean hasNext(){
        return e.hasMoreElements();
    }
    public Object next(){
        return e.nextElement();
    }
    public void remove(){
        throw new UnsupportedOperationException();
    }
}
