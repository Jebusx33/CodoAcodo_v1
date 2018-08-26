package Codoacodo;

import java.awt.*;
import javax.swing.*;

/*
 6.- Crear una ventana con las siguientes caracter�sticas:
T�tulo= �Ventana con botones de selecci�n �nica�
Ubicaci�n= centrada - Tama�o= �400 pixels * 400 pixels�
Al hacer click en el bot�n de cerrar ventana, se debe cerrar la aplicaci�n.
Dentro de la ventana se debe colocar un grupo de botones de selecci�n �nica con los
posibles estados civiles
 */
public class codoacodo_EjOb_unidad4parte2ej6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// crea la ventana y los botones
		JFrame ventana = new JFrame();
		ButtonGroup grupo = new ButtonGroup();
		JRadioButton op1 = new JRadioButton("Solero");
		JRadioButton op2 = new JRadioButton("Casado");
		// permite elegir solo 1 opcion
		grupo.add(op1);
		grupo.add(op2);
		// propiedades de la ventana
		ventana.setSize(400, 400);
		ventana.setTitle("Ventana con lista desplegable");
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ventana.setLayout(new FlowLayout());
		ventana.add(op1);
		ventana.add(op2);
		ventana.setVisible(true);
		ventana.setLocationRelativeTo(null);
	}

}
