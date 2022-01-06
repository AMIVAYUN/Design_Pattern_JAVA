package Adapter_Facade_Pattern_Assignment;

import org.codehaus.groovy.runtime.NullObject;

import java.util.ArrayList;
import java.util.Iterator;

public class DataCollectionAdapter<T> implements DataCollection<T>{
        private ArrayList<T> Array=new ArrayList<>();

    @Override
    public boolean put(T t) {
        if(t!=null){
            this.Array.add(t);
            return true;
        }
        else{
            return false;
        }


    }

    @Override
    public T elemAt(int index) {
        if(index>=0&&this.Array.get(index)!=null){
            return this.Array.get(index);
        }
        else{
            throw null;
        }


    }

    @Override
    public int length() {
        return this.Array.size();
    }

    @Override
    public Iterator createIterator() {
        return this.Array.iterator();
    }
}
