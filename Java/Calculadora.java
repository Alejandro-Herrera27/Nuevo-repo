import java.util.Scanner;

public class Calculadora {

  static int numero1;
  static int numero2;
  private static int resultado;
  static String operacion;

  

  public static void main (String [] argv){

   Scanner read = new Scanner (System.in);
   System.out.println ("Ingrese el signo de la operacion a ejecutar, puede elegir: ");
   System.out.println ("+ para sumar");
   System.out.println ("- para restar");
   System.out.println ("* para multiplicar");
   System.out.println ("/ para dividir");
   operacion = read.nextLine();
   
   System.out.print ("Ingrese el primer numero a operar : ");
   numero1 = read.nextInt();

   System.out.print ("Ingrese el segundo numero a operar: ");
   numero2 = read.nextInt();

    switch (operacion){
      case "+":
        resultado = numero1 + numero2;
        System.out.println ("La operacion ingresada fue " + numero1 + " " + " " + operacion + numero2 + " = "+ resultado);
        break;

      case "-":
        resultado = numero1 - numero2;
        System.out.println ("La operacion ingresada fue " + numero1 +" " + operacion + " " + numero2 + " = "+ resultado);
        break;

      case "*":
        resultado = numero1 * numero2;
        System.out.println ("La operacion ingresada fue " + numero1 +" " + operacion + " " + numero2 + " = "+ resultado);
        break;

      case "/":
        resultado = numero1 / numero2;
        System.out.println ("La operacion ingresada fue " + numero1 +" " + operacion + " " + numero2 + " = "+ resultado);
        break;
      
    }

  }
}