package shiltd.appletsandevents.homework;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

/**
 * Created by Yevgeniy on 05.06.2017.
 */
public class ExerciseSeven extends Applet
        implements MouseListener, MouseMotionListener {
    static int[] mouseX = new int[100000];
    static int[] mouseY = new int[100000];
    static int count = 0;
    boolean isStart = false;
    boolean isMoved = false;

    public void init(){
        addMouseListener(this);
        addMouseMotionListener(this);
    }

    public void start(){

    }



    @Override
    public void mouseClicked(MouseEvent me){

    }

    @Override
    public void mouseEntered(MouseEvent me){

    }

    @Override
    public void mouseExited(MouseEvent me){

    }

    @Override
    public void mousePressed(MouseEvent me){
        isStart = true;
    }

    @Override
    public void mouseReleased(MouseEvent me){
        isStart = false;
    }

    @Override
    public void mouseDragged(MouseEvent me){
        if(isStart) {
            mouseX[count] = me.getX();
            mouseY[count] = me.getY();
            repaint();
            count++;
        }
    }

    @Override
    public void mouseMoved(MouseEvent me){

    }

    public void paint(Graphics g){
        g.setColor(Color.red);
        if(isStart) {
            for (int i = 0; i < mouseX.length-2; i++) {
                g.drawLine(mouseX[i], mouseY[i], mouseX[i+1], mouseY[i+1]);
            }
        }
        /*

        if(isStart)
            while(isMoved)
        while(isStart) {

            if(isMoved) {

                System.out.println(mouseX[count - 1]);
                System.out.println(mouseY[count - 1]);
                System.out.println(mouseX[count]);
                System.out.println(mouseY[count]);
                g.drawLine(mouseX[count - 1], mouseY[count - 1], mouseX[count], mouseY[count]);
                isStart = false;*/
    }
}
