package shiltd.myswing;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.*;

/**
 * Created by Developer on 6/8/2017.
 */
public class ListDemo implements ListSelectionListener {
    JLabel gLabel;
    JList<String> gList;
    JScrollPane scrollPane;
    String[] ar = {"first", "second", "third", "fourth", "fifth"};

    ListDemo(){
        JFrame frame = new JFrame("List demostration");
        frame.setLayout(new FlowLayout());

        frame.setSize(200, 160);
        gList = new JList<>(ar);
        gList.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        scrollPane = new JScrollPane(gList);
        scrollPane

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        frame.add(scrollPane);

        frame.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new ListDemo();
            }
        });
    }

    @Override
    public void valueChanged(ListSelectionEvent e) {

    }
}
