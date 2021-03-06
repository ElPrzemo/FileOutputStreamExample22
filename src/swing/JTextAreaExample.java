package swing;

import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import java.awt.*;

public class JTextAreaExample extends JFrame {

    public static void main(String[] args) {


        JTextAreaExample frame = new JTextAreaExample();

        JTextArea t = new JTextArea(7,14);
        JScrollPane pane = new JScrollPane(t);

        t.append("Lorem ipsum");
        t.append(" and other text");
        t.insert("hello world", 7);
        t.setLineWrap(true);

        t.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                System.out.println("insertUpdate:" + t.getText());

            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                System.out.println("remove update:" + t.getText());

            }

            @Override
            public void changedUpdate(DocumentEvent e) {

            }
        });

        frame.add(pane);

        frame.setLayout(new FlowLayout());
        frame.setSize(400,400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
