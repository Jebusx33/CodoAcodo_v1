package Codoacodo;

import javax.swing.JOptionPane;

/*
 1.- Desarrollar un programa que pida una cantidad de artículos comprados y el precio unitario de ese
		artículo. Por cada carga debe preguntar si se desea seguir ingresando de la forma “¿Desea ingresar otro
		artículo? [S/N]”.
		La carga de datos finaliza cuando se detecta una n o N. La computadora debe mostrar el monto de la
		factura. (Usar la clase JOptionPane tanto para cargar datos como para mostrar mensajes y resultados)
 */
public class codoacodo_EjOb_unidad4parte1ej1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int cant = 0;
		float precio = 0;
		float totFactura = 0;
		boolean opcion = true;
		String resp;

		while (opcion) {
			cant = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad del articulo"));
			precio = Float.parseFloat(JOptionPane.showInputDialog("Ingrese el precio del articulo:"));
			totFactura = totFactura + (cant * precio);
			resp = JOptionPane.showInputDialog("¿Desea ingresar otro articulo? (s/n)");
			if (resp.equalsIgnoreCase("n")) {
				opcion = false;
			}
		}
		JOptionPane.showMessageDialog(null, "El monto total es:" + totFactura);
	}
}
