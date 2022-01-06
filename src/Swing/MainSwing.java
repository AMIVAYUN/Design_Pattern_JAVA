package Swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
//TODO 액션리스너 기본
/*
class ButtonListener implements ActionListener{
    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("button clicked");
    }
}

 */
//TODO 멀티리스너
/*
class MultiButtons implements ActionListener {
    JButton b1=new JButton("hello1");
    JButton b2=new JButton("hello2");

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton b= (JButton) e.getSource();
        if(b==b1){
            System.out.println("b1 is clicked");
        }
        else if(b==b2){
            System.out.println("b2 is clicked");
        }

    }
    public void createWindow(){
        JFrame f = new JFrame("Multi Button Window");
        b1= new JButton("hello 1");
        b2= new JButton("hello 2");
        JPanel p = new JPanel();
        p.add(b1);
        p.add(b2);
        b1.addActionListener(this);
        b2.addActionListener(this);
        f.getContentPane().add(p);
        f.setSize(600,400);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

     */

public class MainSwing {
    public static void main(String[] args){
        /* TODO Jframe 개요
        JFrame f = new JFrame("Main");
        f.setSize(600,400);
        Container pane= f.getContentPane();//awt에있음
        JPanel p=new JPanel();
        JButton b = new JButton("hello");
        b.addActionListener(new ButtonListener());
        JButton c = new JButton("hello 2");
        c.addActionListener(new ButtonListener());

        p.add(c);
        p.add(b);
        pane.add(p);

        f.setVisible(true);
        //f.setTitle("Main");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

         */
        /* TODO 멀티 리스너
        MultiButtons m = new MultiButtons();
        m.createWindow();


         */
        //TODO LAYOUT DEMO
        JFrame j = new JFrame("window");
        JButton b1= new JButton("hello 1");
        b1.setPreferredSize(new Dimension(1000,100));
        b1.setMinimumSize(new Dimension(600,200));
        b1.setMaximumSize(new Dimension(1200,100));
        JButton b2 = new JButton("hello 2");
        b2.setPreferredSize(new Dimension(1000,100));
        b2.setMinimumSize(new Dimension(600,100));
        b2.setMaximumSize(new Dimension(1200,100));
        JPanel p = new JPanel();
        p.setPreferredSize(new Dimension(1000,300));
        p.setLayout(new BoxLayout(p,BoxLayout.Y_AXIS));
        p.add(b1);
        p.add(b2);
        //TODO JTEXTFIELD 는 문자만 보여줌
        JTextField tf=new JTextField();
        tf.setText("im juseok");
        p.add(tf);

        //TODO JLABEL은 이미지 문자열 둘다가능
        JLabel lb=new JLabel("문자");
        lb.setSize(600,300);
        //TODO IMG lb.seticon(new ImageIcon("new_IMAGE.jpg");
        p.add(lb);

        j.getContentPane().add(p);
        j.pack();
        j.setSize(1280,1050);
        j.setVisible(true);

    }
}
