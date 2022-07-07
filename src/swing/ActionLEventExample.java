package swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ActionLEventExample extends JFrame implements ActionListener {

    JButton button1;
    JButton button2;
    JButton button3;




    public void initUI () {this.setLayout(new GridLayout());
        button1 = new JButton("click me");
        button1.addActionListener(this);
        this.add(button1);



        button2 = new JButton("Also me");
        button2.addActionListener(this);
        this.add(button2);


        button3 = new JButton("and me");
        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("trójeczka");
            }
        });
        this.add(button3);



}
    @Override
    public void actionPerformed(ActionEvent e) {
        if(button1.equals(e.getSource())){
            System.out.println("jedyneczka");
        }else if(button2.equals(e.getSource())){
            System.out.println("dwójeczka");
        }}
    public static void main(String[] args) {

        ActionLEventExample frame = new ActionLEventExample();

        frame.initUI();



        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

    }

}