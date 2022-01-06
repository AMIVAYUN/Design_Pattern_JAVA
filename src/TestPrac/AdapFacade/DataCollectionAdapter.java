package TestPrac.AdapFacade;

import javax.xml.crypto.Data;
import java.util.ArrayList;
import java.util.Iterator;

public class DataCollectionAdapter<T> implements DataCollection<T> {
    ArrayList<T> arrayList=new ArrayList<>();

    @Override
    public boolean put(T t) {
        if(t!=null){
            this.arrayList.add(t);
            return true;
        }
        return false;
    }

    @Override
    public T elemAt(int index) {
        return this.arrayList.get(index);
    }

    @Override
    public int length() {
        return this.arrayList.size();
    }

    @Override
    public Iterator createIterator() {
        return this.arrayList.iterator();
    }
}
