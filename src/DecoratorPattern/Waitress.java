package DecoratorPattern;

public class Waitress {
    private String Order;
    static Waitress instance;
    private Waitress() {

    }
    public static Waitress getInstance(){
        if(instance==null){
            instance=new Waitress();
        }
        return instance;
    }
    public void getOrder(String s){
        instance.Order=s;
    }

}
