package Codoacodo;

import java.util.Scanner;

public class zodiaco {

	public static void main(String[] args) {
		// Declaracion de variables

		int dia, mes;
        //Entrada de datos
		System.out.println("Introduce dia de nacimiento : ");
		dia = extracted().nextInt();
		System.out.println("Introduce el mes de nacimiento : ");
		mes = extracted().nextInt();
		
		//condicion
		
		// Ciclo para evitar el ingreso de un día inválido.
		while (dia >= 32 || dia <= 0) {
			System.out.println("Introduzca un dia de nacimiento valido: ");
			dia = extracted().nextInt();
		}
		
		//procesos de operaciones y salida de datos
		
		// Ciclo para evitar el ingreso de un mes inválido.
		while (mes >= 13 || mes <= 0) {
			System.out.println("Introduzca un mes de nacimiento valido: ");
			mes = extracted().nextInt();
		}

		// Condicional, signo zodiacal Aries (21/3 - 20/4)
		if ((mes == 3 && dia >= 21) || (mes == 4 && dia <= 20))
			System.out.println("\nSu signo zodiacal es: Aries.");

		// Condicional, signo zodiacal Tauro (21/4 - 21/5)
		else if ((mes == 4 && dia >= 21) || (mes == 5 && dia <= 21))
			System.out.println("\nSu signo zodiacal es: Tauro.");

		// Condicional, signo zodiacal Géminis (22/5 - 21/6)
		else if ((mes == 5 && dia >= 5) || (mes == 6 && dia <= 21))
			System.out.println("\nSu signo zodiacal es: G%cminis");

		// Condicional, signo zodiacal Cáncer (21/6 - 23/7)
		else if ((mes == 6 && dia >= 21) || (mes == 7 && dia <= 23))
			System.out.println("\nSu signo zodiacal es: C%cncer.");

		// Condicional signo zodiacal Leo (24/7 - 23/8)
		else if ((mes == 7 && dia >= 24) || (mes == 8 && dia <= 23))
			System.out.println("\nSu signo zodiacal es: Leo");

		// Condicional signo zodiacal Virgo (24/8 - 23/9)
		else if ((mes == 8 && dia >= 24) || (mes == 9 && dia <= 23))
			System.out.println("\nSu signo zodiacal es: Virgo.");

		// Condicional signo zodiacal Libra (24/9 - 23/10)
		else if ((mes == 9 && dia >= 24) || (mes == 10 && dia <= 23))
			System.out.println("\nSu signo zodiacal es: Libra.");

		// Condicional signo zodiacal Escorpio (24/10 - 22/11)
		else if ((mes == 10 && dia >= 24) || (mes == 11 && dia <= 22))
			System.out.println("\nSu signo zodiacal es: Escorpio");

		// Condicional signo zodiacal Sagitario (23/11 - 21/12)
		else if ((mes == 11 && dia >= 23) || (mes == 12 && dia <= 21))
			System.out.println("\nSu signo zodiacal es: Sagitario");

		// Condicional signo zodiacal Capricornio (22/12 - 20/1)
		else if ((mes == 12 && dia >= 22) || (mes == 1 && dia <= 20))
			System.out.println("\nSu signo zodiacal es: Capricornio.");

		// Condiconal signo zodiacal Acuario (21/1 - 19/2)
		else if ((mes == 1 && dia >= 21) || (mes == 2 && dia <= 19))
			System.out.println("\nSu signo zodiacal es: Acuario.");

		// Condicional signo zodiacal Picis (20/2 - 20/3)
		else if ((mes == 2 && dia >= 20) || (mes == 3 && dia <= 20))
			System.out.println("\nSu signo zodiacal es; Picis");

	}

	private static Scanner extracted() {
		return new Scanner(System.in);
	}

}
