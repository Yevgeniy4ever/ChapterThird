package shiltd.myswing.homework;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

/**
 * Created by Developer on 6/9/2017.
 */
public class MyCompareFiles implements ActionListener{
    JLabel fLabel;
    JLabel sLabel;
    JLabel resultLabel;

    JTextField fField;
    JTextField sField;

    JButton compButton;


    MyCompareFiles(){
        JFrame frame = new JFrame("Compare Files");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(200, 200);
        frame.setLayout(new FlowLayout());

        fField = new JTextField(15);
        sField = new JTextField(15);

        fLabel = new JLabel("First file: ");
        sLabel = new JLabel("Second file: ");
        resultLabel = new JLabel("");

        compButton = new JButton("Compare");

        compButton.addActionListener((e) -> compareIt(readFromFile(fField.getText()), readFromFile(sField.getText())));

        frame.add(fLabel);
        frame.add(fField);
        frame.add(sLabel);
        frame.add(sField);
        frame.add(compButton);
        frame.add(resultLabel);

        frame.setVisible(true);
    }

    private void compareIt(String first, String second){
        if (first.compareTo(second) == 0) resultLabel.setText("These strings are the same");
        else resultLabel.setText("These strings are differents");
    }

    public String readFromFile(String way){
        String result = "";

        try (BufferedReader reader = new BufferedReader(new FileReader(way))){
            result = reader.readLine();
        } catch(FileNotFoundException ex){
            System.out.println("Error " + ex);
        } catch(Exception ex){
            System.out.println("Error " + ex);
        }

        return result;
    }


    @Override
    public void actionPerformed(ActionEvent e) {

    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new MyCompareFiles());
    }
}
