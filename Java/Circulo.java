import java.awt.*;
import javax.swing.JApplet;
import javax.swing.JFrame;

public class Circulo extends JApplet {

  public void paint (Graphics g) {
    g.setColor(Color.blue);
    int x=50;
    int y;
    //while (x<=350){
      y= x*-1;
      y= y*y;
      y= y + (400*x);
      y= y-17500;
      double raiz= Math.sqrt (y);
      double resultado =raiz + 200;
      y= (int) resultado;
      g.drawString ("Es "+y, 50, 50);

      g.drawString (".", x, y);

      y= (int) resultado *-1;
      y= y + 200;
      g.drawString (".", x, y);
      x++;
    //}
  }

  public static void main (String[] args){
    JFrame frame = new JFrame ("String_Circunferencia");
    Circulo circuloApplet = new Circulo ();
    circuloApplet.init ();
    frame.getContentPane ().add (circuloApplet);
    frame.setSize (400, 400);
    frame.setVisible (true);
  }
}