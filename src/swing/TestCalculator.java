package swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TestCalculator {
    private JLabel screen;
    private boolean start;  // LOGIKA 3.2 USER ZACZYNA PISAĆ W KALKULATORZE
    private String lastCommand;  // LOGIKA 4.1  LICZBA DO KTÓREJ TWORZY SIE DZIAŁANIE
    private double result;   //logika 4.5   tworzymy wynik

    public TestCalculator () {
        start = true;
        lastCommand = "=";
        JFrame frame = new JFrame();
        screen = new JLabel("0", JLabel.RIGHT );
        screen.setFont(new Font("Arial", Font.BOLD, 16));
        frame.add(screen, BorderLayout.NORTH);

        frame.add(makeButtonsPanel(), BorderLayout.CENTER);

        frame.setSize(200, 200);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    private  JPanel makeButtonsPanel(){
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4,4));

        String buttons [] = {
                "7", "8", "9", "/",
                "4", "5", "6", "*",
                "1", "2", "3", "-",
                "0", ".", "=", "+"
        };

        for (int i = 0; i < buttons.length; i ++ ){
            panel.add(addButton(buttons[i]));
        }
        return panel;
    };

    private JButton addButton(String name){
        JButton b = new JButton(name);
        b.setFont(new Font("Arial", Font.BOLD, 16));
        b.addActionListener(calcListener);   // LOGIKA 1.2
        return b;
    };

    private ActionListener calcListener = new ActionListener() {          //LOGIKA 1.1 ZCZYTYWANIE WPISANYCH KLAWISZY W KONSOLI
        @Override
        public void actionPerformed(ActionEvent e) {
            String v = ((JButton) e.getSource()).getText();
            if ("/+-*=".indexOf(v) > 0) {           // LOGIKA 2.1 SPRAWXZAMY CZY UŻYTKOWNIK WYBRAŁ LICZBE CZY ZNAK
                calculate(v);
            } else {
                insertNumber(v);
            }
        }};

        public void calculate(String s) {  //LOGIKA 4.0   LICZENIE
            System.out.println("calculate: " + s);
            double num = Double.parseDouble( screen.getText());  //logika 4.2   pobieramy wartość wpisana przez użytkownika na ekran

            if(lastCommand.equals("=")) result = num;   //logika 4.6
            if(lastCommand.equals("+")) result += num;  //logika 4.7
            if(lastCommand.equals("*")) result *= num;
            if(lastCommand.equals("-")) result -= num;
            if(lastCommand.equals("/")) result /= num;

            screen.setText(("" + result));  //logika 4.8

            lastCommand = s;  //logika 4.3  zapisuje działanie znaku
            start = true; //logika 4.4  po zapisaniu działania użytkownik może wpisać kolejną liczbe
        }

        public void insertNumber(String s) {           // LOGIKA 3.1  wkładanie numeru do obrazu
            if (start){    // LOGIKA 3.3  SPRAWDZAMY CZY UŻYTKOWNIK COŚ WPISAŁ
                screen.setText("");
                start = false;
            }
            System.out.println("insertNumber: " + s);
            screen.setText(screen.getText() + s);
        }

        public static void main(String[] args) {

            TestCalculator calc = new TestCalculator();
        }}
