package Codoacodo;

import java.awt.*;
import javax.swing.*;

/*
 4.- Crear una ventana con las siguientes caracter�sticas:
T�tulo= �Ventana con lista desplegable�
Ubicaci�n= centrada - Tama�o= �500 pixels * 500 pixels�
Al hacer click en el bot�n de cerrar ventana, se debe cerrar la aplicaci�n.
Dentro de la ventana se debe colocar Una lista desplegable, con los 7 colores del arco iris.
 */
public class codoacodo_EjOb_unidad4parte2ej4 {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame ventana = new JFrame();
		// Creaci�n del ComboBox
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
