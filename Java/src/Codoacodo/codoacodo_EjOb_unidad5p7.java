package Codoacodo;

//@author Jesus Arias
import java.util.Scanner;

/*
 7. Ingresar por teclado un número desde el 1 al 7 (inclusive) y debe mostrar el color
que corresponde
1=”Azul”
2=”Rojo”
3=”Amarillo”
4=”Verde”
5=”Violeta”
6=”Blanco”
7=”Negro”
Si el valor ingresado no corresponde a los indicados, emitir un mensaje de error
y solicitar que se ingrese nuevamente el valor.
 */
public class codoacodo_EjOb_unidad5p7 {

	private static Scanner entrada;

	public static void main(String[] args) {
		entrada = new Scanner(System.in);
		System.out.println("ingrese un numero del 1 al 7\n cero para salir ");
		int num = entrada.nextInt();

		while (num != 0) {
			switch (num) {
			case 1: {
				System.out.println("Azul");
				break;
			}
			case 2: {

				System.out.println("Rojo");
				break;
			}
			case 3: {
				System.out.println("Amarillo");
				break;
			}
			case 4: {
				System.out.println("Verde");
				break;
			}
			case 5: {
				System.out.println("Violeta");
				break;
			}
			case 6: {
				System.out.println("Blanco");
				break;
			}
			case 7: {
				System.out.println("Negro");
				break;
			}
			default: {
				System.err.println("Error! numero incorrecto vuelva a probar");

			}
			}

			System.out.println("ingrese un numero del 1 al 7/n cero para salir");
			num = entrada.nextInt();

		}

	}

}
