package Codoacodo;
import java.util.Scanner;

/*
 9. Crear un programa que muestre en pantalla una escalera de asteriscos. La cantidad
de filas de la escalera se ingresa por teclado.(usar la instrucción while)
Ejemplo:
Cantidad de filas=5
*
**
***
****
*****

 */
public class unidad3act2ej9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.println("ingresar el numero de escalones para formar una escalera");
		int i = 0, asteriscos = scan.nextInt();

		while (i < asteriscos) {
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println("");
			i++;
		}

	}

}
