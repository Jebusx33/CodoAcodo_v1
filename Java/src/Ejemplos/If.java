package Ejemplos;

import java.util.Scanner;

public class If {

	private static Scanner s;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// declaro una variable y el ingreso del numero
		int y;
		s = new Scanner(System.in);
		// pido el ingreso de un numero por teclado
		System.out.println("ingrese un numero ");
		y = s.nextInt();

		if (y == 5) // aplico una condicion logica a evaluar
		// ejemplo el numero ingresado tiene que ser igual a Y para que sea
		// cierto
		{
			System.out.println("es cierto ");// imprimo el resultado
		} else {
			System.out.println("es falso ");// segunda ocion en caso de que no
											// coincida con el promero
		}
		// fin de la sentecias
		System.out.println("estoy fuera de la sentencia selectiva ");
	}

}
