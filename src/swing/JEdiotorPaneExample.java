package swing;

import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import java.awt.*;

public class JEdiotorPaneExample extends JFrame {

    public static void main(String[] args) {

        JEditorPaneExample frame = new JEditorPaneExample();

        JEditorPane editor = new JEditorPane(
                "text/html",
                "<html><h5>Title</h5><p>lorem ipsum</> <p> lorem ipsum </p>  </html>"
        );
        editor.setEditable(true);
        editor.getDocument().addDocumentListener(
                new DocumentListener() {
                    @Override
                    public void insertUpdate(DocumentEvent e) {
                        System.out.println("insert update" + editor.getText());
                    }
                    @Override
                    public void removeUpdate(DocumentEvent e) {
                        System.out.println("remove update" );
                    }
                    @Override
                    public void changedUpdate(DocumentEvent e) {
                        System.out.println("change update");
                    }
                }
        );
        JScrollPane pane = new JScrollPane(editor);

        frame.add(pane, BorderLayout.CENTER);
        frame.setSize(300,300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
