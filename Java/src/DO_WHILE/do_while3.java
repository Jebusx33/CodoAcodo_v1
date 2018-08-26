/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DO_WHILE;

import java.util.Scanner;

/**
 *
 * @author Jesus Arias
 */
public class do_while3 {
     public static void main (String[] arg){
        int a;
        Scanner s=new Scanner(System.in);
        
        
       
        
    
    do{//siempre se ejecuta una vez
        System.out.println("1- hola mundo!");
        System.out.println("2- uso for numeros entre 5 y 10");
        System.out.println("elije una opcion:");
        
        a =s.nextInt();
        
    }
    while(a>2||a<1);
    switch(a){
        case 1:
        System.out.println("hola mundo");
        break;
        case 2:
            for(int i=5;i<10;i++){
            System.out.println(i+"");
            }
        break;
      /*  termina la funcion //default:
            System.out.println("elije una opcion valida1");*/
        
        
    }
        
        
 
        
        
        
    }
}
