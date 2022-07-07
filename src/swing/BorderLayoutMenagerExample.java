package swing;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class BorderLayoutMenagerExample {
    public static void main(String[] args) {

        JFrame frame = new JFrame();

        frame.setLayout(new BorderLayout());// domyślne

        Border border = BorderFactory.createLineBorder(Color.BLACK);

        JLabel north = new JLabel("North", JLabel.CENTER);
        north.setBorder(border);
        frame.add(north, BorderLayout.NORTH);

        JLabel west = new JLabel("West", JLabel.CENTER);
        west.setBorder(border);
        frame.add(west, BorderLayout.WEST);

        JLabel east = new JLabel("East", JLabel.CENTER);
        east.setBorder(border);
        frame.add(east, BorderLayout.EAST);

        JLabel south = new JLabel("South", JLabel.CENTER);
        south.setBorder(border);
        frame.add(south, BorderLayout.SOUTH);

        JLabel center = new JLabel("center", JLabel.CENTER);
        center.setBorder(border);
        frame.add(center, BorderLayout.CENTER);


        frame.setSize(300, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

    }
}
