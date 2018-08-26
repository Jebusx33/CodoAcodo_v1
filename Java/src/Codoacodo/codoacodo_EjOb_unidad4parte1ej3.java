package Codoacodo;

/*
 3.- Se ingresan 5 números pertenecientes al arreglo A y otros 5 números pertenecientes al arreglo B. La
computadora muestra un arreglo C, donde cada posición es el resultado de la suma del número en la
misma posición en el arreglo A con el número en la misma posición en el arreglo B.
Ejemplo: Se ingresa 1 2 3 4 5 y 4 7 1 3 6 la computadora muestra 5 9 4 7 11.
(Usar la clase JOptionPane tanto para cargar datos como para mostrar mensajes y resultados)
NOTA: este ejercicio ya se hizo pero sin JOptionPane.
 */
import javax.swing.JOptionPane;

public class codoacodo_EjOb_unidad4parte1ej3 {

	public static void main(String[] args) {
	int vec1[]=new int[5];
        int vec2[]=new int[5];
        int vec3[]=new int[5];
        //JFrame ventana=new JFrame();
		//lleno la matriz
        for(int i=0;i<vec1.length;i++){
            vec1[i]=Integer.parseInt(JOptionPane.showInputDialog("Digita el valor para vector A"+"["+i+"]"));
        }
        for(int i=0;i<vec2.length;i++){
            vec2[i]=Integer.parseInt(JOptionPane.showInputDialog("Digita el valor para vector B"+"["+i+"]"));
        }
        //Imprime los vectores
        String cad1="", cad2="", cad3="";
        for(int i=0;i<vec1.length;i++){
            cad1+=vec1[i]+" ";
            cad2+=vec2[i]+" ";    
        }
       // System.out.println("vector A: "+cad1);
       // System.out.println("vector B: "+cad2);
        JOptionPane.showMessageDialog(null, cad1+"\n"+cad2,"Los vectores que se van a sumar son:", JOptionPane.INFORMATION_MESSAGE );
        
      //Suma de vectores
        System.out.println("La suma es de: ");
        for(int i=0;i<vec1.length;i++){
            vec3[i]=vec1[i]+vec2[i];
            // System.out.print(vec3[i]+" ");
        
            //Imprimir matriz
            cad3+=vec3[i]+" ";
        }
            JOptionPane.showMessageDialog(null,cad1+"\n"+cad2  +"\n"+  cad3 ,"Suma de vectores", JOptionPane.INFORMATION_MESSAGE);
       
        }
       
	}
