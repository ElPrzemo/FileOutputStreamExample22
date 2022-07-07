package swing;

import javax.swing.*;
import java.awt.*;

public class JPanelExample extends JFrame {
    public static void main(String[] args) {

        JPanelExample frame = new JPanelExample();

        JPanel panel = new JPanel();
        panel.setBackground(Color.BLUE);
        panel.add(new Button ("Click me! "));
        panel.add(new JLabel("Label"));
        panel.setPreferredSize(new Dimension(150, 150));

        frame.add((panel));

        frame.setLayout(new FlowLayout());
        frame.setSize(300, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
