import java.awt.*;
import javax.swing.JApplet;
import javax.swing.JFrame;

public class Circunferencia extends JApplet {

  public void paint (Graphics g) {
    g.setColor(Color.blue);
    g.drawString ("###", 95,108);
    g.drawString ("#", 85,118);
    g.drawString ("#", 129,118);
    g.drawString ("#", 75,130);
    g.drawString ("#", 139,130);
    g.drawString ("#", 70,142);
    g.drawString ("#", 145,142);
    g.drawString ("#", 70,152);
    g.drawString ("#", 145,152);
    g.drawString ("#", 70,162);
    g.drawString ("#", 145,162);
    g.drawString ("#", 70,172);
    g.drawString ("#", 145,172);
    g.drawString ("#", 75,185);
    g.drawString ("#", 139,185);
    g.drawString ("#", 85,197);
    g.drawString ("#", 129,197);
    g.drawString ("###", 95,207);
    g.setColor(Color.black);
    g.drawString ("Descarte la opción de usar",165,148);
    g.drawString ("ciclos porque dieron la idea",165,162);
    g.drawString ("en clase (⌣̩̩́_⌣̩̩̀)",165,176);
    
  }

  public static void main (String[] args){
    JFrame frame = new JFrame ("String_Circunferencia");
    Circunferencia circunferenciaApplet = new Circunferencia ();
    circunferenciaApplet.init ();
    frame.getContentPane ().add (circunferenciaApplet);
    frame.setSize (350, 350);
    frame.setVisible (true);
  }
}