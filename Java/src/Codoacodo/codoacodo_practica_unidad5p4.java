package Codoacodo;
// @author Jesus Arias
import javax.swing.JOptionPane;

/*
4.- Escribir un programa que solicite ingresar el nombre y las 2 notas de alumnos, la carga
finaliza cuando nombre es igual a XXX.
Se pide:
a.- Mostrar el nombre y el promedio
b.- Informar cuantos tienen promedio mayor o igual a 7 y cuantos menos
 */
public class codoacodo_practica_unidad5p4 {

	public static void main(String[] args) {

		int menor = 0, mayor = 0;
		String nombre;
		
		do {

			nombre = JOptionPane.showInputDialog("Ingrese su Nombre" + "");

			int Nota1 = Integer.parseInt(JOptionPane.showInputDialog("Introduce la priner nota"));
			int Nota2 = Integer.parseInt(JOptionPane.showInputDialog("Introduce la segunda nota"));
			double promedio = (double) ((Nota1 + Nota2) * 0.5);
			// double Promedio1 = ((Nota1 + Nota2) * 0.5);

			System.out.println("El nombre del alumno es: " + nombre + " con un promedio de: " + promedio);

			if (promedio >= 7) {
				mayor++;
			} else {

				menor++;
			}

		} while (!nombre.equalsIgnoreCase("xxx"));
		System.out.println("alumnos con nota igual o mayor 7: " + mayor);
		System.out.println("alumnos con nota menor a 7: " + menor);

	}

}
