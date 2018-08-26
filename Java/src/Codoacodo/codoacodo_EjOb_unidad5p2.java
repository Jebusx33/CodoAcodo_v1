package Codoacodo;

//@author Jesus Arias
import java.util.Scanner;

/*
 2. Ingresar por teclado el área de un cuadrado en metros cuadrados. Calcular
e imprimir el valor del perímetro.
 */
public class codoacodo_EjOb_unidad5p2 {

	private static Scanner entrada;

	public static void main(String[] args) {
		entrada = new Scanner(System.in);
		System.out.println("Introduce el area del cuadrado en mts^2: ");
		int area = entrada.nextInt();
		int perimetro;
		perimetro = (int) (Math.sqrt(area) * 4);
		System.out.println("El perimetro del cuadrado es: " + perimetro);

	}

}
