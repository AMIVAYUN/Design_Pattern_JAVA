package ObserverPattern;

public class CurrentWeatherDATA implements Observer,DisplayElement{
    int temp;
    int humd;
    int press;
    private Subject weatherDATA;
    public CurrentWeatherDATA(Subject weatherdata){
        this.weatherDATA=weatherdata;
        weatherDATA.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Current conditions: "+temp+"F degree:"+"humd:"+humd+"pressure: "+ press);

    }

    @Override
    public void update(int temp, int humidity, int pressure) {
        this.temp=temp;
        this.humd=humidity;
        this.press=pressure;
        display();

    }
}
