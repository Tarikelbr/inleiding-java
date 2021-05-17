package h08;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PraktijkOpdracht_8 extends Applet {
TextField tekstvak1, tekstvak2;
Button keerKnop, deelKnop, plusKnop, minKnop;
double invoerGetal1, invoerGetal2, antwoord;



    public void init() {
        setSize(500, 100);
        keerKnop = new Button("*");
        keerKnop.addActionListener( new KeerKnopListener());
        add(keerKnop);
        deelKnop = new Button("/");
        deelKnop.addActionListener( new DeelKnopListener() );
        add(deelKnop);
        plusKnop = new Button("+");
        plusKnop.addActionListener( new PlusKnopListener() );
        add(plusKnop);
        minKnop = new Button("-");
        minKnop.addActionListener( new MinKnopListener() );
        add(minKnop);
        tekstvak1 = new TextField("", 20);
        add(tekstvak1);
        tekstvak2 = new TextField("", 20);
        add(tekstvak2);
    }

    class KeerKnopListener implements ActionListener   {
        @Override
        public void actionPerformed(ActionEvent e) {
            invoerGetal1 = Double.parseDouble(tekstvak1.getText());
            invoerGetal2 = Double.parseDouble(tekstvak2.getText());
            antwoord = invoerGetal1 * invoerGetal2;
            tekstvak1.setText("" + antwoord);
            repaint();
        }
    }
    class DeelKnopListener implements ActionListener   {
        @Override
        public void actionPerformed(ActionEvent e) {
            invoerGetal1 = Double.parseDouble(tekstvak1.getText());
            invoerGetal2 = Double.parseDouble(tekstvak2.getText());
            antwoord = invoerGetal1 * invoerGetal2;
            tekstvak1.setText("" + antwoord);
            repaint();
        }
    }
    class PlusKnopListener implements ActionListener  {
        @Override
        public void actionPerformed(ActionEvent e) {
            invoerGetal1 = Double.parseDouble(tekstvak1.getText());
            invoerGetal2 = Double.parseDouble(tekstvak2.getText());
            antwoord = invoerGetal1 + invoerGetal2;
            tekstvak1.setText("" + antwoord);
        }
    }
    class MinKnopListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            invoerGetal1 = Double.parseDouble(tekstvak1.getText());
            invoerGetal2 = Double.parseDouble(tekstvak1.getText());
            antwoord = invoerGetal1 - invoerGetal2;
            tekstvak1.setText("" + antwoord);
        }
    }


































}
