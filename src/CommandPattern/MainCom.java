package CommandPattern;

public class MainCom {
    /**
     * 요구사항(요청,명령)을 객체로 객체화 시킴. 다른 요구사항을 지닌 클라이언트를 매개변수화.
     * 요구사항을 큐에 넣거나 로그로 남기고, 작업취소(undo) 기능을 지원 할 수 있음.
     * 문제: 사용하는 객체의 API가 다름
     * 해결: 실행과 요청을 분리
     * 결과: 작은 클래스는 많아지지만, 객체 사용에 복잡성을 제거하고 감춰줌
     */
    public static void main(String[] args){
        SimpleRemoteControl remoteControl=new SimpleRemoteControl();
        Light livingRoomlight = new Light("living room"); /**reciever */
        Light Kitchenlight= new Light("Kitchen");
        Stereo stereo= new Stereo("living room");
        stereo.setVolume(11);
        LightonCommand livinglighton=new LightonCommand(livingRoomlight);
        LightoffCommand livinglightoff=new LightoffCommand(livingRoomlight);
        LightonCommand kitchenlighton=new LightonCommand(Kitchenlight);
        LightoffCommand kitchenlightoff=new LightoffCommand(Kitchenlight);
        StereoWithCDCommand stereoWithCDCommand= new StereoWithCDCommand(stereo);
        StereoOffwitchCDCommand stereoOffwitchCDCommand=new StereoOffwitchCDCommand(stereo);
        remoteControl.setCommand(0,livinglighton,livinglightoff);
        remoteControl.setCommand(1,kitchenlighton,kitchenlightoff);
        remoteControl.setCommand(3,stereoWithCDCommand,stereoOffwitchCDCommand);
        System.out.println(remoteControl);
        remoteControl.onbuttonwasPressed(0);
        remoteControl.onbuttonwasPressed(1);
        System.out.println(remoteControl);
        remoteControl.undobuttonwasPressed();
        remoteControl.onbuttonwasPressed(3);
        remoteControl.offbuttonwasPressed(0);
        remoteControl.offbuttonwasPressed(1);
        remoteControl.offbuttonwasPressed(3);

        /**
         * client 입장에선 커맨드만 구현되어 있으면, setcommand가 실행되고 버튼이 눌려지면 커맨드가 실행됨으로 커맨드 자체의 캡슐화.
         */
        /**
         * invoker는 특정 인터페이스만 구현되어 있다면 커맨드 객체에서 실제로 무슨일이 일어나는지 몰라도 됨.
         */

    }
}
