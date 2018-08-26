package Codoacodo;
//@author Jesus Arias
import java.util.Scanner;

public class codoacodo_EjOb_unidad5p8 {

private static Scanner entrada;


/*
 8. Una ONG reparte vacunas en dispensarios médicos. El procedimiento consiste en
comenzar el día con 1000 dosis. En cada dispensario se entregan la cantidad de
vacunas pedidas. Se pide informar cuando el stock baje de 200 unidades e informar
cuantas dosis quedan.
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int dosis, stock=1000;
	        
	        entrada = new Scanner(System.in);
	        System.out.println("¿Cuantas dosis desea retirar?");
	            dosis=entrada.nextInt();
	     
	 	 
	            while(stock>200){
	            if(dosis>stock){
	            System.out.println("retire menos dosis,  "+(stock-dosis)+" dosis en stock");
	            dosis=entrada.nextInt();
	            }
	            
	            else if(stock==dosis || dosis>800){
	            	System.out.println("retire menos dosis hay: "+(stock-dosis)+" dosis en stock");
 		            dosis=entrada.nextInt();
	            }
	            else if(stock<800){
	            	System.out.println("Renovar stock quedan: "+(stock-dosis)+" dosis");
 		            dosis=entrada.nextInt();
	            }
 		       
	            else{
	            stock-=dosis;
	            System.out.println("¿Cuantas dosis desea retirar?");
	            dosis=entrada.nextInt();}
	            	            
	        }
	          System.out.println("Renovar stock quedan: "+(stock-dosis)+" dosis");
	        
	    }		
	}

