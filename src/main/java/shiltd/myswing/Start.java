package shiltd.myswing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Developer on 6/6/2017.
 */
public class Start implements ActionListener, Runnable {
    boolean iStop = false;
    public void run(){
        System.out.println("new thread is created");
        for(int i = 0; i < 20; i++) {
            System.out.println("HELLO");
            try {
                Thread.sleep(200);
            } catch (InterruptedException ex) {
                System.out.println(ex);
            }

        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Thread t;

        t = new Thread(new Start(), "First");
        t.start();
    }
}
