package shiltd.myswing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

/**
 * Created by Developer on 6/8/2017.
 */
public class ListDemo implements ItemListener{
    JLabel gLabel;
    JList<String> gList;
    String[] ar = {"first", "second", "third", "fourth", "fifth"};

    ListDemo(){
        JFrame frame = new JFrame("List demostration");
        frame.setLayout(new FlowLayout());

        frame.setSize(200, 120);
        gList = new JList<>(ar);
        gList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        JScrollPane scroll = new JScrollPane(gList);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.add(gList);
        frame.add(scroll);

        frame.setVisible(true);
    }

    @Override
    public void itemStateChanged(ItemEvent e) {

        int idx = gList.getSelectedIndex();



    }


    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new ListDemo();
            }
        });
    }
}
