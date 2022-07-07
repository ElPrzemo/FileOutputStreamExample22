package swing;

import javax.swing.*;
import java.awt.*;

public class JToolBarExample extends JFrame {
    public static void main(String[] args) {

        JToolBarExample frame = new JToolBarExample();

        JToolBar toolBar = new JToolBar();
        JButton b1 = new JButton("Click me");
        toolBar.add(b1);

        JToggleButton b2 = new JToggleButton("elo");
        toolBar.add(b2);

        frame.add(toolBar);

        frame.setLayout(new FlowLayout());
        frame.setSize(200, 200);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}


