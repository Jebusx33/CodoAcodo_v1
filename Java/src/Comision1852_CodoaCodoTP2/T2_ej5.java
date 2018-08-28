/*
 5. Realizar un algoritmo con el siguiente proceso:
1. Llenar Vector A de manera aleatoria.
2. Llenar Vector B de manera aleatoria.
3. Realizar C=A+B
4. Realizar D=B-A
5. Mostrar por pantalla los contenidos de los dos Vectores A, B, y los
totales de C y D.
6. Salir.
NOTA.
El rango de los números aleatorios para los Vectores será de [-100 a 100].
Validar opción 3, 4 es decir que el rango de los datos sea el correcto.
La longitud de los Vectores es la misma, por lo tanto solo se solicitará una
vez.
 */
package Comision1852_CodoaCodoTP2;

import javax.swing.JOptionPane;

/**
 *
 * @author Jesus Arias
 */
public class T2_ej5 {

    public static void main(String[] args) {

        int tamaño = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el tamaño de los vectores"));
        int[] vectorA = new int[tamaño];
        int[] vectorB = new int[tamaño];
        int[] vectorC = new int[tamaño];
        int[] vectorD = new int[tamaño];
        //pasa de int a striing para imprimir
        String cad1 = "", cad2 = "", cad3 = "", cad4 = "";

        int op = 0;
        String menu = "***** Menú operaciones de vectores *****\n";
        menu += "1.- Llenar vector A\n";
        menu += "2.- Llenar vector B\n";
        menu += "3.- Realizar C=A+B\n";
        menu += "4.- Realizar D=B-A\n";
        menu += "5.- Mostrar los vectores: A,B,C,D\n";
        menu += "6.- Salir\n";
        menu += "Digita una opción";
        do {
            op = Integer.parseInt(JOptionPane.showInputDialog(menu));
            switch (op) {

                case 1:
                    //vector A
                    for (int i = 0; i < vectorA.length; i++) {
                        vectorA[i] = ((int) (Math.floor(Math.random()
                                * (100 - (-100) + 1)) + (-100)));
                    }
                    for (int numeros : vectorA) {
                        //System.out.println(numeros);
                    }
                    //Imprime los vectores
                    for (int i = 0; i < vectorA.length; i++) {
                        cad1 += vectorA[i] + " ";
                    }
                    JOptionPane.showMessageDialog(null, "A: " + cad1);
                    break;
                case 2:
                    //vector B
                    for (int i = 0; i < vectorB.length; i++) {
                        vectorB[i] = ((int) (Math.floor(Math.random()
                                * (100 - (-100) + 1)) + (-100)));
                    }
                    for (int numeros : vectorB) {
                    }
                    //Imprime los vectores
                    for (int i = 0; i < vectorA.length; i++) {
                        cad2 += vectorB[i] + " ";
                    }
                    JOptionPane.showMessageDialog(null, "B: " + cad2);
                    break;
                case 3:
                    //SUMA DE VECTORES A+B=C
                    // System.out.println("La suma A+B=C: ");
                    for (int i = 0; i < vectorA.length; i++) {
                        vectorC[i] = vectorA[i] + vectorB[i];
                        cad3 += vectorC[i] + " ";
                    }
                    JOptionPane.showMessageDialog(null, "La suma A+B=C: \n" + "A: " + cad1 + "\nB: " + cad2 + "\nC: " + cad3);
                    break;
                case 4:
                    //RESTA DE VECTORES A+B=D
                    //System.out.println("La Resta de A-B=D: ");
                    for (int i = 0; i < vectorA.length; i++) {
                        vectorD[i] = vectorA[i] - vectorB[i];
                        cad4 += vectorD[i] + " ";
                    }
                    JOptionPane.showMessageDialog(null, "La resta A-B=D: \n" + "A: " + cad1 + "\nB: " + cad2 + "\nD: " + cad4);
                    break;
                case 5:
                    JOptionPane.showMessageDialog(null, "A: " + cad1 + "\nB: " + cad2 + "\nC: " + cad3 + "\nD: " + cad4);
                    break;
            }
        } while (op != 6);

    }
}
