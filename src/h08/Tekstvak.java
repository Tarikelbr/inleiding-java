package h08;

import java.applet.Applet;
import java.awt.*;

public class Tekstvak extends Applet {

TextField tekstvak;



    public void init() {
        tekstvak = new TextField("Klik op mij" , 20);
        add(tekstvak);

    }


    public void paint(Graphics g) {
        g.drawString("Type iets in het tekstvakjes", 50 , 60);
    }
}
