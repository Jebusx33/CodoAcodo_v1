/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Codoacodo.EjObUnidad5p2;

import java.util.Scanner;



/**
 *
 * @author Jesus Arias
 */
public class Calculadora {
int opcion;
    suma Suma = new suma ();
resta Resta = new resta();
multiplicacion Multiplicacion =new multiplicacion();
division Division = new division();
    
 public void MostrarDatos(){
     Scanner entrada = new Scanner(System.in);
        System.out.println(" ingrese:\n 1 para sumar\n 2 para restar\n 3 para multiplicar\n 4 para dividir ");
        opcion = entrada.nextInt();
     
     switch (opcion) {
            case 1:  Suma.suma();
                     break;
            case 2:  Resta.resta();
                     break;
            case 3:  Multiplicacion.producto();
                     break;
            case 4:  Division.division();
                     break;
                      default :
        System.out.println("numero incorrecto");
                    }
     
   
     
     
   
     
}

    




   

}
