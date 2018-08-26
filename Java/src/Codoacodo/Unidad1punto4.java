package Codoacodo;
import java.util.Scanner;
public class Unidad1punto4 {
	 private static Scanner teclado;

	public static void main(String[] args) {
		double suma = 0, promedio,promediopos,promedioneg;
		@SuppressWarnings("unused")
		int i, sumaPos=0,sumaNeg=0,contPos=0,contNeg=0;
		 
	        int[] numeros = new int[10];

	        teclado = new Scanner(System.in);

	        for(i=0; i<numeros.length; i++)
	        {
	            System.out.printf("Introduzca número %d: ", i+1);
	            numeros[i] = teclado.nextInt();
	        }

	        for(i=0; i<numeros.length; i++)
	        {  	
	            System.out.println(numeros[i]);
	          }
	     // Sumar todas las notas
	        for (i = 0; i < numeros.length; i++) {
	            suma = suma + numeros[i];
	            sumaPos+=numeros[i];
	            contPos++;
	            sumaNeg+=numeros[i];
	            contNeg++;
	        }
	        // Calcular el promemedio
	        promedio = suma / numeros.length;
            promediopos = sumaNeg/contNeg;
            promedioneg = sumaNeg/contNeg;
	        // Mostrar el promedia
	        System.out.printf("El promedio de los numeros ingresado es:", promedio);
	        System.out.println("El promedio de los valores positivos es:" + promediopos);
	        System.out.println("El promedio de los valores negativos es:" + promedioneg );
	        
	    }
	} 


