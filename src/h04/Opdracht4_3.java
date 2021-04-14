package h04;

import java.applet.Applet;
import java.awt.*;

public class Opdracht4_3 extends Applet {


    @Override
    public void init() {
    }

    @Override
    public void paint(Graphics g)
    {


        int [] x = {150, 300, 225};
        int [] y = {150, 150, 25};
        g.drawRect(150, 150, 150, 200); //huis
        g.drawRect(200, 200, 50, 150); // Deur
        g.drawOval(200, 75, 50, 50);
        g.drawPolygon(x, y, 3); // dak




    }






}
