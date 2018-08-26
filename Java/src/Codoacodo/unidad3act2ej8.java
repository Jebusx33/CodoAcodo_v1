package Codoacodo;
import java.util.Scanner;

public class unidad3act2ej8 {
/*
 8. Crear un programa que muestre en pantalla una escalera inversa de asteriscos. La
cantidad de filas de la escalera se ingresa por teclado.(usar la instrucción for)
Ejemplo:
Cantidad de filas=5
*****
****
***
**
*

 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
     @SuppressWarnings("resource")
	Scanner scan = new Scanner(System.in);
     System.out.println("ingresar el numero de escalones para formar una escalera");
     int asteriscos=scan.nextInt();
     
		for(int i=asteriscos;i>0;i--)
		{for(int j=0;j<i;j++){
            System.out.print("*");
        }
			
			System.out.println("");
		}
		
		
		
	}

	@SuppressWarnings("unused")
	private static int asteriscos(boolean b, int i) {
		// TODO Auto-generated method stub
		return 0;
	}

}
