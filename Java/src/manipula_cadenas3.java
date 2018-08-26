
public class manipula_cadenas3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/* equals(cadena): devuelve true si dos cadenas que se comparan son iguales y false si no lo son, Distingue mayúsculas y minusculas
* equallsignoreCase(cadena): igual que el anteriro pero sin tener encuenta mayúsculas y minusculas.
*/
		
		String alumno1, alumno2;
		alumno1="David";
	    alumno2="david";
	    System.out.println(alumno1.equals(alumno2));//evalua que sean iguales y disteinge las mayusculas
	    
	    String alumno3, alumno4;
		alumno3="David";
	    alumno4="david";
	    System.out.println(alumno3.equalsIgnoreCase(alumno4));//evalua que sean iguales no disteinge las mayusculas

	    
	}

}
