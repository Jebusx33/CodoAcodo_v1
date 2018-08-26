import javax.swing.*;
public class entrada_numeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String num1=JOptionPane.showInputDialog("introduce el numero");
double num2=Double.parseDouble(num1);
System.out.print("La raiz de " + num2 + " es: ");
//printf es para imprimir CON FORMATO EJ: los decimales cortos de %1.2F
System.out.printf("%1.2f" , Math.sqrt(num2));
	}

}
