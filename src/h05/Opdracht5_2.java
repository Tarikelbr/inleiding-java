package h05;

import java.applet.Applet;
import java.awt.*;

public class Opdracht5_2 extends Applet {

    int max = 300;

    int gewichtValerie = 40;
    int gewichtHans = 80;
    int gewichtJeroen = 100;

    public void init() {

    }



    public void paint(Graphics g) {

        g.drawRect(100, max - (gewichtValerie * 3), 50, gewichtValerie * 3);
        g.drawRect(150, max - (gewichtHans * 3),50,gewichtHans * 3);
        g.drawRect(200, max - (gewichtJeroen * 3),50,gewichtJeroen * 3);
        g.drawString("Valerie", 100,370);
        g.drawString("" + gewichtValerie,100, 380 );
        g.drawString("Hans", 150,370);
        g.drawString("" +gewichtHans ,150,380 );
        g.drawString("Jeroen",200, 370);
        g.drawString("" +gewichtJeroen, 200, 380);



    }
}
