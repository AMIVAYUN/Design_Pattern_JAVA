package ForJ;

public class Singleton{
//싱글턴을 이용한 멀티쓰레드 식사 출력예제
    private static Singleton Client;

    public int GameCnt;

    public int PlayCnt;

    private Singleton() {}

    public static Singleton getInstance() {
        if(Client == null) {
            Client = new Singleton();
        }
        return Client;
    }
    public synchronized void match(){
        System.out.println("game enable by Singleton"+" "+this.GameCnt+"번째 게임");
        try{
            wait(500);
        } catch (InterruptedException e) {

        }
        if(GameCnt>9) {
            System.out.println("게임 서버 FULL 자리 없음");
            try {
                wait();
            } catch (InterruptedException e) {
            }
        }
        this.GameCnt++;
        System.out.println("게임 서버 빈공간 생성 새로운 게임 가능.");

    }
    public synchronized void PlayGame(){
        if(PlayCnt == 10){
            System.out.println("밤이 되었으니 게임을 그만 두세요");
        }
        else if (GameCnt < 1){
            System.out.println("너무 많이하능교");
        }
        else{
            GameCnt--;
            PlayCnt++;
            System.out.println("게임 큐가 잡혔어요! 서버 남은 자리 : "+GameCnt);
            System.out.println("게임 횟수:"+PlayCnt);
        }
    }


}
