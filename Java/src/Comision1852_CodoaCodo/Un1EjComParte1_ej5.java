/*
5) Algoritmo que lea 10 números, calculando su promedio y escribiendo el
valor de su suma, y el promedio .
 */
package Comision1852_CodoaCodo;

import java.util.Scanner;

/**
 *
 * @author Jesus Arias
 */
public class Un1EjComParte1_ej5 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int Numeros = 10, i = 0, total = 0, nuevoNumero = 0;
        for (i = 1; i <= Numeros; i++) {
            System.out.print("Ingrese el numero (" + i + ") : ");
            nuevoNumero = entrada.nextInt();

            total = total + nuevoNumero;
        }

        System.out.println("La suma total de los numeros es : " + total);
        System.out.println("El promedio es de : " + (total / 10));

    }

}
