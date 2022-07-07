package swing;

import javax.swing.*;
import java.awt.*;

public class JTableExammple extends JFrame {

    public static void main(String[] args) {

        JTableExammple frame = new JTableExammple();

        String columns[] = {"Manufacturer", "Name", "Year", "Top Speed"};
        String data [][] ={
                {"Ford", "T", "1920", "40" },
                {"Ford", "Mustang", "1970", "200"}
        };

        JTable jt = new JTable(data, columns);
        jt.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);

        JScrollPane pane = new JScrollPane(jt);
        pane.setPreferredSize(new Dimension(300, 100));

        frame.add(pane, BorderLayout.CENTER);
        frame.pack();

        jt.setValueAt("35", 0, 3);
        System.out.println(jt.getValueAt(1,1));

        System.out.println("column count: " + jt.getColumnCount() );
        System.out.println( "columnt name: " + jt.getColumnName(0));


        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);


    }


}
