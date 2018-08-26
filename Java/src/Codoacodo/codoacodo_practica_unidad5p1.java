package Codoacodo;
import java.util.Scanner;

//@author Jesus Arias
//import javax.swing.JOptionPane;
/*
  1.- Realizar un programa que a partir de la cantidad de bancos de un
  aula y la cantidad de alumnos inscriptos para un curso, permita
  determinar si alcanzan los bancos existentes para todos los alumnos.
  De no ser así, informar además cuantos bancos serían necesarios
  agregar, el usuario deberá ingresar la cantidad de bancos y alumnos.
 */
public class codoacodo_practica_unidad5p1 {
	private static Scanner entrada;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
		int Alumnos = Integer.parseInt(JOptionPane.showInputDialog("Introduce la cantidad de Alumnos"));
		int Bancos = Integer.parseInt(JOptionPane.showInputDialog("Introduce la cantidad de Bancos"));
*/
		entrada = new Scanner(System.in);
		System.out.println("Introduce la cantidad de Alumnos : ");
		int Alumnos= entrada.nextInt();
		System.out.println("Introduce la cantidad de Bancos : ");
		int Bancos= entrada.nextInt();
		
		System.out.println("La cantidad de Bancos ingresados son:  " + Bancos);
		System.out.println("La cantidad de Alumnos ingresados es de: " + Alumnos);
				
		if (Bancos < Alumnos) {
			System.out.println("Los Bancos no alcanzan para la cantidad de Alumnos," + " faltan " + (Alumnos - Bancos)
					+ " bancos");
		} else {
			System.out.println("La cantidad de alumnos ingresado coincide con el cupo de Bancos");
		}

	}

}
