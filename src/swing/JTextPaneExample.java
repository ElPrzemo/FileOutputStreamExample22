package swing;

import javax.swing.*;
import javax.swing.text.BadLocationException;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;
import java.awt.*;

public class JTextPaneExample extends JFrame {
    public static void main(String[] args) throws BadLocationException {


        JTextPaneExample frame = new JTextPaneExample();
        JTextPane textPane = new JTextPane();
        JScrollPane scrollPane = new JScrollPane(textPane);
        frame.add(scrollPane, BorderLayout.CENTER);
        textPane.setText("Lorem ipsum, lorem ipsum");

        SimpleAttributeSet attributeSet = new SimpleAttributeSet();
        StyleConstants.setBold(attributeSet, true); // true ustawi atrybut
        StyleConstants.setItalic(attributeSet, true);
        StyleConstants.setBackground(attributeSet, Color.BLUE);
        StyleConstants.setForeground(attributeSet, Color.CYAN);

        textPane.getDocument().insertString(0, "Hello Wold!", attributeSet);

        frame.setSize(300,300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
