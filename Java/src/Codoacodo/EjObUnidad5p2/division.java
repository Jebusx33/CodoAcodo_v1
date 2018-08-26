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
public class division {
    Scanner entrada = new Scanner(System.in);
    int Numeros = 0, i = 0, total = 0, nuevoNumero = 0;

    public division() {
    }

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
    
    public void division() {

        
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de numeros a dividir: 2 o 3: ");
        Numeros = entrada.nextInt();

        if (Numeros == 2) {
            System.out.println("ingrese un numero");
            int num1 = entrada.nextInt();

            System.out.println("ingrese un numero");
            int num2 = entrada.nextInt();

            total= num1 / num2;
            System.out.println("el total de la suma es: " + total);

        } else {
            if (Numeros == 3) {
                System.out.println("ingrese un numero");
                int num1 = entrada.nextInt();

                System.out.println("ingrese un numero");
                int num2 = entrada.nextInt();
                System.out.println("ingrese un numero");
                int num3 = entrada.nextInt();

                total = (num1 / num2) / num3;
                System.out.println("el total de la division es: " + total);

            } else {
                System.out.println("opcino incorrecta ");
            }
        }
    }

    
}
