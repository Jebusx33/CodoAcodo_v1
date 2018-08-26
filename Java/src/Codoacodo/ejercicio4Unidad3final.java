package Codoacodo;

import java.util.Scanner;

public class ejercicio4Unidad3final {
	private static Scanner entrada;
	private static Scanner lec;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	    int contadorTotal=0,contadorIngles=0,contadorFrances=0,contadorPortugues=0,contadorAleman=0;
	     String seguir="s",opcion = null;
	     
	     while(seguir.equalsIgnoreCase("s")){
	        System.out.println("ingrese la opcion del idioma segun corresponda al alumno en mayuscula \n[I]nglés\n[F]rancés\n[P]ortugués\n[A]lemán\n0- finalizar ingreso");
	         opcion=new Scanner(System.in).next();
	        
	        contadorTotal++;
	       
	         switch(opcion){
	             case "I":{
	                contadorIngles++;
	                break;}
	             case "F":{
	                contadorFrances++;
	                break;}
	             case "Pp":{
	                contadorPortugues++;
	                break;}
	             case "A":{
	                contadorAleman++;
	                break;}
	             default:{
	                 System.out.println("error en el ingreso de la materia");}
	         }
	         
	         System.out.println("desea seguir agregando alumnos a las materias \n s =si \n n=no elija una opcion y precione ENTER");
	         seguir=new Scanner(System.in).next();
	     } 
	        
	         System.out.println("promedio de inscriptos a INGLES es de: "+(contadorIngles*100/contadorTotal));
	         System.out.println("promedio de inscriptos a FRANCES es de: "+(contadorFrances*100/contadorTotal));
	         System.out.println("promedio de inscriptos a PORTUGUES es de: "+(contadorPortugues*100/contadorTotal));
	         System.out.println("promedio de inscriptos a ALEMAN es de: "+(contadorAleman*100/contadorTotal));
	     }
	     

	@SuppressWarnings("unused")
	private static int equalsIgnoreCase(final String opcion) {
		// TODO Auto-generated method stub
		return 0;
	}

	public static Scanner getEntrada() {
		return entrada;
	}

	public static void setEntrada(Scanner entrada) {
		ejercicio4Unidad3final.entrada = entrada;
	}

	public static Scanner getLec() {
		return lec;
	}

	public static void setLec(Scanner lec) {
		ejercicio4Unidad3final.lec = lec;
	}
	}
