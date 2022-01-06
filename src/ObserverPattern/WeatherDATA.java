package ObserverPattern;

import java.util.ArrayList;

public class WeatherDATA implements Subject{
    int Temperature;
    int Humidity/*습도*/;
    int Pressure;
    private ArrayList<Observer> observes;
    public WeatherDATA() {
        observes=new ArrayList<>();
    }

    public void setTemperature(int temperature) {
        Temperature = temperature;
    }

    public void setHumidity(int humidity) {
        Humidity = humidity;
    }

    public void setPressure(int pressure) {
        Pressure = pressure;
    }

    public int getTemperature() {
        return Temperature;
    }

    public int getHumidity() {
        return Humidity;
    }

    public int getPressure() {
        return Pressure;
    }
    public void setMeasurement(int a,int b,int c){
        this.setTemperature(a);
        this.setHumidity(b);
        this.setPressure(c);
        measurementChanged();
    }
    public void measurementChanged(){
        notifyObserver();
    }

    @Override
    public void registerObserver(Observer o) {
        this.observes.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        int i = observes.indexOf(o);
        if(i>0){
            observes.remove(i);
        }
    }

    @Override
    public void notifyObserver() {
        for(Observer observer:observes){
            observer.update(this.getTemperature(),this.getHumidity(),this.getPressure());
        }
    }
}
