public class Carro {
  
  private static String marca;
  private static String color;

  public static void main (String[] argv){
    valores ("Audi", "Rojo");
    System.out.print("El carro es de marca " + marca + " y color " + color);
  }

  public static void valores (String marc, String col){
    marca=marc;
    color=col;
  }
}

