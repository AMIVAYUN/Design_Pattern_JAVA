package ForLook;
import java.util.ArrayList;

public class PrimeObservableThread implements Runnable {
    private static final int SLEEPTIME = 500;

    private int primeNumber;
    private int numCount;
    private boolean first = true;
    private boolean stopRunning = false;
    public int count=0;
    ArrayList<FrameWindow> Observers= new ArrayList();
    public PrimeObservableThread() {
    }

    public int getPrimeNumber() {
        return primeNumber;
    }

    public void stopRunning() {
        stopRunning = true;
    }

    public void startRunning() {
        stopRunning = false;
        run();
    }

    private void generatePrimeNumber() {
        while (stopRunning == false) {
            if (first) {
                first = false;
                primeNumber = 2;   // 泥� 踰덉㎏ �냼�닔�뒗 2
                System.out.println(primeNumber);
                numCount = 1; // �떎�쓬 �떒怨꾨��꽣�뒗 2瑜� �뜑�빐�꽌 ���닔留� �솗�씤�븯誘�濡� 1濡� 諛붽퓭�꽌 �떎�쓬 �닽�옄瑜� 3�쑝濡� 留뚮뱾�뼱�빞 �븿
            } else {
                numCount += 2; // 2瑜� �젣�쇅�븳 吏앹닔�뒗 �냼�닔媛� �맆 �닔 �뾾�쓬. �뵲�씪�꽌 ���닔留� 寃��궗
                if (isPrimeNumber(numCount)) {
                    primeNumber = numCount;
                    System.out.println(primeNumber);
                    notify(primeNumber);
                }
            }
            try {
                Thread.sleep(SLEEPTIME); // 1珥� �돹
            }
            catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    private boolean isPrimeNumber(int n) {
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    @Override
    public void run() {
        generatePrimeNumber();
    }
    public void notify(int primenumber) {
		for(int i=0; i<this.Observers.size();i++) {
			FrameWindow window=this.Observers.get(i);
			if(window instanceof TextFieldWindow) {
				((TextFieldWindow) window).updateText(""+this.getPrimeNumber());
			}
			else if(window instanceof LabelWindow){
				((LabelWindow)window).updateText(""+this.getPrimeNumber());
				
			}
			else {
				
			}
			
		}
		
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
