package Codoacodo;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

/*
 1.- Confeccionar una ventana con:
Título: Alumnos
Tamaño: 600 px x 400 px
Debe contener:
1 etiqueta Nombre y su campo de texto
1 etiqueta Apellido y su campo de texto
1 botón de Aceptar, al hacer click en el botón deben aparecer el nombre y el apellido en el
título de la ventana
1 botón de Salir, debe cerrar la aplicación
 */

public class codoacodo_EjOb_unidad4parte3ej1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		JFrame ventana = new JFrame();

		Label lblNombre = new Label("Nombre:");
		JTextField texto_nombre = new JTextField(10);
		// PROPIEDADES DE LOS CONTROLES JTextField texto_nombre
		texto_nombre.setBounds(new Rectangle(25, 15, 250, 21));
		texto_nombre.setText("");
		texto_nombre.setEditable(true);
		texto_nombre.setHorizontalAlignment(JTextField.LEFT);

		Label lblApellido = new Label("Apellido:");
		JTextField texto_apellido = new JTextField(10);
		// PROPIEDADES DE LOS CONTROLES Label lblApellido
		texto_apellido.setBounds(new Rectangle(25, 15, 250, 21));
		texto_apellido.setText("");
		texto_apellido.setEditable(true);
		texto_apellido.setHorizontalAlignment(JTextField.LEFT);

		JButton btnAceptar = new JButton("Aceptar");
		// CREO METODO PARA EL BOTON ACEPTAR Y UN SI PARA QUE CAMBIE EL TITULO
		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent args) {

				if (args.getSource() == btnAceptar) {
					String nombre = texto_nombre.getText();
					ventana.setTitle(nombre);
					String apellido = texto_apellido.getText();
					ventana.setTitle(nombre + " " + apellido);
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

		// PROPIEDADES DE LA VENTANA
		ventana.setSize(600, 400);
		ventana.setTitle("Alumnos");
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ventana.setLayout(new FlowLayout());
		ventana.add(lblNombre);
		ventana.add(texto_nombre);
		ventana.add(lblApellido);
		ventana.add(texto_apellido);
		ventana.add(btnAceptar);
		ventana.add(btnSalir);
		ventana.setVisible(true);

	}
}
