package TemplateMethodPattern.MyApplet;

import java.applet.Applet;
import java.awt.*;

public class MyApplet extends Applet {
    String message;
    public void init() { // 애플릿을 초기화
        message = "안녕하세요. 제가 왔어요…";
        repaint();
    }
    public void start() { // 웹페이지에 표시되는 시점
        message = "시작 중…";
        repaint();
    }
    public void stop() { // 다른 페이지로 이동
        message = "저를 떠나려 하시는군요…";
        repaint();
    }
    public void destroy() { // 브라우저가 닫힐 때
// 애플릿이 제거됨…
    }
    public void paint(Graphics g) {
        g.drawString(message, 5, 15);
    }
}