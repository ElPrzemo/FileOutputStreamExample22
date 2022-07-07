package swing;

import javax.swing.*;
import java.awt.geom.Area;

public class JOptionPaneShowOpitonDialog {

    public static void main(String[] args) {

       String options[] = {"Save", "Load Latest", "Compile", "Abort"};

           int result = JOptionPane.showOptionDialog(
                   null,
                   "What do do with this project?",
                   "Projecy 001",
                   JOptionPane.DEFAULT_OPTION,
                   JOptionPane.QUESTION_MESSAGE,
                   null,
                   options,
                   options[0]
           );

           System.out.println("Wybrano: "+ options[result]);


        JTextArea area = new JTextArea(8, 16);
           JTextField email = new JTextField(10);
           Object options2[] = {
                   new JLabel("Emaile :"),
        email,
                "send",
                "cancel"

  };

        int result2 = JOptionPane.showOptionDialog(
                null,
                area,

                "Send email",
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null,
                options2,
                options2[0]
        );

        System.out.println("Textarea" + area.getText());
        System.out.println("Email: " + email.getText());
        System.out.println("result2" + result2 );

    }
}
