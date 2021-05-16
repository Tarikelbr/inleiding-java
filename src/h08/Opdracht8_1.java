package h08;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Opdracht8_1 extends Applet {

    TextField tekstvak;
    Button okKnop, resetKnop;
    Label label;
    String string;



    public void init() {
        tekstvak = new TextField("", 30);
        label = new Label();
        add(label);
        okKnop = new Button("Ok");
        okKnop.addActionListener( new OkknopListener() );
        add(okKnop);
        resetKnop = new Button("Reset");
        resetKnop.addActionListener( new ResetKnopListener() );
        add(tekstvak);
        add(resetKnop);
    }


    public void paint(Graphics g) {
    g.drawString(string, 50, 60);
    }

    class OkknopListener implements ActionListener {
        public void actionPerformed(ActionEvent e){
            string = tekstvak.getText();
            repaint();

        }
    }
    class ResetKnopListener implements ActionListener {
        public void actionPerformed(ActionEvent e){
            string = ("");
            tekstvak.setText("");
            repaint();
        }


    }




}



