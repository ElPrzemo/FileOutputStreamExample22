package swing;

import swing.JButtonExample;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class JLabelExample {

    public static void main (String args []) {
        JButtonExample frame = new JButtonExample();


        JLabel label1 = new JLabel("tekst");
        label1.setText("<html><u>new text</u></html>");
        label1.setBounds(10, 10, 80, 50);
        label1.setForeground(Color.BLUE);
        label1.setOpaque(true);
        label1.setBackground(Color.WHITE);

        label1.setHorizontalAlignment(JLabel.CENTER);

        Border border = BorderFactory.createLineBorder(Color.RED, 3);
        label1.setBorder(border);

        frame.add(label1);

        frame.setLayout(null);
        frame.setSize(300,300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}








