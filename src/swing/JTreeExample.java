package swing;

import javax.swing.*;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.TreeSelectionModel;
import java.awt.*;

public class JTreeExample extends JFrame {

    public static void main(String[] args) {

        JTreeExample frame = new JTreeExample();

        DefaultMutableTreeNode root = new DefaultMutableTreeNode("root");
        JTree tree = new JTree(root);

        DefaultMutableTreeNode cars = new DefaultMutableTreeNode("cars");

        cars.add(new DefaultMutableTreeNode("dodge"));
        cars.add(new DefaultMutableTreeNode("polonez"));
        cars.add(new DefaultMutableTreeNode("maluch"));
        root.add(cars);

        DefaultMutableTreeNode bikes = new DefaultMutableTreeNode("bikes");

        bikes.add(new DefaultMutableTreeNode("jubilat"));
        bikes.add(new DefaultMutableTreeNode("góral"));
        root.add(bikes);

        for(int i = 0; i < tree.getRowCount(); i++) tree.expandRow(i); // ten wpis otwiera wszystkie gałezie

        tree.getSelectionModel().setSelectionMode(TreeSelectionModel.SINGLE_TREE_SELECTION);
        tree.getSelectionModel().addTreeSelectionListener(
                new TreeSelectionListener() {
                    @Override
                    public void valueChanged(TreeSelectionEvent e) {
                        Object el = e.getNewLeadSelectionPath().getLastPathComponent();
                        DefaultMutableTreeNode node = (DefaultMutableTreeNode) el;
                        System.out.println("selected: " +  node.toString());
                    }
                }
        );

        frame.add(tree);
        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
