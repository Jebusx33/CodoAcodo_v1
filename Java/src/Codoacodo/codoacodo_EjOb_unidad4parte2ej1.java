package Codoacodo;

import java.awt.FlowLayout;

import javax.swing.*;
/*
 1.- Crear una ventana con las siguientes caracter�sticas:
T�tulo= �Ventana de prueba�
Ubicaci�n= centrada
Tama�o= �300 pixels * 400 pixels�
Al hacer click en el bot�n de cerrar, se debe cerrar la aplicaci�n.
Como gu�a para resolverlo esta el siguiente link:
https://www.youtube.com/watch?v=AQlY7sV8wWA.
 */

public class codoacodo_EjOb_unidad4parte2ej1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// crea la ventana
		JFrame ventana = new JFrame();

		// propiedades de la ventana
		ventana.setSize(300, 400);
		ventana.setLocationRelativeTo(null);
		ventana.setTitle("Ventana de prueba");
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ventana.setLayout(new FlowLayout());
		ventana.setVisible(true);

	}

}
