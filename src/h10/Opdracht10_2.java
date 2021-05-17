package h10;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Opdracht10_2 extends Applet {
    TextField tekstvak;
    Button Yes;
    int hoogstegetal;



    public void init() {
    tekstvak = new TextField("" , 30);
    add(tekstvak);
    Yes = new Button("Yes");
    Yes.addActionListener( new OkKnopListener() );
    add(Yes);
    }


    public void paint(Graphics g) {
        g.drawString("Hoogste Getal: " + hoogstegetal, 50, 60 );
    }

    class OkKnopListener implements ActionListener  {

        public void actionPerformed(ActionEvent e) {
            String tekstvakGetal = tekstvak.getText();
            int getal = Integer.parseInt(tekstvakGetal);
            if (getal > hoogstegetal);
                    hoogstegetal = getal;

            tekstvak.setText("");
            repaint();
        }


    }









}
