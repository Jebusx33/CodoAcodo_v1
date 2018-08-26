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
public class do_while32 {
    public static void main (String[] arg){
        int a,b;
        Scanner s=new Scanner(System.in);
        System.out.println("introduce el numero menor");
        a =s.nextInt();
        
       
        
    
    do{//siempre se ejecuta una vez
        System.out.println("introduce el numero mayor");
        b =s.nextInt();
        System.out.println(a+"");
        a++;
    }
    while(a<b);//a=7 b=10;
    System.out.println(a+"");
        a++;
        
        
 
        
        
        
    }
    
    
    
    
    
}
