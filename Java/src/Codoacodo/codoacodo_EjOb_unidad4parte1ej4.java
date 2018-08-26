package Codoacodo;

import javax.swing.JOptionPane;

/*
 4.- Hacer un menú muy sencillo. El menú se mostrará por pantalla y tendrá las siguientes opciones:
1. Saludar
2. Despedirse
3. Salir
Si el usuario introduce un 1, el programa le pedirá el nombre lo saludará: Hola Pepito
Si el usuario introduce un 2, el programa se despedirá: Adios
Si el usuario introduce un 3, el programa terminará.
(Usar la clase JOptionPane tanto para cargar datos como para mostrar mensajes y resultados)
 */
public class codoacodo_EjOb_unidad4parte1ej4 {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int opcion;
		// ingreso datos
		String nombre = JOptionPane.showInputDialog("ingrese su nombre");
		// bucle para el menu, hasta seleccionar opcion 3 del case
		do {
			opcion = Integer.parseInt(JOptionPane.showInputDialog(null,
					nombre + " elija una opcion \n 1. Saludar\n 2. Despedirse\n 3. Salir", "Menu",
					JOptionPane.PLAIN_MESSAGE));

			switch (opcion) {
			case 1:
				JOptionPane.showMessageDialog(null, "Hola " + nombre);
				break;
			case 2:
				JOptionPane.showMessageDialog(null, "Adios " + nombre);
				break;
			case 3:
				// JOptionPane.showMessageDialog(null,"Hasta luego "+nombre);
				break;
			default:
				JOptionPane.showMessageDialog(null, "INGRESO UN NUMERO INCORRECTO NO ESTA EN LA OPCION",
						"NUMERO INCORRECTO", JOptionPane.ERROR_MESSAGE);
			}
		} while (opcion != 3);
	}

}
