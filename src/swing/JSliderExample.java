package swing;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class JSliderExample extends JFrame {

    public static void main(String[] args) {

        JSliderExample frame = new JSliderExample();


        JSlider slider = new JSlider(JSlider.HORIZONTAL, 0, 100, 30);

        slider.addChangeListener(
                new ChangeListener() {
                    @Override
                    public void stateChanged(ChangeEvent e) {
                        int value = slider.getValue();
                        System.out.println("Slider: " + value);
                    }
                }
        );

        frame.add(slider);
        frame.setSize(200, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

    }
}
