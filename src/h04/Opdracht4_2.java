package h04;

import java.applet.Applet;
import java.awt.*;

public class Opdracht4_2 extends Applet {

    @Override
    public void init() {
    }


    @Override
    public void paint(Graphics g) {

        g.fillOval(60,450,120,50);
        g.fillRect(110, 60, 10, 400);
        g.setColor(Color.red);
        g.fillRect(120, 80, 150, 30);
        g.setColor(Color.white);
        g.fillRect(120, 110, 150, 30);
        g.setColor(Color.blue);
        g.fillRect(120, 140, 150, 30);
    }
}
