package h02;

import java.applet.Applet;
import java.awt.*;

public class Opdracht2_2 extends Applet {

    @Override
    public void init() {

    }


    @Override
    public void paint(Graphics g) {
        g.setColor(Color.blue);
        g.drawString("Tarik", 60, 60 );
        g.setColor(Color.red);
        g.drawString("El Bachir", 60, 70 );
    }
}
