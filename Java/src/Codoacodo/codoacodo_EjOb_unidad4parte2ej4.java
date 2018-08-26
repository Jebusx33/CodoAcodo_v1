package Codoacodo;

import java.awt.*;
import javax.swing.*;

/*
 4.- Crear una ventana con las siguientes características:
Título= “Ventana con lista desplegable”
Ubicación= centrada - Tamaño= “500 pixels * 500 pixels”
Al hacer click en el botón de cerrar ventana, se debe cerrar la aplicación.
Dentro de la ventana se debe colocar Una lista desplegable, con los 7 colores del arco iris.
 */
public class codoacodo_EjOb_unidad4parte2ej4 {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame ventana = new JFrame();
		// Creación del ComboBox
		String opciones[] = { "rojo", "naranja", "amarillo", "verde", "cian", "azul", "violeta" };
		@SuppressWarnings("rawtypes")
		JComboBox arcoiris = new JComboBox(opciones);
            
		
		
		// propiedades de la ventana
		ventana.setSize(500, 500);
		ventana.setTitle("Ventana con lista desplegable");
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ventana.setLayout(new FlowLayout());
		ventana.add(arcoiris);
		ventana.setVisible(true);
		ventana.setLocationRelativeTo(null);
	}

}
