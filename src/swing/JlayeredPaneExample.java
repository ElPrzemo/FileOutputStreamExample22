package swing;

import javax.swing.*;
import java.awt.*;

public class JlayeredPaneExample extends JFrame{

    public static void main(String[] args) {

        JlayeredPaneExample frame = new JlayeredPaneExample();

        JLayeredPane layeredPane = frame.getLayeredPane();

        JButton b1 = new JButton();
        b1.setBounds(10,10,50,50);
        b1.setBackground(Color.RED);
        layeredPane.add(b1,10);          //   index oznacza miejsce w szeregu im wyższy tym wyżej

        JButton b2 = new JButton();
        b2.setBounds(10,10,50,50);
        b2.setBackground(Color.BLACK);
        layeredPane.add(b2,15);

        JButton b3 = new JButton();
        b3.setBounds(10,10,50,50);
        b3.setBackground(Color.BLUE);
        layeredPane.add(b3,25);

        frame.setLayout(null);
        frame.setSize(200,200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
