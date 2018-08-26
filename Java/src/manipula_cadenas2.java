
public class manipula_cadenas2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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

		
	}

}
