/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Codoacodo.EjObUnidad5p2;

/**
 *
 * @author Jesus Arias
 */
public class Principal {
    public static void main (String [] args){
        
        System.out.println("Empleado");    
   Empleado empleado =new Empleado("juan", "perez", "432435453",23,true, 10000);
   
      empleado.mostrarDatosE();
     empleado.rangoedad();
    //en el caso de que haya aumento
     empleado.Aumento();
     
     
 System.out.println("\nProgramador");
  
Programador programador=new Programador("pepe", "sarasa", "5442323", 36, false, 1234,"java", 3500);
             
     programador.mostrarDatosP();
     programador.rangoedad();
     
    
     
//


   
    }
    
}
