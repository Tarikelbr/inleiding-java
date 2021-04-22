package h06;

import java.applet.Applet;
import java.awt.*;

public class Opdracht6_3 extends Applet {


int a;
int b;
int c;
int Uitkomst;

    public void init() {

    a = 5;
    b = 5;
    c = 15;
    Uitkomst = (a + b) - c;

    }


    public void paint(Graphics g) {
     g.drawString(" 5 + 5 - 15", 20, 20);
        g.drawString("de Uitkomst is negatief:  " + Uitkomst, 20, 40);
    }
}
