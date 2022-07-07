package swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JPasswordFieldExample extends JFrame {

    public static void main(String[] args) {


        JPasswordFieldExample frame = new JPasswordFieldExample();

        JPasswordField p = new JPasswordField(10 );

        frame.add(p);

        p.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Password" +" "+ new String(p.getPassword() ));

            }
        });

        frame.setLayout(new FlowLayout());
        frame.setSize(300, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
