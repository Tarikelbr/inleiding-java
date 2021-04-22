package h06;

import java.applet.Applet;
import java.awt.*;

public class Opdracht6_1 extends Applet {


int Jan;
int Ali;
int Jaenette;
int Tarik;
float Uitkomst;


    public void init() {
        Jan = 1;
        Ali = 2 ;
        Jaenette = 3;
        Tarik = 4;
        Uitkomst = 113;
        Uitkomst = (Uitkomst / Tarik);

    }


    public void paint(Graphics g) {

    g.drawString("Jan krijgt28 euro", 20, 20);
    g.drawString("Ali krijgt 28 euro", 20, 40);
    g.drawString("Jeannette 28 euro", 20,60);
    g.drawString("Tarik krijgt 28 euro", 20,80);
    g.drawString("Uitkomst is " + Uitkomst, 20, 100);



    }
}
