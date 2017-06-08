package shiltd.myswing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Developer on 6/6/2017.
 */
public class ButtonDemo implements ActionListener{

        JLabel label;

        ButtonDemo(){
            JFrame frame = new JFrame("A Button example");

            frame.setLayout(new FlowLayout());

            frame.setSize(220, 90);

            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            JButton buttonUp = new JButton("UP");
            JButton buttonDown = new JButton("DOWN");

            buttonUp.addActionListener(this);
            buttonDown.addActionListener(this);

            frame.add(buttonUp);
            frame.add(buttonDown);

            label = new JLabel("Press a button.");
            frame.add(label);

            frame.setVisible(true);


        }

        public void actionPerformed(ActionEvent ae){
            if(ae.getActionCommand().equals("UP"))
                label.setText("You pressed UP");
            else label.setText("You pressed DOWN");

        }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable(){
           public void run(){
               new ButtonDemo();
           }
        });
    }
}
