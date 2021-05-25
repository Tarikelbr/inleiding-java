package h10;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Opdracht10_4 extends Applet {
TextField tekstvak;
Button okKnop;
int Getal;
String Dagen, maandNaam;
Label label;


    public void init() {
    setSize(500, 100);
        label = new Label("Voer het maandgetal in");
        add(label);
        tekstvak = new TextField("", 30);
        add(tekstvak);
        okKnop = new Button("Ok");
        okKnop.addActionListener( new OkKnopListener() );
        add(okKnop);
    }


    public void paint(Graphics g) {
    if (Getal > 0);
                g.drawString("Maand: " + maandNaam, 50,60);
                g.drawString("Aantal Dagen" + Dagen, 50, 80 );

    }



    class OkKnopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {

                String TekstvakGetal = tekstvak.getText();
                Getal = Integer.parseInt(TekstvakGetal);
                switch (Getal) {

                    case 1:
                        maandNaam = "januari";
                        Dagen = "31";
                        break;

                    case 2:
                        maandNaam = "februari";
                        Dagen = "28";
                        break;

                    case 3:
                        maandNaam = "maart";
                        Dagen = "31";
                        break;

                    case 4:
                        maandNaam = "April";
                        Dagen = "30";
                        break;

                    case 5:
                        maandNaam = "mei";
                        Dagen = "31";
                        break;

                    case 6:
                        maandNaam = "juni";
                        Dagen = "30";
                        break;

                    case 7:
                        maandNaam = "juli";
                        Dagen = "31";
                        break;

                    case 8:
                        maandNaam = "augustus";
                        Dagen = "30";
                        break;

                    case 9:
                        maandNaam = "september";
                        Dagen = "31";
                        break;

                    case 10:
                        maandNaam = "oktokber";
                        Dagen = "30";
                        break;

                    case 11:
                        maandNaam = "november";
                        Dagen = "31";
                        break;

                    case 12:
                        maandNaam = "december";
                        Dagen = "30";
                        break;

                    default:
                        maandNaam = "U heeft verkeerd nummer ingetikt";
                        Dagen = "0";
                        break;

                }
                    tekstvak.setText("");
                repaint();
        }
    }








}
