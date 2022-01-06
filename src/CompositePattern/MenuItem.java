package CompositePattern;

/**
 * 디자인패턴요소
 * 요소
 * 설명
 * 이름컴포짓(Composite)
 * 문제 프로그램에서각각의객체(개별객체)또는계층구조로이루어진객체묶음(복합객체)을다루어야함
 * 해결방안
 * 개별객체와복합객체에대해동일한작업을적용시킬수있도록함. 대부분의경우에개별객체와복합객체의차이를무시할수있도록함
 * 결과
 * 유지보수에유리함
 *
 * 컴포넌트(Component)
 * 개별객체뿐만아니라이러한개별객체들을계층구조로포함하는복합객체를나타내는인터페이스또는추상클래스
 * 모든클래스에공통적인행위에대해기본기능을구현할수있음
 * 개별객체(Leaf)
 * 개별객체에해당되는컴포넌트
 * 다른컴포넌트를포함할수없는컴포넌트
 * 복합객체(Composite)
 * 다른컴포넌트를포함할수있는컴포넌트
 * 개별객체또는다른복합객체를포함할수있음
 * 디저트메뉴를MenuItem배열에넣을수없음
 */
public class MenuItem implements MenuComponent {
    String name;
    String description;
    boolean vegeterian;
    double price;

    public MenuItem(String name, String description, boolean vege,double price){
        this.name=name;
        this.description=description;
        this.vegeterian=vege;
        this.price=price;
    }
    public String getName(){return name;}
    public String getDescription(){
        return description;
    }
    public double getPrice() { return price; }
    public boolean isVegeterian(){ return vegeterian;}
    public void print() {
        System.out.print(" " + getName());
        if (this.isVegeterian()) {
            System.out.print("(v)");
        }
        System.out.println(", " + getPrice());
        System.out.println(" --"
                + getDescription());
    }

}
