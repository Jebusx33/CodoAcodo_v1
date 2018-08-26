import javax.swing.*;
public class entrada2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String Nombre_usuario=JOptionPane.showInputDialog("introduce el nombre");

//ShowImputDialog es String. por lo tanto los numeros lo pasa como caracteres
String edad=JOptionPane.showInputDialog("introduce la edad");

System.out.println("Hola " + Nombre_usuario + " Tienes " + edad + " años");

//convertir String a numerico
int edad_usuario=Integer.parseInt(edad);
System.out.println("Hola " + Nombre_usuario + " el año que viene tendras " + (edad_usuario+1) + " años");



	}

}
