package h02;

import java.applet.Applet;
import java.awt.*;

public class Opdracht2_1 extends Applet {

    public void init() {
        setBackground(Color.magenta);
    }

    public void paint(Graphics g) {
        g.drawString("Welcome to Java!!", 50, 60 );
        g.setColor(Color.yellow);
    }
}
