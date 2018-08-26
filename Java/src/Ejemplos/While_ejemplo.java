package Ejemplos;
import java.util.Scanner;
//muestra los numeros que hay entre los 2 que vos elejis 
public class While_ejemplo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a,b, i;
		 Scanner s =new Scanner(System.in);
		 System.out.println("introduce un numero menor: ");
		 a= s.nextInt();
		 System.out.println("introduce un numero mayor: ");
		 b= s.nextInt();
		
		i=a;
		while(i<b){
			System.out.println(i+"");
			i++; //i += mas 1 y i--  es i-= menos1
		}
		
	}

}
