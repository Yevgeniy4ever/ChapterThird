package shiltd.myswing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Yevgeniy on 09.06.2017.
 */

/*
<object code = "MySwingApplet" width = 200 height = 80>
</object>
 */
public class MySwingApplet extends JApplet{
    JButton buttonUp;
    JButton buttonDown;

    JLabel label;

    public void init(){
        try{
            SwingUtilities.invokeAndWait(() -> makeGUI());
        }catch (Exception ex){
            System.out.println("Can't create because " + ex);
        }
    }

    private void makeGUI(){

        setLayout(new FlowLayout());

        buttonUp = new  JButton("UP");
        buttonDown = new JButton("DOWN");

        label = new JLabel("Press a button");

        buttonDown.addActionListener((ActionEvent e) ->
                label.setText("You pressed button Down"));
        buttonUp.addActionListener((ActionEvent e) ->
                label.setText("You pressed button UP"));

        add(buttonDown);
        add(buttonUp);
        add(label);



    }



}
