package Codoacodo;

import java.awt.*;
import javax.swing.*;

/*
 5.- Crear una ventana con las siguientes características:
Título= “Ventana con casillas de selección múltiple”
Ubicación= centrada - Tamaño= “650 pixels * 550 pixels”
Al hacer click en el botón de cerrar ventana, se debe cerrar la aplicación.
Dentro de la ventana se debe colocar un conjunto casillas de selección múltiple con 5
lenguajes de programaciòn.
 */
public class codoacodo_EjOb_unidad4parte2ej5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// crea la ventana y las casillas de seleccion
		JFrame ventana = new JFrame();
		JCheckBox checkbox = new JCheckBox("Java");
		JCheckBox checkbox1 = new JCheckBox("C");
		JCheckBox checkbox2 = new JCheckBox("Cobol");
		JCheckBox checkbox3 = new JCheckBox("Visual Basic. NET");
		JCheckBox checkbox4 = new JCheckBox("Python");

		// propiedades de la ventana
		ventana.setSize(650, 550);
		ventana.setTitle("Ventana con casillas de selección múltiple");
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ventana.setLayout(new FlowLayout());
		ventana.add(checkbox);
		ventana.add(checkbox1);
		ventana.add(checkbox2);
		ventana.add(checkbox3);
		ventana.add(checkbox4);
		ventana.setVisible(true);
		ventana.setLocationRelativeTo(null);
	}

}
