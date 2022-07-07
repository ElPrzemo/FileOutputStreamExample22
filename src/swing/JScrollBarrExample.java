package swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;
import java.sql.SQLOutput;

public class JScrollBarrExample extends JFrame {

    public static void main(String[] args) {

        JScrollBarrExample frame = new JScrollBarrExample();


        JScrollBar scroll1 = new JScrollBar(Adjustable.HORIZONTAL);
        scroll1.setValue(20);
        scroll1.setMinimum(0);
        scroll1.setMaximum(100);
        scroll1.setPreferredSize(new Dimension(170, 35));

        frame.add(scroll1);

        scroll1.addAdjustmentListener(
                new AdjustmentListener() {
                    @Override
                    public void adjustmentValueChanged(AdjustmentEvent e) {
                        if(e.getValueIsAdjusting()) return;
                        System.out.println("Scroll value: " + e.getValue());
                    }
                }
        );

        frame.setLayout(new FlowLayout());
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

    }
}
