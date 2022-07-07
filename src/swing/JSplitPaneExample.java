package swing;

import javax.swing.*;
import java.awt.*;

public class JSplitPaneExample extends JFrame {
    public static void main(String[] args) {

        JSplitPaneExample frame = new JSplitPaneExample();

        JPanel panel1 = new JPanel();
        String cars [] = {"Ford", "Pontiac", "Polonez"};
        panel1.add(new JComboBox<String>(cars));

        JPanel panel2 = new JPanel();
        String bikes [] = {"Honda", "Bmw", "Kawasaki"};
        panel2.add(new JComboBox<String>(bikes));

        JSplitPane splitPane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, panel1, panel2);

         frame.add(splitPane, BorderLayout.CENTER);
        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

    }
}
