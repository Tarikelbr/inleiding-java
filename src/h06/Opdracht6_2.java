package h06;

import java.applet.Applet;
import java.awt.*;

public class Opdracht6_2 extends Applet {

    int uur = 60 * 60;
    int dag = uur * 24;
    int jaar = dag * 365;

    @Override
    public void init() {

    }


    @Override
    public void paint(Graphics g) {
    g.drawString("uur; " + uur , 20,20);
    g.drawString("dag; " + dag , 20,40);
    g.drawString("jaar; "+ jaar, 20,80);
    }
}
