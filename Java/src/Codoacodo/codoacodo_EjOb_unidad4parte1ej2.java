package Codoacodo;

import javax.swing.JOptionPane;

/*
 2.- El usuario ingresa 12 valores, de a uno por vez, pertenecientes a sus sueldos mensuales durante un
año. La computadora muestra su sueldo anual. Si durante la carga de los sueldos mensuales se detecta
un valor negativo, esto indica que aún no se ha cobrado el mes en curso, por lo tanto, deben dejar de
ingresar datos y la computadora debe mostrar la sumatoria de sueldos que se llevan cobrados.
(Usar la clase JOptionPane tanto para cargar datos como para mostrar mensajes y resultados)
 */
public class codoacodo_EjOb_unidad4parte1ej2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int meses, i = 0;
		double numero = 0, suma = 0, suma2 = 0;

		meses = 12;
		while (meses > i) {
			numero = Float.parseFloat(JOptionPane.showInputDialog("Ingrese el sueldo:"));
			suma = suma + numero;
			i++;
			if (numero <= -1) {
				suma2 = suma - numero;
				JOptionPane.showMessageDialog(null, "la suma de los sueldos cobrados es:" + suma2);
			}
		}
		if (numero >= 0) {
			JOptionPane.showMessageDialog(null, "su sueldo anual es:" + suma);
		}

	}

}
