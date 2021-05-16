package h08;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Opdracht8_3 extends Applet {
    TextField tekstvak;
    Label label;
    Button okKnop;
    String string;
    double btw ,btwUitkomst;
    int ingevoerdGetal;


    public void init() {
    ingevoerdGetal = 0;
    btw = 0.21;
    label = new Label("Inclusief BTW");
    add(label);
    okKnop = new Button("Ok");
    okKnop.addActionListener(new OkKnopListener() );
    add(okKnop);
    tekstvak = new TextField("", 20);
    add(tekstvak);
    }


    public void paint(Graphics g) {
        g.drawString("Exclusief BTW: " + btwUitkomst, 50,60);
    }

    class OkKnopListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            string = tekstvak.getText();
            ingevoerdGetal = Integer.parseInt(string);
            btwUitkomst = ingevoerdGetal *btw;
            tekstvak.setText("");
            repaint();
        }
    }

















}
