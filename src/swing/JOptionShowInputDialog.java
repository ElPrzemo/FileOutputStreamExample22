package swing;

import javax.swing.*;

public class JOptionShowInputDialog extends JFrame {

    public static void main(String[] args) {

       /* String result = JOptionPane.showInputDialog (

                null,
                "Wpisz swoje imię: "
        );

        System.out.println("Imię: " + result); */

        String cars [] = {"Ford", "Merc", "Dodge"};

        String result = (String) JOptionPane.showInputDialog(
                null,
                null,
                "Wybierz samochód",
                JOptionPane.QUESTION_MESSAGE,
                null,
                cars,
                cars[0]

        );

}}
