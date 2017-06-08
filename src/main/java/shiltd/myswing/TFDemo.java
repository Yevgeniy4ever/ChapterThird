package shiltd.myswing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Developer on 6/7/2017.
 */
public class TFDemo implements ActionListener {
    JLabel infoLbl, contentLbl;
    JButton button;
    JTextField txtF;

    TFDemo(){
        JFrame frame = new JFrame("Use а Text Field");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());
        frame.setSize(240, 120);

        infoLbl = new JLabel("Enter text: ");
        contentLbl = new JLabel("");
        button = new JButton("Reverse");
        txtF = new JTextField(10);

        txtF.setActionCommand("myTF");
/*        button.setActionCommand();*/

        button.addActionListener(this);
        txtF.addActionListener(this);


        frame.add(infoLbl);
        frame.add(txtF);
        frame.add(button);
        frame.add(contentLbl);


        frame.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getActionCommand().equals("Reverse"))
            contentLbl.setText(acReverse(txtF.getText()));
        else contentLbl.setText("You pressed ENTER. Text is: " +
                txtF.getText());
    }

    public String acReverse(String str){
        String result = "";
        for(int i = str.length()-1; i >= 0; i--){
            result += str.charAt(i);
        }
        return result;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new TFDemo();
            }
        });
    }
}
