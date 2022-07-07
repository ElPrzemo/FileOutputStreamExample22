package swing;

import javax.swing.*;
import java.awt.*;

public class GridLayoutExample {
    public static void main(String[] args) {


        JFrame frame = new JFrame();

        frame.setLayout(new GridLayout(5,5 ));

        for(int i = 0; i <25; i++){
            frame.add(new JButton("" + i));
        }

        frame.setSize(300, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}