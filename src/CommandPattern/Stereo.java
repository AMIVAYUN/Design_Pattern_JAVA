package CommandPattern;

public class Stereo {
    String CD;
    String Place;
    int Volume;
    Stereo(String place){
        this.Place=place;
        this.setCD("Stereo MIX");
    }
    public void on() {
        System.out.println(this.CD+"를 실행합니다 볼륨:"+Volume);
    }

    public void off(){System.out.println("종료");}

    public void setCD(String CD) {
        this.CD=CD;
    }

    public void setVolume(int vol) {
        this.Volume=vol;
    }
}
