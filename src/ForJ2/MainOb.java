package ForJ2;

import ForJ.Singleton;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainOb {
    private static Counter counterthread;
    public static void main(String[] args){
        counterthread=new Counter();
        JFrame j = new JFrame("Main window");
        JButton b1 = new JButton("add Observer1");

        b1.setPreferredSize(new Dimension(1000, 100));
        b1.setMinimumSize(new Dimension(600, 200));
        b1.setMaximumSize(new Dimension(1200, 100));

        JPanel p = new JPanel();
        p.add(b1);
        j.setContentPane(p);
        j.setVisible(true);
        JFrame j2= new JFrame("Observer1");
        j2.setPreferredSize(new Dimension(1000,100));
        JPanel p2 = new JPanel();


    }
}
