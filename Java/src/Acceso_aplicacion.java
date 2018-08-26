import javax.swing.*;

public class Acceso_aplicacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String clave="123456";
String pass="";

while(clave.equals(pass)==false){
	pass=JOptionPane.showInputDialog("Introduca la contraseña"); //repite el bucle While o mientras si la condicion es verdadera
	if(clave.equals(pass)==false){
		System.out.println("Error");
	}
	
}
System.out.println("Bienvenido");

	}

}
