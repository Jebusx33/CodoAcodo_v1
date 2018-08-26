package Codoacodo;
//@author Jesus Arias
import javax.swing.JOptionPane;

/*
5.- Se pide escribir un programa que solicite el ingreso por teclado de 10 números y
muestre su suma. (Utilizar while - do while y for)
*/
public class codoacodo_practica_unidad5p5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i = 0, suma = 0, n;
		String opcion = JOptionPane.showInputDialog("Introduce la opción: 1(while), 2(do while), 3(for). ");

		
		switch (opcion) {
		case "1":
			while (i < 10) {
				n = Integer.parseInt(JOptionPane.showInputDialog("Introduce un numero"));
				System.out.println(n + "");
				suma += n;
				i++;
			}
			System.out.print("La suma de los numeros ingresados en el WHILE es: " + suma);
			break;
		case "2":

			do {
				n = Integer.parseInt(JOptionPane.showInputDialog("Introduce un numero"));
				System.out.println(n + "");
				suma += n;
				i++;
			} while (i <= 9);
			System.out.println("La suma de los numeros ingresados en el DO WHILE es: " + suma);
			break;

		case "3":
			for (i = 0; i < 10; i++) {
				n = Integer.parseInt(JOptionPane.showInputDialog("Introduce un numero"));
				System.out.println(n + "");
				suma += n;
			}
			System.out.println("la suma de los numeros ingresados en el FOR es: " + suma);
			break;
		default:
			System.out.println("La opción no es correcta!!!");
			JOptionPane.showMessageDialog(null, "EJECUTE NUEVAMENTE EL PROGRAMA");

		}
	}

}
