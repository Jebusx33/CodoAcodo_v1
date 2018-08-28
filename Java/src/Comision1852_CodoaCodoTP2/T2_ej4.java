/*
4. Suponga un array que contiene N notas de 0 a 10 generados
aleatoriamente y mostradas en pantalla, de acuerdo a la nota
contenida, indicar cuántos estudiantes perteneces al grupo:
? Bajo de conocimientos de 0-4
? Regulares de mayor de 4 hasta 5
? Buenos mayor a 5 hasta 7
? Muy buenos mayor de 7 a 9
? Excelentes mayor a 9
 */
package Comision1852_CodoaCodoTP2;

import java.util.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Jesus Arias
 */
public class T2_ej4 {

    public static void main(String[] args) {
        int estudiantes = 0, bajo = 0, regular = 0, bueno = 0, muyBueno = 0, excelente = 0;

        estudiantes = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de alumnos:"));

        int[] matriz_aleatorio = new int[estudiantes];
        for (int j = 0; j < matriz_aleatorio.length; j++) {
            matriz_aleatorio[j] = (int) Math.round(Math.random() * 10);
        }

        for (int i = 0; i < matriz_aleatorio.length; i++) {
            if (matriz_aleatorio[i] < 4) {
                bajo++;
            } else if (matriz_aleatorio[i] <= 5) {
                regular++;
            } else if (matriz_aleatorio[i] <= 7) {
                bueno++;
            } else if (matriz_aleatorio[i] <= 9) {
                muyBueno++;
            } else {
                excelente++;
            }
        }

        JOptionPane.showMessageDialog(null, "El total de estudiantes es: "
                + estudiantes
                + "\nLos niveles son:"
                + "\nBajo: " + bajo
                + "\nRegulares: " + regular
                + "\nBuenos: " + bueno
                + "\nMuy Buenos: " + muyBueno
                + "\nExcelentes: " + excelente);
    }

}
