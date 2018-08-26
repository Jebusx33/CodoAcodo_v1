package Codoacodo;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

/*
 3.- Confeccionar una ventana con:
Título: Pasajero
Tamaño: 700 px x 500 px
Debe contener:
1 etiqueta Nombre y su campo de texto
1 etiqueta Apellido y su campo de texto
1 grupo de botones alternativos con los posibles estados civiles
1 lista desplegable con la lista de países a los que puede viajar
1 cuadros de selección múltiple con los idiomas que habla el pasajero.
1 botón de Aceptar, al hacer click en el botón en un cuadro desplegable deben aparecer el
nombre y el apellido, el país de destino, el estado civil y los idiomas que habla el pasajero
1 botón de Salir, debe cerrar la aplicación
 */
public class codoacodo_EjOb_unidad4parte3ej3 {

	private static JComboBox<Object> paises;


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame ventana = new JFrame();
		// Ingreso de nombre y apellido
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

		// estado civil
		ButtonGroup grupo = new ButtonGroup();
		JRadioButton op1 = new JRadioButton("Solero");
		JRadioButton op2 = new JRadioButton("Casado");
		// permite elegir solo 1 opcion
		grupo.add(op1);
		grupo.add(op2);

		// Creación del ComboBox
		String opciones[] = { "Brasil", "Mexico", "EEUU", "España", "Japon", };
		JComboBox<Object> paises = new JComboBox<Object>(opciones);

		// crea la ventana y las casillas de seleccion
		JCheckBox checkbox = new JCheckBox("Español");
		JCheckBox checkbox1 = new JCheckBox("Ingles");
		JCheckBox checkbox2 = new JCheckBox("Frances");
		JCheckBox checkbox3 = new JCheckBox("Portugues");
		JCheckBox checkbox4 = new JCheckBox("Japones");

		JButton btnAceptar = new JButton("Aceptar");
		// CREO METODO PARA EL BOTON ACEPTAR Y UN SI PARA QUE CAMBIE EL TITULO
		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent args) {
				// nombre y apellido
				if (args.getSource() == btnAceptar) {
					String nombre = texto_nombre.getText();
					String apellido = texto_apellido.getText();
					String seleccion = "";
					// elije los idiomas que sabe
					if (checkbox.isSelected()) {
						seleccion += "Español -";
					}
					if (checkbox1.isSelected()) {
						seleccion += "Ingles -";
					}
					if (checkbox2.isSelected()) {
						seleccion += "Frances -";
					}
					if (checkbox3.isSelected()) {
						seleccion += "Portugues -";
					}
					if (checkbox4.isSelected()) {
						seleccion += "Japones -";
					}

					// estado civil
					if (op1.isSelected()) {
						// pais a donde viaja
						if (args.getSource() == btnAceptar) {
							String viaja = paises.getSelectedItem().toString();
							JOptionPane.showMessageDialog(null,
									"Su nombre es :" + nombre + "\nSu apellido es :" + apellido
											+ "\nEstado civil :Soltero" + "\nPais a donde viaja :" + viaja
											+ "\nUsted habla :" + seleccion + "\n");
						}

					}
					if (op2.isSelected()) {

						// pais a donde viaja
						if (args.getSource() == btnAceptar) {
							String viaja = paises.getSelectedItem().toString();
							JOptionPane.showMessageDialog(null,
									"Su nombre es :" + nombre + "\nSu apellido es :" + apellido
											+ "\nEstado civil :Casado" + "\nPais a donde viaja :" + viaja
											+ "\nUsted habla :" + seleccion + "\n");
						}
					}

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
		ventana.setSize(700, 500);
		ventana.setTitle("Pasajero");
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ventana.setLayout(new FlowLayout());
		ventana.add(lblNombre);
		ventana.add(texto_nombre);
		ventana.add(lblApellido);
		ventana.add(texto_apellido);
		ventana.add(op1);
		ventana.add(op2);
		ventana.add(paises);
		ventana.add(checkbox);
		ventana.add(checkbox1);
		ventana.add(checkbox2);
		ventana.add(checkbox3);
		ventana.add(checkbox4);
		ventana.add(btnAceptar);
		ventana.add(btnSalir);
		ventana.setVisible(true);

	}

	public static JComboBox<Object> getPaises() {
		return paises;
	}

	public static void setPaises(JComboBox<Object> paises) {
		codoacodo_EjOb_unidad4parte3ej3.paises = paises;
	}

}
