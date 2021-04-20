package h05;

import java.applet.Applet;
import java.awt.*;

public class Opdracht5_1 extends Applet {


    public void init() {
    Color opvulkleur = Color.red;
    Color lijnkleur = Color.blue;
    int breedte = 200;
    int hoogte = 100;

    }

    public void paint(Graphics g) {
        int hoogte = 100;
        int breedte = 200;
        g.drawRect(100, 100, breedte, hoogte);
        g.drawRoundRect(100, 225, breedte, hoogte, 30, 30);
        g.setColor(Color.red);
        g.fillRect(315, 100, breedte, hoogte);
        g.setColor(Color.red);
        g.drawOval(315, 100, breedte, hoogte);
        g.setColor(Color.red);
        g.fillOval(315, 225, breedte, hoogte);
        g.fillOval(550,200,150,140);





    }
}
