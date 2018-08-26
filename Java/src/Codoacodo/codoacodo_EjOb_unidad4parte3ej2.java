package Codoacodo;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

/*
 2.- Confeccionar una ventana con:
Título: Flores
Tamaño: 550 px x 450 px
Debe contener:
1 etiqueta Nombre de flor
1 lista desplegable con, al menos, 5 nombres de flores
1 botón de Aceptar, al hacer click en el botón deben aparecer el nombre de la flor elegida en
el título de la ventana
1 botón de Salir, debe cerrar la aplicación.
 */
public class codoacodo_EjOb_unidad4parte3ej2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame ventana = new JFrame();
		Label lblFlor = new Label("Flor");
		// Creación del ComboBox
		String opciones[] = { "Azucena", "Clavel", "Gladiolo", "Hortensia", "Lavanda", "Margarita", "Rosa" };
		
		JComboBox<Object> flores = new JComboBox<Object>(opciones);

		JButton btnAceptar = new JButton("Aceptar");
		// CREO METODO PARA EL BOTON ACEPTAR Y UN "SI" PARA QUE CAMBIE EL TITULO
		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent args) {

				if (args.getSource() == btnAceptar) {
					String nombre = flores.getSelectedItem().toString();
					ventana.setTitle(nombre);
				}
			}
		});

		JButton btnSalir = new JButton("Salir");
		// CREO METODO PARA EL BOTON SALIR
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent args) {
				System.exit(0);
			}
		});

		// propiedades de la ventana
		ventana.setSize(550, 450);
		ventana.setTitle("Flores");
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ventana.setLayout(new FlowLayout());
		ventana.add(lblFlor);
		ventana.add(flores);
		ventana.add(btnAceptar);
		ventana.add(btnSalir);
		ventana.setVisible(true);
		ventana.setLocationRelativeTo(null);

	}

}
