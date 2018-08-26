package Ejemplos;

import java.util.Scanner;

public class for_ejemplo {

	private static Scanner s;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int a,b;
		s = new Scanner(System.in);
		 System.out.println("introduce un numero menor: ");
		 a= s.nextInt();
		 System.out.println("introduce un numero mayor: ");
		 b= s.nextInt();
	
		for( int i = a; i<b; i++)
		{
			System.out.println(i+"");
		}
		
		
	}

}
