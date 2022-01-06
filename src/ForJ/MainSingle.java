package ForJ;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


///TODO 게임 서버 객체의 예시를 들어보자면 쓰레드 구현 클래스인 GameServer의 run 메소드에서 서버에 자리를 생성하는 객체와 게임을 실행할때 b1의 액션리스너를 통해 게임을 플레이하는 객체가
//TODO 서로 다른 존재가 되어버린다. 즉 객체 공유가 필요함으로 이러한 경우 싱글턴이 쓰인다.


public class MainSingle {

    public static void main(String[] args) {
        GameServer server = new GameServer();
        Thread thread = new Thread(server);
        JFrame j = new JFrame("window");
        JButton b1 = new JButton("play game");
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("start");
                Singleton.getInstance().PlayGame();
            }
        });
        b1.setPreferredSize(new Dimension(1000, 100));
        b1.setMinimumSize(new Dimension(600, 200));
        b1.setMaximumSize(new Dimension(1200, 100));
        JButton b2 = new JButton("stop");
        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
                server.setServerdown(true);

            }
        });
        b2.setPreferredSize(new Dimension(1000, 100));
        b2.setMinimumSize(new Dimension(600, 100));
        b2.setMaximumSize(new Dimension(1200, 100));
        JPanel p = new JPanel();
        p.add(b1);
        p.add(b2);
        j.setContentPane(p);
        j.setVisible(true);

        thread.run();
        //TODO LAYOUT DEMO
    }

}
