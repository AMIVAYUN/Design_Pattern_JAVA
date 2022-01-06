package ForJ2;

import ForLook.TextFieldWindow;

import java.util.ArrayList;

public class Counter implements Runnable {
    public boolean Running = true;
    int cnt=0;
    public ArrayList<FrameWindow>Observers=new ArrayList<>();
    @Override
    public void run() {
        while(Running){
            cnt++;
            try{
                Thread.sleep(500);
            } catch (InterruptedException e) {
            }
        }
    }
    public void notify(int primenumber) {
        for(int i=0; i<this.Observers.size();i++) {
            FrameWindow window=this.Observers.get(i);
            ((LabelWindow)window).updateText(""+this.getInt());



        }

    }
    public int getInt(){
        return this.cnt;
    }
    public void add(FrameWindow window) {
        this.Observers.add(window);
    }
    public void remove(FrameWindow window) {
        int i = this.Observers.indexOf(window);
        if(i>=0) {
            this.Observers.remove(i);
        }

    }

}
