package Codoacodo;

import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JButton;
/*
 1.- Desarrollar un programa que pida una cantidad de artículos comprados y el precio unitario de ese
artículo. Por cada carga debe preguntar si se desea seguir ingresando de la forma “¿Desea ingresar otro
artículo? [S/N]”.
La carga de datos finaliza cuando se detecta una n o N. La computadora debe mostrar el monto de la
factura. (Usar la clase JOptionPane tanto para cargar datos como para mostrar mensajes y resultados) 

 */
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JProgressBar;
import javax.swing.JTextField;										
public class Ventana {

	private static JTextField texto;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
JFrame ventana=new JFrame();
setTexto(new JTextField("introduce un texto"));
JLabel etiqueta = new JLabel("etiqueta");
JButton boton =new JButton("boton");
JProgressBar barra = new JProgressBar();

barra.setValue(80);
ventana.setSize(800,600);
ventana.setTitle("Ventana");
ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
ventana.setLayout(new FlowLayout());
ventana.add(texto);
ventana.add(etiqueta);
ventana.add(boton);
ventana.add(barra);
ventana.setVisible(true);
}

	private static void setTexto(JTextField jTextField) {
		// TODO Auto-generated method stub
		
	}

    static void setColor(int i, int i0, int i1) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    static void setBackground(Color color) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
