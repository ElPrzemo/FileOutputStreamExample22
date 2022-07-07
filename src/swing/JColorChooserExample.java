package swing;

import javax.swing.*;
import java.awt.*;

public class JColorChooserExample extends JFrame {

    public static void main(String[] args) {

        JColorChooserExample frame = new JColorChooserExample();

        Color color = JColorChooser.showDialog(frame, "wybierz kolor", Color.BLUE);
        System.out.println("Wybrany kolor: "+ color);

        JLabel label = new JLabel("label");

        frame.add(label);
        label.setForeground(color);

        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

    }
}
