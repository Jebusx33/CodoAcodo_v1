package Codoacodo;

import java.awt.*;
import javax.swing.*;

/*
 3.- Crear una ventana con las siguientes características:
Título= “Ventana con botones”
Ubicación= centrada - Tamaño= “600 pixels * 400 pixels”
Al hacer click en el botón de cerrar ventana, se debe cerrar la aplicación.
Dentro de la ventana se debe colocar 3 botones con los textos: Azul, Rojo y Amarillo.
 */
public class codoacodo_EjOb_unidad4parte2ej3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// crea la ventana y los botones
		JFrame ventana = new JFrame();
		JButton boton1 = new JButton();
		boton1.setForeground(Color.BLUE);
		JButton boton2 = new JButton("Rojo");
		boton2.setForeground(Color.RED);
		Component boton3 = new JButton("Amarillo");
		boton3.setForeground(Color.yellow);
		// propiedades de la ventana
		ventana.setSize(600, 400);
		ventana.setTitle("Ventana con botones”");
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ventana.setLayout(new FlowLayout());
		ventana.add(boton1);
		ventana.add(boton2);
		ventana.add(boton3);
		ventana.setVisible(true);
		ventana.setLocationRelativeTo(null);
	}

}
