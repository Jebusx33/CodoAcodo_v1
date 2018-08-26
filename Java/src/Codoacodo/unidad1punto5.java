package Codoacodo;

import java.util.Scanner;

public class unidad1punto5 {

	private static Scanner scan;
	private static Scanner cantidad;

	public static void main(String[] args) {
		int nalumnos, promedio = 0, suma = 0, j = 0;
		int[] notas = new int[3];
		String alumno = null;
		cantidad = new Scanner(System.in);
		scan = new Scanner(System.in);
		System.out.println("Ingresar la cantidad de alumnos");
		nalumnos = cantidad.nextInt();

		for (int i = 0; i < nalumnos; i++) {
			System.out.println("Ingresar el nombre del alumno");
			alumno = scan.next();
			suma = 0;

			for (j = 0; j < notas.length; j++) {
				System.out.println("Ingresar la nota n° " + (j + 1) + " de " + alumno);
				notas[j] = scan.nextInt();
			}

			System.out.print("el promedio de " + alumno);
			for (int k = 0; k < notas.length; k++) {
				suma += notas[k];
			}
			promedio = suma / 3;
			System.out.println(" es " + promedio);
		}

	}
}
