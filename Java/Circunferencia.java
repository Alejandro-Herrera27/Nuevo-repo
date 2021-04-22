import java.awt.*;
import javax.swing.JApplet;
import javax.swing.JFrame;

public class Circunferencia extends JApplet {

  public void paint (Graphics g) {
    int cx=200;
    int cy=200;
    g.drawString ("♠", cx, 350);
    g.drawString ("♠", cx, 50);

    int x=cx+1;
    int y;

    while (x <= 350){
      y= x - 200;
      g.drawString ("♠", x, y);
      y= x + 200;
      g.drawString ("♠", x, y);
      x++;
    }
    x = 50;
    while (x <= 200){
      y= x + 150;
      g.drawString ("♠", x, y);
      y= x + 150;
      g.drawString ("♠", x, y);
      
    }
  }

  public static void main (String[] args){
    JFrame frame = new JFrame ("String_Circunferencia");
    Circunferencia circunferenciaApplet = new Circunferencia ();
    circunferenciaApplet.init ();
    frame.getContentPane ().add (circunferenciaApplet);
    frame.setSize (400, 400);
    frame.setVisible (true);
  }
}