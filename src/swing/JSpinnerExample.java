package swing;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;

public class JSpinnerExample extends JFrame {

    public static void main(String[] args) {

        JSpinnerExample frame = new JSpinnerExample();

        SpinnerNumberModel spinnerModel = new SpinnerNumberModel(
                5, // wartość początkowa
                0, // wartość minimalna
                20, // wartość maksymalna
                1 // krok
        );

        JSpinner spinner = new JSpinner(spinnerModel);
                spinner.addChangeListener(
                        new ChangeListener() {
                            @Override
                            public void stateChanged(ChangeEvent e) {
                                System.out.println(spinner.getValue());
                            }
                        }
                );

        frame.add(spinner);
        frame.setLayout(new FlowLayout());
        frame.setSize(200,100);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
