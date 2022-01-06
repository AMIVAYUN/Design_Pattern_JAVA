package ObserverPattern;

public class Display implements Observer{



    @Override
    public void update(int temp, int humidity, int pressure) {
        System.out.println("온도:"+temp+"습도:"+humidity+"기압:"+pressure);

    }
}
