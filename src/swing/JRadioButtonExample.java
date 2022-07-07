package swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JRadioButtonExample extends JFrame {
    public static void main(String[] args) {

        JRadioButtonExample frame = new JRadioButtonExample();


        JRadioButton b1 = new JRadioButton("car");
        JRadioButton b2 = new JRadioButton("plane");
        JRadioButton b3 = new JRadioButton( "motor");

        ButtonGroup group = new ButtonGroup();
        group.add(b1);
        group.add(b2);
        group.add(b3);



        ActionListener listener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JRadioButton b = (JRadioButton) e.getSource();
                System.out.println("Clicked: " + b.getText());
               // System.out.println(b1.isSelected());

            }
        };

        b1.addActionListener(listener);
        b2.addActionListener(listener);
        b3.addActionListener(listener);


        frame.add(b1);
        frame.add(b2);
        frame.add(b3);


        frame.setLayout(new FlowLayout());
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

    }
}
