package h04;

import java.applet.Applet;
import java.awt.*;

public class PraktijkOpdracht4 extends Applet {




    public void init() {

        setSize(700, 300);

    }

    public void paint(Graphics g) {
        g.drawLine(20, 20, 200, 20);
        g.drawString("Lijn", 100, 35 );
        //Rechthoek
        g.drawRect(20, 40, 180, 80);
        g.drawString("Rechthoek", 75, 135 );
        //Afgeronde Rechthoek
        g.drawRoundRect(20, 140, 180, 80, 10, 10);
        g.drawString("Afgeronde Rechthoek", 45, 235 );
        //Gevulde Rechthoek met Ovaal
        g.setColor(Color.magenta);
        g.fillRect(210, 40, 180, 80);
        g.setColor(Color.black);
        g.drawOval(210, 40, 180, 80);
        g.drawString("Gevulde Rechthoek met Ovaal", 220, 135 );
        //Gevulde Ovaal
        g.setColor(Color.magenta);
        g.fillOval(210, 140, 180, 80);
        g.setColor(Color.black);
        g.drawString("Gevulde Ovaal", 260, 235 );
        //Taartpunt met Ovaal eromheen
        g.setColor(Color.magenta);
        g.fillArc(400, 20, 200, 100, 10, 45);
        g.setColor(Color.black);
        g.drawArc(400, 20, 200, 100, 90, 360);
        g.drawString("Taartpunt met Ovaal eromheen", 420, 135 );
        //Cirkel
        g.drawOval(450, 140, 80, 80);
        g.drawString("Cirkel", 475, 235 );

    }
}
























