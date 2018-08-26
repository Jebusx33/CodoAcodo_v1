/*
4) Un colegio desea saber qué porcentaje de niños representan 27 y qué
porcentaje de niñas representan 54 en el curso actual. Diseñar un algoritmo
para este propósito (recuerda que para calcular el porcentaje puedes hacer
una regla de 3).
 */
package Comision1852_CodoaCodo;

/**
 *
 * @author Jesus Arias
 */
public class Un1EjComParte1_ej4 {

    public static void main(String[] args) {

        int niños = 27, niñas = 54;
        double totaln = niños + niñas;
        double porcentaje_niño = (niños * 100) / totaln;
        double porcentaje_niña = (niñas * 100) / totaln;
        System.out.println("El porcantaje de niños es:" + String.format("%.3f", porcentaje_niño) + "%"
                + "\nEl porcantaje de niñas es:" + String.format("%.3f", porcentaje_niña) + "%");

    }

}
