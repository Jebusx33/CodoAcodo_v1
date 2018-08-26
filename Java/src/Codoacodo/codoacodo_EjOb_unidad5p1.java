package Codoacodo;

//@author Jesus Arias
import java.util.Scanner;

/*
 1. Ingresar por teclado un número de 4 dígitos (el primer dígito, la unidad de mil, debe
ser distinta de 0, cero). Imprimir en pantalla si el número es capicúa o no.
 */
public class codoacodo_EjOb_unidad5p1 {

	private static Scanner entrada;

	public static void main(String[] args) {
		entrada = new Scanner(System.in);
		System.out.println("Introduce 4 digitos ");
		long numero = entrada.nextInt();

		long falta, numeroInvertido, resto;

		while (numero <= 0)
			;
		falta = numero;
		numeroInvertido = 0;
		resto = 0;

		resto = falta % 10;
		falta = falta / 10;
		numeroInvertido = numeroInvertido * 10 + resto;

		while (falta != 0) {
			resto = falta % 10;
			numeroInvertido = numeroInvertido * 10 + resto;
			falta = falta / 10;
		}

		if (numero <= 999 || numero > 9999) {

			System.err.println("Error!" + "\nEl numero es incorrecto!!!");

		}

		else {
			if (numeroInvertido == numero)
				System.out.println("\nEl numero es capicua\n");

			else
				System.out.println("\nEl numero no es capicua\n");
		}

	}

}
