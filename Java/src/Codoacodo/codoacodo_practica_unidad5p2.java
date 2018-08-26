package Codoacodo;
//@author Jesus Arias
import javax.swing.JOptionPane;
/* 
2.- Escribir un programa que solicite al usuario el ingreso de su nombre, la cantidad de
horas trabajadas y el valor de la hora. Mostrar el sueldo.
*/

public class codoacodo_practica_unidad5p2{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String nombre = JOptionPane.showInputDialog("Ingrese su Nombre" + "");
		int horas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de horas trabajadas"));
		int valorhora = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor por Hora"));
		System.out.println(nombre + " tu sueldo es de:" + (valorhora * horas));

	}

}
