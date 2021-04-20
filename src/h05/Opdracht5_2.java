package h05;

import java.applet.Applet;
import java.awt.*;

public class Opdracht5_2 extends Applet {



    public void init() {



    }
    public static void main(String[] args){


        int num = 40;


        System.out.println(num);
        num = num + 40;
    }


    public void paint(Graphics g) {

        g.drawRect(100, 150, 50, 210);
        g.drawRect(150, 60,50,300);
        g.drawRect(200,50,50,310);

        g.drawString("Valerie", 100,370);
        g.drawString("40KG",100, 380 );
        g.drawString("Hans", 150,370);
        g.drawString("80 KG",150,380 );
        g.drawString("Jeroen",200, 370);
        g.drawString("100 KG", 200, 380);



    }
}
