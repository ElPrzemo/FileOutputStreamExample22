package swing;

import javax.swing.*;
import java.awt.*;

public class TooltipAppIconExample extends JFrame
{
    public static void main(String[] args) {

    JFrame frame = new JFrame();

        JButton b1 = new JButton("Click me");
        b1.setToolTipText("Klinkij mnie");         // tu sie ustala podpowiedz

        Image icaon= (new ImageIcon("files\\city.jpg.")).getImage();
        frame.setIconImage(icaon);

        frame.setLayout(new FlowLayout());
        frame.add(b1);
        frame.setSize(300,300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
}}