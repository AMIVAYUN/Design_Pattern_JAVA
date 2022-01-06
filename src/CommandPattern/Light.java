package CommandPattern;

/**
 * reciever
 */
public class Light {
    Light(String place){
        this.Place=place;
    }
    String Place;
    public void on() {
        System.out.println(""+this.Place+"Light on");
    }

    public void off() {
        System.out.println(""+this.Place+"Light off");
    }
}
