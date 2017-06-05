package shiltd.appletsandevents;

import java.applet.Applet;
import java.awt.*;

/**
 * Created by Yevgeniy on 05.06.2017.
 */

/*
    <applet code = "Param" + width=300 height=80>
        <param name = author value = "Herb Shildt"
        <param name = purpose value = "Demonstrate parameters"
        <param name = ver value = 2>
    </applet>
 */

public class Param extends Applet {
    String author;
    String purpose;
    int ver;

    public void start() {
        String temp;

        author = getParameter("author");
        if (author == null) author = "not found";

        purpose = getParameter("purpose");
        if (purpose == null) purpose = "not found";

        temp = getParameter("ver");
        try {
            if (temp != null)
                ver = Integer.parseInt(temp);
            else ver = 0;
        } catch (NumberFormatException ex){
            System.out.println(ex);
        }
    }

    public void paint(Graphics g){
        g.drawString("Purpose: " + purpose, 10, 20);
        g.drawString("By: " + author, 10, 40);
        g.drawString("Version " + ver, 10, 60);
    }
}
