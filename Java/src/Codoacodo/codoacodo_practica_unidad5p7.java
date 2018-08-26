package Codoacodo;
//@author Jesus Arias
import javax.swing.JOptionPane;

/*
7.- Realice un programa que permita obtener la edad promedio de un grupo de alumnos.
El bucle debe finalizar cuando el usuario ingrese un cero.
 */
public class codoacodo_practica_unidad5p7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 

		int i = 0, suma = 0, promedio = 0, n;

		while (true) { // Condición trivial: siempre cierta
			n = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad del alumno"));
			if (n == 0) {
				break;
			}
			System.out.println(n + "");
			suma += n;
			i++;

		}
		promedio = suma / i++;
		System.out.print("El promedio de edad de los alumnos ingresado es de: " + promedio);
		JOptionPane.showMessageDialog(null, "EL PROMEDIO DE EDAD ES DE: " + promedio);
	}

}
