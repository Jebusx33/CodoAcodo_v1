package Codoacodo;

import java.awt.*;
import java.awt.Label;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.font.TextAttribute;
import java.util.Map;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JProgressBar;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

@SuppressWarnings("unused")
public class codoacodo_EjOb_unidad4parte3ej4 {
	
	@SuppressWarnings("rawtypes")
	private static Map attributes;

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame ventana = new JFrame();
		// INGRESO DEL NOMBRE
		JLabel lblNombre = new JLabel("Nombre:");
		Font font = lblNombre.getFont();
		setAttributes(font.getAttributes());
	    //subrayar
		//attributes.put(TextAttribute.UNDERLINE, TextAttribute.UNDERLINE_ON);
		lblNombre.setFont(font.deriveFont(getAttributes()));
		
		JTextField texto_nombre = new JTextField(5);
		// PROPIEDADES DE LOS CONTROLES JTextField texto_nombre
		texto_nombre.setBounds(new Rectangle(25, 15, 250, 21));
		texto_nombre.setText("");
		texto_nombre.setEditable(true);
		texto_nombre.setHorizontalAlignment(JTextField.LEFT);

	   	// CREACION DEL ComboBox
		String opciones[] = { "Border collie", "Pastor alemán", "Golden retriever", "Doberman pinscher", "Caniche" };
		JComboBox<Object> Razas = new JComboBox<Object>(opciones);

		// crea la ventana y las casillas de seleccion
		JCheckBox checkbox = new JCheckBox("Gigante");
		JCheckBox checkbox1 = new JCheckBox("Grande");
		JCheckBox checkbox2 = new JCheckBox("Mediano");
		JCheckBox checkbox3 = new JCheckBox("Pequeño");
		

		JButton btnAceptar = new JButton("Aceptar");
		// CREO METODO PARA EL BOTON ACEPTAR Y UN SI PARA QUE CAMBIE EL TITULO
		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent args) {
				// nombre y apellido
				if (args.getSource() == btnAceptar) {
					String nombre = texto_nombre.getText();
					String seleccion = "";
					// elije los idiomas que sabe
					if (checkbox.isSelected()) {
						seleccion += "Gigante -";
					}
					if (checkbox1.isSelected()) {
						seleccion += "Grande -";
					}
					if (checkbox2.isSelected()) {
						seleccion += "Mediano -";
					}
					if (checkbox3.isSelected()) {
						seleccion += "Pequeño -";
					}
					

					
					
						// Raza de Perro
						if (args.getSource() == btnAceptar) {
							String raza = Razas.getSelectedItem().toString();
							JOptionPane.showMessageDialog(null,
									"Nombre  :" + nombre +  "\nRaza :" + raza
											+ "\nTamaño :" + seleccion + "\n");
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
		ventana.setSize(600, 600);
		ventana.setTitle("Perros");
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ventana.setLayout(new FlowLayout());
		ventana.add(lblNombre);
		ventana.add(texto_nombre);
		ventana.add(Razas);
		ventana.add(checkbox);
		ventana.add(checkbox1);
		ventana.add(checkbox2);
		ventana.add(checkbox3);
		ventana.add(btnAceptar);
		ventana.add(btnSalir);
		ventana.setVisible(true);

	}

	@SuppressWarnings("rawtypes")
	public static Map getAttributes() {
		return attributes;
	}

	@SuppressWarnings("rawtypes")
	public static void setAttributes(Map attributes) {
		codoacodo_EjOb_unidad4parte3ej4.attributes = attributes;
	}

}
