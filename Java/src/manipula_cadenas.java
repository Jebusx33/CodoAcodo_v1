
public class manipula_cadenas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/* lengh(): devuelve la longitud de una cadena de caracter ej: mi_nombre.length()=4
		 * charAt(n): devuelve la posición de un caracter dentro de una cadena. (las posiciones empiezan a contar desde 0) eje: mi_nombre.charAt(2)=a
		 */
		String nombre="juan";//variable objeto del tipo string
		System.out.println("Mi nombre es " + nombre);

	
		
		System.out.println("Mi nombre tiene " + nombre.length()+ " letras."	); //cuenta cantidad de letras
		
	    System.out.println("la primera letra de  " + nombre + " es " + nombre.charAt(0));//concatena nombre y indica un caracter en una posición
	    
	    int ultima_letra;
	    ultima_letra=nombre.length();
	    	System.out.println("la ultima letra es la " + nombre.charAt(ultima_letra-1));
	   
	    
	    //System.out.println("Mi_nombre es " + nombre.substring(0));

	}

}
