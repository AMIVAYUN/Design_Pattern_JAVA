package TestPrac.CompositePattern;

import java.util.ArrayList;
import java.util.Iterator;

public class Menu implements MenuComponent{
    ArrayList menuComponents = new ArrayList();
    String name;
    String description;

    public Menu(String name, String desc){
        this.name=name;
        this.description=desc;

    }

    @Override
    public void add(MenuComponent comp) {
        this.menuComponents.add(comp);
    }
    public void remove(MenuComponent comp){
        menuComponents.remove(comp);
    }
    public String getName(){
        return this.name;
    }
    public String getDescription() {
        return description;
    }
    public void print() {
        System.out.print("\n" + getName());
        System.out.println(", " + getDescription());
        System.out.println("---------------------");
        Iterator it = menuComponents.iterator();
        while (it.hasNext()) {
            MenuComponent component
                    = (MenuComponent) it.next();
            component.print();
        }
    }
}
