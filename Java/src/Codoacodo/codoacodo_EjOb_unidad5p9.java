package Codoacodo;

//@author Jesus Arias
import java.util.Scanner;
/*
 9.- Escriba un programa que pida al usuario un número entre 1 y 12. La computadora
muestra por pantalla el mes al que pertenece tal número. Si se ingresa un número fuera de
rango, mostrar un error.
 */
public class codoacodo_EjOb_unidad5p9 {

	private static Scanner entrada;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double peso, contador = 0, acumulador = 0;
		entrada = new Scanner(System.in);

		System.out.println("ingrese el peso del alumno en gramos\n cero para finalizar");
		peso = entrada.nextInt();

		while (peso != 0) {
			contador++;
			acumulador += peso;

			System.out.println("ingrese el peso del alumno en gramos\n cero para finalizar");
			peso = entrada.nextInt();

		}
		System.out.println("el promedio de peso de los alumnos en gramos es de: "
				+ String.format("%.2f", (acumulador / contador)) + " Gramos");

	}

}
