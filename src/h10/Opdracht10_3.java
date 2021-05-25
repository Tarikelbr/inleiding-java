package h10;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Opdracht10_3 extends Applet {
    TextField tekstvak;
    Button okKnop;
    int hoogsteGetal, laagsteGetal, getal;
    boolean geklikt, foutmelding;
    String error;


    public void init() {
        hoogsteGetal = 0;
        laagsteGetal = 0;
        getal = 0;
        geklikt = false;
        foutmelding = false;
        tekstvak = new TextField("", 30);
        add(tekstvak);
        okKnop = new Button("Ok");
        okKnop.addActionListener(new KnopListener());
        add(okKnop);
    }


    public void paint(Graphics g) {
        if (foutmelding == false) {
            g.drawString("Hoogste Getal: " + hoogsteGetal, 50, 60);
            g.drawString("Laagste Getal: " + laagsteGetal, 50, 80);
        } else {
            g.drawString("" + error, 50, 60);
            foutmelding = false;

        }
    }

    class KnopListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            try {
                String tekstvakGetal = tekstvak.getText();
                getal = Integer.parseInt(tekstvakGetal);
                if (getal > hoogsteGetal && getal != Integer.MAX_VALUE && getal < Integer.MAX_VALUE) {
                    hoogsteGetal = getal;
                }
                if (getal < laagsteGetal && getal != Integer.MIN_VALUE && getal > Integer.MIN_VALUE) {
                    laagsteGetal = getal;
                }
                if (geklikt == false) {
                    laagsteGetal = hoogsteGetal;
                }
                tekstvak.setText("");
                geklikt = true;
                foutmelding = false;
                repaint();

            } catch (NumberFormatException exc) {
                foutmelding = true;
                error = "de variable klopt niet.";
                tekstvak.setText("");
                repaint();
            }

        }

    }
}