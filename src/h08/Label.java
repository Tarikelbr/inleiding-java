package h08;

import java.applet.Applet;
import java.awt.*;

public class Label extends Applet {

    TextField tekstvak;
    Label label;



    public void init() {
    tekstvak = new TextField("Klik op mij", 20);
    label = new Label();
    add(label);
    add(tekstvak);
    }


    public void paint(Graphics g) {
    }
}
