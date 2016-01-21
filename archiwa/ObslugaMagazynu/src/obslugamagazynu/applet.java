package obslugamagazynu;

import java.applet.*;
import java.awt.*;





public class applet extends Applet {
    
 
    public void paint(Graphics g){    //rysowanie magazynu
        
        Graphics2D g2=(Graphics2D) g;
        g2.setStroke(new BasicStroke(3));
        
       g.drawLine(10, 450, 1360, 450);
       g.drawLine(10, 450, 10, 10);             
       g.drawLine(10, 10, 1360, 10);
       g.drawLine(1360, 10, 1360, 450);
        
       g.setColor(Color.LIGHT_GRAY);
       g.fillRect(30, 369, 550, 70);
       g.fillRect(30, 219, 550, 70);
       g.fillRect(30, 69, 550, 70);
       g.fillRect(770, 369, 550, 70 );
       g.fillRect(770, 219, 550, 70);
       g.fillRect(770, 69, 550, 70);
        
       g.setColor(Color.black);
       g.drawRect(30, 369, 550, 70);
       g.drawRect(30, 219, 550, 70);
       g.drawRect(30, 69, 550, 70);
       g.drawRect(770, 369, 550, 70 );
       g.drawRect(770, 219, 550, 70);
       g.drawRect(770, 69, 550, 70);
       
       g.drawLine(610, 450, 610, 360);
       g.drawLine(610, 300, 610, 210);
       g.drawLine(610, 150, 610, 60);
       g.drawLine(740, 450, 740, 360);
       g.drawLine(740, 300, 740, 210);
       g.drawLine(740, 150, 740, 60);
       
       g.setColor(Color.MAGENTA);
       Font font = new Font ("SansSerif", Font.BOLD, 30 );
       g.setFont(font);
       g.drawString("Owoce", 260 , 410);
       g.drawString("Warzywa", 260, 260);
       g.drawString("Pieczywo", 260, 110);
       g.drawString("Nabiał", 1010, 110);
       g.drawString("Mięso", 1010, 260);
       g.drawString("Chemia", 1010, 410 );
        
        g.setColor(Color.red);
        g.fillOval(675, 400, 30, 30);
        g.setColor(Color.black);
        g.drawOval(675, 400, 30, 30);
        
        g.setColor(Color.white);
        g.drawLine(720, 450, 630, 450);
    }
    
}
