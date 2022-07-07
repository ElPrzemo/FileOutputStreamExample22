package swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JDialogExample extends JFrame {

    public static void main(String[] args) {

        JDialogExample frame = new JDialogExample();

        JDialog dialog = new JDialog(frame, "Dialog example", true);
        dialog.setLayout(new FlowLayout());


        JButton dialogButton = new JButton("Close dialog");

        dialogButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dialog.setVisible(false);
            }
        });

        dialog.add(dialogButton);
        dialog.setSize(300,300);

        frame.setLayout(new FlowLayout());

        frame.setLayout(new FlowLayout());
        frame.setSize(200,100);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

        dialog.setVisible(true);
    }
}

