package Codoacodo;
//@author Jesus Arias
import javax.swing.JOptionPane;
/*
8.- Se solicita ingresar las alturas en cent�metros de los jugadores de un equipo de
b�squet. La carga de estaturas finaliza cuando la estatura es igual a 0.
a.- Mostrar el promedio de altura del grupo.
b.- Indicar la altura m�xima y la m�nima.
*/

public class codoacodo_unidad5p8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n, i = 0, suma = 0, menor, mayor;
		int promedio;
		n = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese la altura del jugador", "ALTURA EN CENTIMETROS",JOptionPane.PLAIN_MESSAGE));
		menor = n;
		mayor = n;
		while (n != 0) {
			i++;
			suma += n;
			
			if (n < menor) {
				menor = n;
			}
			if (n > mayor) {
				mayor = n;
			}
			n = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese la altura del jugador", "ALTURA EN CENTIMETROS",JOptionPane.PLAIN_MESSAGE));
		}
		promedio = suma / i;
		System.out.println("El promedio de altura entre los jugadores es de: " + promedio + "cm");
		System.out.println("El jugador m�s bajo tiene " + menor + "cm y el m�s alto tiene " + mayor + "cm");

	}
}
