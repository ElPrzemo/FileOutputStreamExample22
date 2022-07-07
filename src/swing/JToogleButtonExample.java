package swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JToogleButtonExample extends JFrame {
    public static void main(String[] args) {

        JToogleButtonExample frame = new JToogleButtonExample();


        JToggleButton b1 = new  JToggleButton("Toogle button");
        b1.setFont(new Font("Arial", Font.PLAIN, 12));

        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("button clickec, seleceted: " + b1.isSelected());
            }
        });

        frame.add(b1);
        frame.setLayout(new FlowLayout());
        frame.setSize(200, 200);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

