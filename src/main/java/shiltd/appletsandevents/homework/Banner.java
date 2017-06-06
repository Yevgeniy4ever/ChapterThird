package shiltd.appletsandevents.homework;

import java.applet.Applet;
import java.awt.*;
import java.util.Calendar;
/*
<applet code = " Banner" width = 300 height = 50>
<applet/>
 */

/**
 * Created by Yevgeniy on 04.06.2017.
 */
public class Banner extends Applet implements Runnable{
    String msg = " Java rules the Web";
    Thread t;
    boolean stopFlag;
    Calendar date;

    public void init(){
        t = null;
    }

    @Override
    public void showStatus(String msg) {
        super.showStatus(msg);
    }

    public void start(){
        t = new Thread(this);
        stopFlag = false;
        t.start();
    }

    public void run(){
        for( ; ; ){
            try{
                repaint();
                Thread.sleep(1000);
                if(stopFlag)
                    break;
            } catch (InterruptedException ex){ }
        }
    }

    public void stop(){
        stopFlag = true;
        t = null;
    }

    public void paint(Graphics g){
        date = Calendar.getInstance();
        g.drawString(date.getTime().toString(), 50, 30);
    }

}
