/*
1. Algoritmo que lea tres números distintos y nos diga cuál de ellos es
el mayor (recuerda usar la estructura condicional y los operadores
lógicos). Usar Scanner.
 */
package Comision1852_CodoaCodoTP2;

import java.util.Scanner;

/**
 *
 * @author Jesus Arias
 */
public class T2_ej1 {
    public static void main(String[] args) {
    
     Scanner entrada = new Scanner(System.in);
      System.out.println("ingrese un numero  ");
        int num1 = entrada.nextInt();
System.out.println("ingrese un numero  ");
        int num2 = entrada.nextInt();
System.out.println("ingrese un numero  ");
        int num3 = entrada.nextInt();
        
        if (num1>num2 && num1>num3 ){
            //num1 es mayor
            System.out.println(num1 + " es mayor");  
        }else{
           if (num2>num1 && num2>num3 ){
               //num2 es mayor
               System.out.println(num2 + " es mayor");  
           }else{
                //num3 es mayor
                System.out.println(num3 + " es mayor");  
           }
        }
        
    
    }
    
}
