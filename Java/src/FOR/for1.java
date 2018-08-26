/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FOR;

/**
 *
 * @author Jesus Arias
 */
public class for1 {
    public static void main (String []arg){
       int i; 

       //for(iniciar el contador ;la condicion ;el incremento del contador )
        for(i=0;i<5;i+=1){
            
            System.out.println(i+"");
            i+=1;
        }
        System.out.println("estoy fuera del bucle");
    }
}
