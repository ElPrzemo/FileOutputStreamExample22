package swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;

    public class JProgresBarExample extends JFrame {
        public static void main(String[] args) {

            JProgresBarExample frame = new JProgresBarExample();

            JProgressBar progressBar = new JProgressBar();

            progressBar.setMinimum(0);
            progressBar.setMaximum(200);

            Thread t = new Thread(new Runnable() {
                @Override
                public void run() {
                    try{ for (int i  = 0; i <=200; i+=20){
                        Thread.sleep(200);
                        progressBar.setValue(i);
                    }

                    }catch (InterruptedException e){
                        e.printStackTrace();

                }}
            });
            frame.add(progressBar);
            t.start();

            frame.setLayout(new FlowLayout());
            frame.setSize(500, 500);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);

        }}

