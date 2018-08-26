package Codoacodo;

import java.util.Scanner;

public class arreglo_unidimensional {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        System.out.println("Ingrese el tamaño del vector");
        String T = new Scanner(System.in).next();

        int n = 0;
        n = Integer.parseInt(T);

        int vec1[] = new int[n];
        int vec2[] = new int[n];
        int vec3[] = new int[n];
        //JFrame ventana=new JFrame();
        //lleno la matriz
        for (int i = 0; i < vec1.length; i++) {

            System.out.println("Digita el valor para vector A" + "[" + i + "]");
            String val = new Scanner(System.in).next();
            int vec = 0;
            vec1[i] = Integer.parseInt(val);
        }
        for (int i = 0; i < vec2.length; i++) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Digita el valor para vector B" + "[" + i + "]");
            vec2[i] = scan.nextInt();
        }
        //Imprime los vectores
        String cad1 = "", cad2 = "", cad3 = "";
        for (int i = 0; i < vec1.length; i++) {
            cad1 += vec1[i] + " ";
            cad2 += vec2[i] + " ";
        }
        System.out.println("vector A: " + cad1);
        System.out.println("vector B: " + cad2);

    }

}
