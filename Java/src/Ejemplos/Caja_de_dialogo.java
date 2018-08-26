package Ejemplos;

import javax.swing.JOptionPane;

public class Caja_de_dialogo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * 06 Lanza un dialogo de mensaje de una l�nea: 07
		 */

		// En la siguiente l�nea est� la magia (es lo que muestra el mensaje).

		JOptionPane.showMessageDialog(null, "�Hola mundo!");

		
		/*
		 * 
		 * Lanza un dialogo de varias l�neas:
		 * 
		 */

		String nl = System.getProperty("line.separator");

		// Lanzamos el mensaje:

		JOptionPane.showMessageDialog(null, "Soy un mensaje"

		+ nl + "de varias l�neas..."

		+ nl + "Y esto lo viste en el Blog de Baro :D.");

		/*
		
		  * Lanza varios dialogos con diferentes tipos de �cono.
		
		  */
		
		 		
		  //Propiedad del sistema para salto de l�nea:
		
		//  String nl = System.getProperty("line.separator");
		
		  //Mensaje (lo usaremos en todos los dialogos):
		
		  Object msj = "Soy un mensaje"
		
		   + nl + "de varias l�neas..."
		
		   + nl + "Y esto lo viste en el Blog de Baro :D.";
		
		   
		
		  /*
		
		   * Pongo cada argumento en diferente l�nea para
		
		   * que no se haga muy largo y el c�digo est�
		
		   * m�s ordenado:
		
		   */
		
		  JOptionPane.showMessageDialog(null,
		
		    msj, //Mensaje
		
		    "Mensaje Plano", //T�tulo
		
		    JOptionPane.PLAIN_MESSAGE); //Tipo de mensaje
		
		   
		
		  JOptionPane.showMessageDialog(null,
		
		    msj, //Mensaje
		
		    "Mensaje Informativo", //T�tulo
		
		    JOptionPane.INFORMATION_MESSAGE); //Tipo de mensaje
		
		   
		
		  JOptionPane.showMessageDialog(null,
		
		    msj, //Mensaje
		
		    "Mensaje de Pregunta", //T�tulo
	
		    JOptionPane.QUESTION_MESSAGE); //Tipo de mensaje
		
		   
		
		  JOptionPane.showMessageDialog(null,
		
		    msj, //Mensaje
		
		    "Mensaje de Error", //T�tulo
		
		    JOptionPane.ERROR_MESSAGE); //Tipo de mensaje
		
		   
		
		  JOptionPane.showMessageDialog(null,
		
		    msj, //Mensaje
		
		    "Mensaje de Advertencia", //T�tulo
		
		    JOptionPane.WARNING_MESSAGE); //Tipo de mensaje
		
		 	
		  

		
		
		
		
		
	}

}
