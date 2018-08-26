/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FOR;

import java.util.Scanner;

/**
 *
 * @author Jesus Arias
 */
public class for2 {
    
    
    public static void main (String[] arg){
            int a,b,suma=0;
        Scanner s=new Scanner(System.in);
        System.out.println("introduce el numero menor");
        a =s.nextInt();
        
        System.out.println("introduce el numero mayor");
        b =s.nextInt();
        
      for(int i=a ;i<b ; i++){
      suma+=i;
      
      }
        
        System.out.println(suma);
        
        
 
        
        
        
    }
    
    
    
    
}
