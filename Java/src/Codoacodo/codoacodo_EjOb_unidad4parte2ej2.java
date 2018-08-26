package Codoacodo;

import java.awt.*;
import javax.swing.*;

/*
 2.- Crear una ventana con las siguientes caracter�sticas:
T�tulo= �Ventana con etiquetas�
Ubicaci�n= centrada - Tama�o= �400 pixels * 400 pixels�
Al hacer click en el bot�n de cerrar ventana, se debe cerrar la aplicaci�n.
Dentro de la ventana se debe colocar la etiqueta: Nombre:
A continuaci�n de la etiqueta se debe colocar un campo de texto para ser completado.
Para ayuda, ac�: https://www.youtube.com/watch?v=JIZdNHWDOlE
 */
public class codoacodo_EjOb_unidad4parte2ej2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// crea la ventana y la casilla de texto
		JFrame ventana = new JFrame();
		Label nombre = new Label("Nombre:");
		JTextField texto = new JTextField("Ingrese su nombre");
		// propiedades de la ventana
		ventana.setSize(400, 400);
		ventana.setTitle("Ventana con etiquetas");
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ventana.setLayout(new FlowLayout());
		ventana.add(nombre);
		ventana.add(texto);
		ventana.setVisible(true);
		ventana.setLocationRelativeTo(null);
	}

}
