/*
 1) Algoritmo que lea dos números, calculando y escribiendo el valor de su
suma, resta, producto y división.
 */
package Comision1852_CodoaCodo;

import java.util.Scanner;

/**
 *
 * @author Jesus Arias
 */
public class Un1EjComParte1_ej1 {
    public static void main (String [] args){
    
        Scanner entrada = new Scanner(System.in);
		System.out.println("Introduce 1 digito del 1 al 9 luego Precione Enter ");
		long numero1 = entrada.nextInt();
                System.out.println("Introduce 1 digito del 1 al 9 luego Precione Enter ");
		long numero2 = entrada.nextInt();
                int resultado_suma= (int) (numero1+numero2);
                int resultado_resta= (int) (numero1-numero2);
                int resultado_producto= (int) (numero1*numero2);
                int resultado_division= (int) (numero1/numero2);
                
                System.out.println("La suma de los numeros es :"+ resultado_suma  );
                System.out.println("La resta de los numeros es :"+ resultado_resta  );
                System.out.println("El producto de los numeros es :"+ resultado_producto  );
                System.out.println(resultado_division + " es"+ " la divisi\u00f3n de los numeros ingresados" );
    
    }
}
