package Codoacodo;

import javax.swing.JOptionPane;

/*
 5.- Desarrollar un programa Java que solicite se ingrese un valor en pesos y por medio de un menú de
opciones permita elegir a que moneda convertir dicho ingreso (Euro, Dólar, Yen) y muestre el
resultado.(Usar la clase JOptionPane tanto para cargar datos como para mostrar mensajes y resultados)
*/
public class codoacodo_EjOb_unidad4parte1ej5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int opcion;
		double dolar, euro, yen;

		// ingreso datos
		float pesos = Float.parseFloat(JOptionPane.showInputDialog("Ingrese la cantidad de Pesos"));

		do {
			opcion = Integer.parseInt(JOptionPane.showInputDialog(null,
					" Elija una opcion par convertir el valor de los " + pesos
							+ " PESOS a otra moneda. \n 1. Dolar\n 2. Euro\n 3. Yen\n 4. salir\n",
					"MENU DE CONVERSION", JOptionPane.PLAIN_MESSAGE));

			switch (opcion) {
			case 1:
				dolar = pesos * 0.0264;
				JOptionPane.showMessageDialog(null, "son " + dolar + " dolares");
				break;
			case 2:
				euro = pesos * 0.0317;
				JOptionPane.showMessageDialog(null, "son " + euro + " euros");
				break;
			case 3:
				yen = pesos * 0.0236;
				JOptionPane.showMessageDialog(null, "son " + yen + " yen");
				break;
			case 4:

				break;
			default:
				JOptionPane.showMessageDialog(null, "INGRESO UN NUMERO INCORRECTO NO ESTA EN LA OPCION",
						"NUMERO INCORRECTO", JOptionPane.ERROR_MESSAGE);
			}
		} while (opcion != 4);

	}

}
