package h08;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Opdracht8_2 extends Applet {
    Button man, vrouw, meisje, jonge, reset;
    int totaalMan = 0, totaalVrouw = 0, totaalMeisje = 0, totaalJongen = 0, totaalBezoekers = 0;


    public void init() {
        setSize(500,300);

        man = new Button("Man");
        man.addActionListener(new ManListener() );
        add(man);



        meisje = new Button("Meisje");
        meisje.addActionListener(new MeisjeListener());
        add(meisje);

        jonge = new Button("Jongen");
        jonge.addActionListener(new JongenListener() );
        add(jonge);
    }


    public void paint(Graphics g) {
        g.drawString("Aantal Mannen:"+ totaalMan, 50, 120);
        g.drawString("Aantal Vrouwen:"+ totaalVrouw, 50, 140 );
        g.drawString("Aantal Meisjes:"+ totaalMeisje, 50, 160 );
        g.drawString("Aantal Jongens:"+ totaalJongen, 50, 180 );
        g.drawString("Totaal Bezoekers:"+ totaalBezoekers, 50, 200 );
    }

    class ManListener implements ActionListener{

        public void actionPerformed(ActionEvent e) {
            totaalVrouw++;
            totaalBezoekers++;
            repaint();
        }
    }

    class MeisjeListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            totaalMeisje++;
            totaalBezoekers++;
            repaint();
        }
    }

    class JongenListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
          totaalMan = 0;
          totaalVrouw = 0;
          totaalMeisje = 0;
          totaalJongen = 0;
          totaalBezoekers = 0;
          repaint();
        }
    }








}
