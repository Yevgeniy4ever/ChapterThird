package shiltd.myswing;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Developer on 6/6/2017.
 */
public class SwingDemo {
    SwingDemo(){
        JFrame jfm = new JFrame("A simple swing application");
        jfm.setSize(275, 100);
        jfm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JButton button = new JButton("Start");
        button.addActionListener(new Start());

        JLabel lbl = new JLabel("Label demonstration");

        jfm.add(lbl, BorderLayout.SOUTH);
        jfm.add(button, BorderLayout.NORTH);
        jfm.setVisible(true);

    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new SwingDemo();
            }
        });

    }
}
