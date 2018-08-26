/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Comision1852_CodoaCodo;

import java.util.Scanner;

/**
 *
 * @author Jesus Arias
 */
public class test {
     public static void main(String[] args) {
       int Numeros = 0, i = 0, total = 0, nuevoNumero = 0, totalr=0;
          
        Scanner entrada = new Scanner(System.in);
       System.out.println("Ingrese la cantidad de numeros a restar: 2 o 3: ");
      Numeros = entrada.nextInt();
        
        if (Numeros==2){
            System.out.println("ingrese un numero");
            int num1=entrada.nextInt();
            
            System.out.println("ingrese un numero");
            int num2=entrada.nextInt();
            
            totalr=num1-num2;           
             System.out.println("el total de la suma es: " +totalr);
               
            
        }else{if(Numeros==3){
        System.out.println("ingrese un numero");
            int num1=entrada.nextInt();
            
            System.out.println("ingrese un numero");
            int num2=entrada.nextInt();
            System.out.println("ingrese un numero");
            int num3=entrada.nextInt();
            
            totalr=num1-num2-num3;   
             System.out.println("el total de la suma es: " +totalr);
               
        
        }else{System.out.println("opcino incorrecta " );
           }
                 }
             
     }


}

