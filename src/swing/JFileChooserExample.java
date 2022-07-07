package swing;

import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.awt.*;
import java.io.File;

public class JFileChooserExample extends JFrame {

    public static void main(String[] args) {

        JFileChooserExample frame = new JFileChooserExample();

        JFileChooser fc = new JFileChooser();
        FileNameExtensionFilter filter = new FileNameExtensionFilter("Files", "mp4", "dat", "txt", "jpg" );

        fc.addChoosableFileFilter(filter);

        int result = fc.showOpenDialog(null);

        switch (result) {
            case JFileChooser.APPROVE_OPTION -> {
                File file = fc.getSelectedFile();
                System.out.println(file.getAbsolutePath());
            }
            case JFileChooser.CANCEL_OPTION -> System.out.println("JFileChooseer cancel");
            case JFileChooser.ERROR_OPTION -> System.out.println("JFileChooseer error");
        }

        frame.setLayout(new FlowLayout());
        frame.setSize(300, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

    }
}
