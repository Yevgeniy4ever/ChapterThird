package shiltd.appletsandevents;

import java.applet.Applet;
import java.awt.*;

/**
 * Created by Yevgeniy on 05.06.2017.
 */
public class StatusWindow extends Applet {
    @Override
    public void paint(Graphics g) {
        g.drawString("This is the applet window", 10, 20);
        showStatus("This is shown in the status window");
    }
}
