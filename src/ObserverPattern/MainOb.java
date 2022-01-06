package ObserverPattern;

import java.util.Scanner;

//TODO 차세대 날씨 예측 서비스
//TODO 기상 스테이션 -> 기상정보 수집장비
//TODO WEATHERDATA 객체 기상 스테이션으로 부터 데이터 추적객체
//todo 디스플레이 사용자에게 기상정보 보여줌
//TODO 해당 클래스는 SCANNER의 역할(SENSOR DEVICE)
public class MainOb {
    public static void main(String[] args){
        WeatherDATA weatherDATA=new WeatherDATA();
        CurrentWeatherDATA currentWeatherDATA=new CurrentWeatherDATA(weatherDATA);
        weatherDATA.setMeasurement(10,20,30);
        weatherDATA.setMeasurement(10,20,40);
        weatherDATA.setMeasurement(10,20,50);



    }


}
