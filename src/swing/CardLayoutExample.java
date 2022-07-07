package swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CardLayoutExample {

    public static void main(String[] args) {
        JFrame frame = new JFrame();

        Container pane = frame.getContentPane();
        CardLayout layut = new CardLayout();
        pane.setLayout(layut);

        for(int i = 0; i<5; i++){
            JButton b = new JButton(""+ i);
            pane.add(b, "button"+i);
            final int num = i;
            b.addActionListener(
                    new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            int nextID = num+1;
                            if(nextID >= 5) nextID = 0;
                            layut.show(pane, "button"+ nextID);
                        }
                    }
            );
        }
        frame.setSize(200, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
