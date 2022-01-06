package ForJ;

public class GameServer implements Runnable{
    private boolean serverdown=false;
    public boolean isGameover(){
        return serverdown;
    }
    public void setServerdown(boolean serverdown){
        this.serverdown=serverdown;
    }
    @Override
    public void run() {
        while(true){
            if(serverdown){
                break;
            }
            Singleton.getInstance().match();
            try{
                Thread.sleep(3000);
            }catch (InterruptedException e){

            }
        }
    }
}
