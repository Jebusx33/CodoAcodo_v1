package Codoacodo;

//@author Jesus Arias
import java.util.Scanner;

/*
 5. Ingresar por teclado números enteros, la carga finaliza cuando se ingresa un cero.
Se pide calcular y mostrar el número de valor máximo y el mínimo.
 */
public class codoacodo_EjOb_unidad5p5 {

	private static Scanner entrada;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("ingresa un numero entero");
		entrada = new Scanner(System.in);
		int numero = entrada.nextInt();
		int maximo = numero;
		int minimo = numero;
		while (numero != 0) {
			if (numero > maximo) {
				maximo = numero;
			}
			if (numero < minimo) {
				minimo = numero;
			}

			System.out.println("ingresa un numero entero");
			numero = new Scanner(System.in).nextInt();
		}

		System.out.println("el maximo de los numeros ingresados es " + maximo + " y el minimo es " + minimo);
	}

}
