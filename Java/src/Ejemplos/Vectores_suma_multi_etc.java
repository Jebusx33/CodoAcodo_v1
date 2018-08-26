package Ejemplos;

import javax.swing.JOptionPane;

public class Vectores_suma_multi_etc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int vec1[]=new int[10];
        int vec2[]=new int[10];
        int vec3[]=new int[10];
        
        int op=0;
        String menu="***** Menú operaciones de vectores *****\n";
        menu+="1.- Llenar vectores\n";
        menu+="2.- Suma de vectores\n";
        menu+="3.- Resta de vectores\n";
        menu+="4.- Multiplicación de vectores\n";
        menu+="5.- Salir\n";
        menu+="Digita una opción";
        do{
            op=Integer.parseInt(JOptionPane.showInputDialog(menu));
            switch (op){
                case 1:
                    for(int i=0;i<vec1.length;i++){
                        vec1[i]=Integer.parseInt(JOptionPane.showInputDialog("Digita el valor para vec1"+"["+i+"]"));
                    }
                    for(int i=0;i<vec2.length;i++){
                        vec2[i]=Integer.parseInt(JOptionPane.showInputDialog("Digita el valor para vec2"+"["+i+"]"));
                    }
                    //Imprime los vectores
                    String cad1="", cad2="";
                    for(int i=0;i<vec1.length;i++){
                        cad1+=vec1[i]+" ";
                        cad2+=vec2[i]+" ";
                    }
                    System.out.println("vec1: "+cad1);
                    System.out.println("vec2: "+cad2);
                    break;
                case 2:
                    //Suma de vectores
                    System.out.println("La suma es de: ");
                    for(int i=0;i<vec1.length;i++){
                        vec3[i]=vec1[i]+vec2[i];
                        System.out.print(vec3[i]+" ");
                    }
                    System.out.println();
                    break;
                case 3:
                    //Resta de vectores
                    System.out.println("La resta es de: ");
                    for(int i=0;i<vec1.length;i++){
                        vec3[i]=vec1[i]-vec2[i];
                        System.out.print(vec3[i]+" ");
                    }
                    System.out.println();
                    break;
                case 4:
                    //Multiplicación de vectores
                    System.out.println("La multiplicación es de: ");
                    for(int i=0;i<vec1.length;i++){
                        vec3[i]=vec1[i]*vec2[vec2.length-(i+1)];
                        System.out.print(vec3[i]+" ");
                    }
                    System.out.println();
                    break;
            }
        }while(op!=5);
	}

}
