/*
 2) Dadas tres variables numéricas A , B, C se pide realizar un algoritmo que
intercambie los valores de las variables y las muestre al final a las tres
variables , en el orden C, B, A (recuerda la asignación).

 */
package Comision1852_CodoaCodo;

import java.util.Scanner;

/**
 *
 * @author Jesus Arias
 */
public class Un1EjComParte1_ej2 {
      
    public static void main(String []args){
        
        int A=0,B=0,C=0; 
        
       Scanner entrada = new Scanner(System.in);
        System.out.println("ingrese un numero para A: ");
         int a = entrada.nextInt();
        System.out.println("ingrese un numero para B: ");
         int b = entrada.nextInt();
        System.out.println("ingrese un numero para c: ");
	 int c = entrada.nextInt();
        //System.out.println("Los numeros ingresados son:" +"\nA:"+a+"\nB:"+b+"\nC:"+c );
       
        A=c;
        B=b;
        C=a;
        System.out.println("La nueva asignación de los numeros ingresados es:" +"\nA:"+A+"\nB:"+B+"\nC:"+C );
        
        
        
    }
    
}
