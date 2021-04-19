import java.util.Scanner;

public class Limites {

static int inferior;
static int superior;
static int i;
static int residuo;

public static void main (String[] argv){

  Scanner read = new Scanner (System.in);
  System.out.print ("Ingrese el limite inferior del intervalo: ");
  inferior = read.nextInt();
  System.out.print ("Ingrese el limite superior del intervalo: ");
  superior = read.nextInt();
  
  System.out.println ("Los numeros pares del intervalo son: ");

  for (i = inferior; i <= superior; i++){

    if(i%2 == 0){

      System.out.print (i + ", ");

    }

  }

  i = inferior;

  System.out.println (" ");
  System.out.println ("Los numeros impares del intervalo son: ");

  while (i <= superior){

    if (i % 2 != 0){

      System.out.print (i + ", ");

    }
    i++;
  }
}
}