package TemplateMethodPattern.MyFrame;

import javax.swing.*;
import java.awt.*;

/**
 * JFrame은 paint() 메소드를 상속 받는 컨테이너
 *  paint() 메소드는 후크 메소드이기 때문에 아무것도 하지 않
 * 음
 *  paint()를 오버라이드하면 JFrame에서 화면의 특정 영역에
 * 어떤 내용을 표시하는 알고리즘에 원하는 그래픽 추가 가능
 */
public class MyFrame extends JFrame {
    public MyFrame(String title) {
        super(title);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 300);
        setVisible(true);
    }

    public void paint(Graphics g) {
        super.paint(g);
        g.drawString("내가 최고!!", 100, 100);
    }
    public static void main(String[] args) {
        MyFrame myFrame = new MyFrame("헤드 퍼스트 디자 인 패턴");
    }
}