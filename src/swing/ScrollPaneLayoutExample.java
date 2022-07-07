package swing;

import javax.swing.*;

public class ScrollPaneLayoutExample {
    public static void main(String[] args) {

        JFrame frame = new JFrame();

        JLabel label = new JLabel( new ImageIcon("files\\lisc.jpg"));
        JScrollPane scrollPane = new JScrollPane(label);
        frame.add(scrollPane);


        frame.setSize(200, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}