package Codoacodo;

import java.util.Scanner;

public class codoacodo_EjOb_unidad5p10 {

	private static Scanner entrada;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		  int edad,genero,contadorGeneral=0,contadorMasculino=0,contadorFemenino=0;
		    String nombre,apellido,categoria;
		    entrada = new Scanner(System.in);
		    
		        System.out.println("ingrese el nombre del nuevo socio");
		        nombre=entrada.next();
		        
		        while(!nombre.toUpperCase().equals("XXX")){
		            System.out.println("ingresse el apellido del nuevo socio");
		            apellido=entrada.next();
		            System.out.println("ingrese la edad del nuevo socico");
		            edad= entrada.nextInt();
		            System.out.println("ingrese el genero del nuevo socio");
		            System.out.println("1- masculino");
		            System.out.println("2- femenino");
		            genero=entrada.nextInt();
		            contadorGeneral++;
		            if(genero==1){
		                contadorMasculino++;
		            }else{
		                contadorFemenino++;
		            }
		            
		            if(0 <= edad&&edad <4){
		                categoria="Infantil";
		            }else if(4<= edad&&edad < 12){
		                categoria="menor";
		            }else if(12<= edad&&edad < 18){
		                categoria="juvenil";
		            }else{
		                categoria="adulto";
		            }
		            System.out.println("datos del nuevo socio");
		            System.out.println("nombre: "+nombre+" apellido: "+apellido+" categoria :"+categoria);
		            System.out.println("\ningrese el nombre del nuevo socio");
		            nombre=entrada.next();
		            
		        }
		        
		        System.out.println("en total hubo "+contadorGeneral+" nuevos socios inscriptos");
		        System.out.println("el porcentaje de mujeres inscripas fue de "+(contadorFemenino*100/contadorGeneral)+"%");
		        
		        
		    
		
	}

}
