package h10;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Opdracht10_5 extends Applet {

    TextField maandTekstvak, jaarTekstvak;
    Button okKnop;
    int maand, jaartal;
    String dagen, maandNaam, schrikkeljaar, error;
    Label maandLabel, jaarLabel;
    boolean foutmelding;


    public void init() {
        maand = 0;
        jaartal = 0;
        dagen = "";
        maandNaam = "";
        schrikkeljaar = "";
        error = "";
        setSize(900, 150);
        maandLabel = new Label("Voer het maandgetal in");
        add(maandLabel);
        maandTekstvak = new TextField("", 30);
        add(maandTekstvak);
        jaarLabel = new Label("Voer het jaar in");
        add(jaarLabel);
        jaarTekstvak = new TextField("", 30);
        add(jaarTekstvak);
        okKnop = new Button("Ok");
        okKnop.addActionListener(new OkKnopListener());
        add(okKnop);
    }


    public void paint(Graphics g) {
        if (foutmelding == false) {
            g.drawString("Maand: " + maandNaam, 50, 60);
            g.drawString("Schrikkeljaar: " + schrikkeljaar, 50, 80);
            g.drawString("Aantal Dagen: " + dagen, 50, 100);
        }else{
            g.drawString("" + error, 50 ,60);
            foutmelding = false;



        }
    }
    class OkKnopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String jaarTekstvakGetal = jaarTekstvak.getText();
            jaartal = Integer.parseInt(jaarTekstvakGetal);
            String maandTekstvakGetal = maandTekstvak.getText();
            maand = Integer.parseInt(maandTekstvakGetal);
            switch(maand) {

                case 1:
                    maandNaam = "januari";
                    dagen = "31";
                    break;

                case 2:
                    if ((jaartal % 4 == 0 && !(jaartal % 100 == 0)) ||
                            jaartal % 400 == 0) {
                        maandNaam = "februari";
                        dagen = "29";
                    } else {
                        maandNaam = "februari";
                        dagen = "28";
                    }
                    break;

                case 3:
                    maandNaam = "maart";
                    dagen = "30";
                    break;
                case 4:
                    maandNaam = "April";
                    dagen = "31";
                    break;

            }
    }










}}