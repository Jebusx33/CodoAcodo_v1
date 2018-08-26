//Metodos (más usados) de la clase String para manipulacion de cadenas de texto: (usando Juan como ejemplo)
	/* lengh(): devuelve la longitud de una cadena de caracter ej: mi_nombre.length()=4
	 * charAt(n): devuelve la posición de un caracter dentro de una cadena. (las posiciones empiezan a contar desde 0) eje: mi_nombre.charAt(2)=a
	 * substring(x,y): devuelve una subcadena dentro de la cadena, siendo X el caracter a partir del cual se extrae e y el Nº de caracteres que se quieren esxtraer.
	 * equals(cadena): devuelve true si dos cadenas que se comparan son iguales y false si no lo son, Distingue mayúsculas y minusculas
	 * equallsignoreCase(cadena): igual que el anteriro pero sin tener encuenta mayúsculas y minusculas.
	 * 
	 */
public class Cadenas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//uso de la clase String
		
		//* lengh(): devuelve la longitud de una cadena de caracter ej: mi_nombre.length()=4
				
	String nombre="Jesus"; //donde mi_nombre es un objeto(instancia, ejemplar) de clase string

		System.out.println("Mi nombre es " + nombre);
		
		System.out.println("Mi nombre tiene " + nombre.length()+ " letras."	);
		
		//* charAt(n): devuelve la posición de un caracter dentro de una cadena. (las posiciones empiezan a contar desde 0) eje: mi_nombre.charAt(2)=a
					
	    System.out.println("la primera letra de  " + nombre + " es " + nombre.charAt(0));
	    
	    int ultima_letra;
	    ultima_letra=nombre.length();
	    	System.out.println("la ultima letra es la " + nombre.charAt(ultima_letra-1));
	   
	    //System.out.println("Mi_nombre es " + nombre.substring(0));
	
			
			// * substring(x,y): devuelve una subcadena dentro de la cadena, siendo X el caracter a partir del cual se extrae e y el Nº de caracteres que se quieren esxtraer.
	    	
	    	String frase="Hoy es un estupendo dia para aprender a programar en java";
			
			//String Frase_resumen=frase.substring(1,3);//indica primer posicion que se extrae y hasta donde se extraera
			
			String Frase_resumen=frase.substring(29,57);
			System.out.println(Frase_resumen);
			
			String frase2="Hoy es un estupendo dia para aprender a programar en java";
			String Frase_resumen2=frase2.substring(0,29) + "irnos a la playa y olvidarnos de todo...";
			
			System.out.println(Frase_resumen2);
			
			String frase3="Hoy es un estupendo dia para aprender a programar en java";
			String Frase_resumen3=frase3.substring(0,29) + "irnos a la playa y olvidarnos de todo..." + " y "+ frase3.substring(29,57);
			
			System.out.println(Frase_resumen3);
			
			// * equals(cadena): devuelve true si dos cadenas que se comparan son iguales y false si no lo son, Distingue mayúsculas y minusculas
			String alumno1, alumno2;
			alumno1="David";
		    alumno2="david";
		    System.out.println(alumno1.equals(alumno2));//evalua que sean iguales y disteinge las mayusculas

		    //	 * equallsignoreCase(cadena): igual que el anteriro pero sin tener encuenta mayúsculas y minusculas.
			 
		    String alumno3, alumno4;
			alumno3="David";
		    alumno4="david";
		    System.out.println(alumno3.equalsIgnoreCase(alumno4));//evalua que sean iguales no disteinge las mayusculas


		
	}

}
