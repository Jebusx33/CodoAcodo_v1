package Ejemplos;

import javax.swing.JOptionPane;

public class Caja_de_dialogo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * 06 Lanza un dialogo de mensaje de una línea: 07
		 */

		// En la siguiente línea está la magia (es lo que muestra el mensaje).

		JOptionPane.showMessageDialog(null, "¡Hola mundo!");

		
		/*
		 * 
		 * Lanza un dialogo de varias líneas:
		 * 
		 */

		String nl = System.getProperty("line.separator");

		// Lanzamos el mensaje:

		JOptionPane.showMessageDialog(null, "Soy un mensaje"

		+ nl + "de varias líneas..."

		+ nl + "Y esto lo viste en el Blog de Baro :D.");

		/*
		
		  * Lanza varios dialogos con diferentes tipos de ícono.
		
		  */
		
		 		
		  //Propiedad del sistema para salto de línea:
		
		//  String nl = System.getProperty("line.separator");
		
		  //Mensaje (lo usaremos en todos los dialogos):
		
		  Object msj = "Soy un mensaje"
		
		   + nl + "de varias líneas..."
		
		   + nl + "Y esto lo viste en el Blog de Baro :D.";
		
		   
		
		  /*
		
		   * Pongo cada argumento en diferente línea para
		
		   * que no se haga muy largo y el código esté
		
		   * más ordenado:
		
		   */
		
		  JOptionPane.showMessageDialog(null,
		
		    msj, //Mensaje
		
		    "Mensaje Plano", //Título
		
		    JOptionPane.PLAIN_MESSAGE); //Tipo de mensaje
		
		   
		
		  JOptionPane.showMessageDialog(null,
		
		    msj, //Mensaje
		
		    "Mensaje Informativo", //Título
		
		    JOptionPane.INFORMATION_MESSAGE); //Tipo de mensaje
		
		   
		
		  JOptionPane.showMessageDialog(null,
		
		    msj, //Mensaje
		
		    "Mensaje de Pregunta", //Título
	
		    JOptionPane.QUESTION_MESSAGE); //Tipo de mensaje
		
		   
		
		  JOptionPane.showMessageDialog(null,
		
		    msj, //Mensaje
		
		    "Mensaje de Error", //Título
		
		    JOptionPane.ERROR_MESSAGE); //Tipo de mensaje
		
		   
		
		  JOptionPane.showMessageDialog(null,
		
		    msj, //Mensaje
		
		    "Mensaje de Advertencia", //Título
		
		    JOptionPane.WARNING_MESSAGE); //Tipo de mensaje
		
		 	
		  

		
		
		
		
		
	}

}
