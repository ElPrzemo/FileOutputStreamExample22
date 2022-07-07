package swing;

import javax.swing.*;
import java.awt.event.*;

public class MouseListenerMouseMotionListenerExample extends JFrame implements MouseListener                       {

    @Override
    public void mouseClicked(MouseEvent e) {

        System.out.println("Mouse Clicked ");
        System.out.println("Click count: " +e.getClickCount());
        System.out.println("Winodw x:" +e.getXOnScreen());
        System.out.println("Window y" +e.getYOnScreen());
        System.out.println(" Button number: " + e.getButton());





    }

    @Override
    public void mousePressed(MouseEvent e) {
        System.out.println("Mouse Pressed");

    }

    @Override
    public void mouseReleased(MouseEvent e) {
        System.out.println("Mouse Relased");

    }

    @Override
    public void mouseEntered(MouseEvent e) {

        System.out.println("Mouse Entered ");


    }

    @Override
    public void mouseExited(MouseEvent e) {

        System.out.println("Mouse Exited");

    }}

