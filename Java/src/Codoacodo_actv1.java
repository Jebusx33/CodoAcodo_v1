import java.util.Scanner;

//ACTIVIDAD 1
//Te proponemos, como ejercicio, que realices un algoritmo que, dados dos números imprima por pantalla su suma y su producto.

public class Codoacodo_actv1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Si A=7 intrdoduce B para sumar");
		Scanner entrada=new Scanner(System.in);
		int a=entrada.nextInt();

int b=7;

System.out.println("LA SUMA DE A Y B ES:" + (a+b));
int valor=a+b;
if ((valor % 2) == 0) {
    System.out.println ("El número es par");
  }
  if ((valor % 2) != 0) {
   System.out.println ("El número es impar");
  }
  System.out.println ("FIN DEL PROGRAMA");

	}

}
