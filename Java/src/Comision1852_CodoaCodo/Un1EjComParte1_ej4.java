/*
4) Un colegio desea saber qu� porcentaje de ni�os representan 27 y qu�
porcentaje de ni�as representan 54 en el curso actual. Dise�ar un algoritmo
para este prop�sito (recuerda que para calcular el porcentaje puedes hacer
una regla de 3).
 */
package Comision1852_CodoaCodo;

/**
 *
 * @author Jesus Arias
 */
public class Un1EjComParte1_ej4 {

    public static void main(String[] args) {

        int ni�os = 27, ni�as = 54;
        double totaln = ni�os + ni�as;
        double porcentaje_ni�o = (ni�os * 100) / totaln;
        double porcentaje_ni�a = (ni�as * 100) / totaln;
        System.out.println("El porcantaje de ni�os es:" + String.format("%.3f", porcentaje_ni�o) + "%"
                + "\nEl porcantaje de ni�as es:" + String.format("%.3f", porcentaje_ni�a) + "%");

    }

}
