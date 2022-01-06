package ForJ2;

import javax.swing.*;
import java.awt.event.WindowListener;

public abstract class FrameWindow {
    private JFrame frame;

    public FrameWindow(int width, int height) {
        frame = createWindow(width, height);
    }

    public FrameWindow(int width, int height, WindowListener lis) {
        frame = createWindow(width, height);
        frame.addWindowListener(lis);
    }

    public JFrame createWindow(int width, int height) {
        JFrame frame=new JFrame("window");
        frame.setBounds(600,400,width, height);
        JPanel panel = createPanel(width, height);
        frame.getContentPane().add(panel);
        frame.pack();
        frame.setVisible(true);
        return frame;
    }

    public abstract JPanel createPanel(int width, int height);
}

