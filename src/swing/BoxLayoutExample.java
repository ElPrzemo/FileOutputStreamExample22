package swing;

import javax.swing.*;

public class BoxLayoutExample {
    public static void main(String[] args) {

        JFrame frame = new JFrame();
        frame.setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.X_AXIS));

        for(int i = 0; i <25; i++){
            frame.add(new JButton("" + i));
        }


        frame.setSize(200, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
