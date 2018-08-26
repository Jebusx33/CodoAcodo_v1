package Codoacodo;

//@author Jesus Arias
import java.util.Scanner;

/*
3. Ingresar por teclado, los 3 lados de un triángulo. Indicar y mostrar si el triángulo es
isósceles, escaleno o equilátero.
*/
public class codoacodo_EjOb_unidad5p3 {
	private static Scanner entrada;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		entrada = new Scanner(System.in);
		System.out.println("Introduce el lado A de un triangulo : ");
		int ladoA = entrada.nextInt();
		System.out.println("Introduce el lado B de un triangulo : ");
		int ladoB = entrada.nextInt();
		System.out.println("Introduce el lado C de un triangulo : ");
		int ladoC = entrada.nextInt();
		if (ladoA == ladoB && ladoB == ladoC && ladoC == ladoA) {

			System.out.println(
					"El Triangulo es Equilatero\n" + "lado A: " + ladoA + ", lado B: " + ladoB + ", lado C: " + ladoC);
		} else if (ladoA != ladoB && ladoB != ladoC && ladoC != ladoA) {
			System.out.println(
					"El Triangulo es Escaleno\n" + "lado A: " + ladoA + ", lado B: " + ladoB + ", lado C: " + ladoC);
		} else {
			System.out.println(
					"El Triangulo es Isósceles\n" + "lado A: " + ladoA + ", lado B: " + ladoB + ", lado C: " + ladoC);
		}

	}

}
