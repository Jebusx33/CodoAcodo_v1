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
public class suma {

    
    
    Scanner entrada = new Scanner(System.in);
    int Numeros = 0, i = 0, total = 0, nuevoNumero = 0;

    public Scanner getEntrada() {
        return entrada;
    }

    public void setEntrada(Scanner entrada) {
        this.entrada = entrada;
    }

    public int getNumeros() {
        return Numeros;
    }

    public void setNumeros(int Numeros) {
        this.Numeros = Numeros;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public int getNuevoNumero() {
        return nuevoNumero;
    }

    public void setNuevoNumero(int nuevoNumero) {
        this.nuevoNumero = nuevoNumero;
    }

    public suma() {
    }
    
     public void suma() {

        System.out.print("Ingrese la cantidad de numeros a sumar: ");
        Numeros = entrada.nextInt();

        for (i = 1; i <= Numeros; i++) {
            System.out.print("Ingrese el numero (" + i + ") : ");
            nuevoNumero = entrada.nextInt();

            total = total + nuevoNumero;
        }
        System.out.println("La suma total de los numeros es : " + total);

    }

    
}
