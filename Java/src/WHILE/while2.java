/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WHILE;

import java.util.Scanner;

/**
 *
 * @author Jesus Arias
 */
public class while2 {
    
    
    public static void main (String[] arg){
 int a,b,i,suma=0;
        Scanner s=new Scanner(System.in);
        System.out.println("introduce el numero menor");
        a =s.nextInt();
        
        System.out.println("introduce el numero mayor");
        b =s.nextInt();
        i=a;
       while(i<b){//i=2, b=5
           suma+=i; //suma + suma +i
           i++;
       } 
        
        System.out.println(suma);
        
        
 
        
        
        
    } 
    
}
