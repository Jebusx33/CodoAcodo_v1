import java.util.*;
import javax.swing.*;

public class Areas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner entrada=new Scanner(System.in);
	System.out.println("Elije una opcion: \n1: Cuadrado \n2: Rectangulo \n3: Triangulo \n4: Circulo");// \n es un salto de linea
		
		int figura=entrada.nextInt();
		switch(figura){
		case 1:
		int lado=Integer.parseInt(JOptionPane.showInputDialog("Introduce el lado")); //comberti un string a int en una sola linea
		
		System.out.println("El area de l cuadrado es " + Math.pow(lado, 2) );
		break;// se usat para terminas una opcion en un switch
		case 2:
			int base=Integer.parseInt(JOptionPane.showInputDialog("Introdice la base"));
			int altura=Integer.parseInt(JOptionPane.showInputDialog("Introduce la altura "));
			System.out.println("La base del Rectangulo es" + base*altura);
			break;
		case 3:
			base=Integer.parseInt(JOptionPane.showInputDialog("Introdice la base"));
			altura=Integer.parseInt(JOptionPane.showInputDialog("Introdice la altura"));
			System.out.println("El area del triangulo es: " + (base*altura)/2);
		break;
		case 4:
			int radio=Integer.parseInt(JOptionPane.showInputDialog("Introdice el radio"));
			System.out.print("El area del circulo es: "  );
			System.out.printf("%1.2f", Math.PI*(Math.pow(radio, 2)));//pi*radio^2 = pow es para usar exponente
			break;	
			default:
			System.out.println("La opcion no es correcta");
		
		}
		
		
		
	}

}
