package ForJ2;

import javax.swing.*;
import java.awt.*;

public class LabelWindow extends FrameWindow{
    private JLabel label;

    public LabelWindow(int width, int height) {
        super(width, height);
    }
    public void updateText(String msg) {
        label.setText(msg);
        label.validate();
    }

    @Override
    public JPanel createPanel(int width, int height) {
        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());
        label = new JLabel();
        panel.add(label);
        panel.setPreferredSize(new Dimension(width, height));
        return panel;
    }
}
