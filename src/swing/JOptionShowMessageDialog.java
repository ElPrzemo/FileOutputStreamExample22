package swing;

import javax.swing.*;

public class JOptionShowMessageDialog extends JFrame {

    public static void main(String[] args) {
        JOptionShowMessageDialog frame = new JOptionShowMessageDialog();

        /*JOptionPane.showMessageDialog(frame,
                "Hello",
                "Title",
        JOptionPane.PLAIN_MESSAGE); */

        ImageIcon icon = new ImageIcon( "files//city_small.jpg");
        JOptionPane.showMessageDialog(null,
                "<html><u> Hello world </u></html>",
                "title",
                JOptionPane.ERROR_MESSAGE,
                icon);


        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
      //  frame.setVisible(true);
    }
}
