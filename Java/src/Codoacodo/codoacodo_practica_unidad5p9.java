package Codoacodo;
//@author Jesus Arias
import javax.swing.JOptionPane;

/*
9.- Escriba un programa que pida al usuario un n�mero entre 1 y 12. La computadora
muestra por pantalla el mes al que pertenece tal n�mero. Si se ingresa un n�mero fuera de
rango, mostrar un error.
*/
public class codoacodo_practica_unidad5p9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		String opcion = JOptionPane.showInputDialog(null,"Ingrese un numero del 1 al 12", "",JOptionPane.PLAIN_MESSAGE);

		switch (opcion) {
		case "1":
			System.out.print("LA OPCION QUE USTED ELIGIO ES EL MES DE ENERO");
			JOptionPane.showMessageDialog(null,"ENERO", "La opci�n "+opcion+ " es:", JOptionPane.PLAIN_MESSAGE);
			
			break;
		case "2":
			System.out.print("LA OPCION QUE USTED ELIGIO ES EL MES DE FEBRERO");
			JOptionPane.showMessageDialog(null,"FEBRERO", "La opci�n "+opcion+ " es:", JOptionPane.PLAIN_MESSAGE);
			break;

		case "3":
			System.out.print("LA OPCION QUE USTED ELIGIO ES EL MES DE MARZO");
			JOptionPane.showMessageDialog(null,"MARZO", "La opci�n "+opcion+ " es:", JOptionPane.PLAIN_MESSAGE);
			break;
		case "4":
			System.out.print("LA OPCION QUE USTED ELIGIO ES EL MES DE ABRIL");
			JOptionPane.showMessageDialog(null,"ABRIL", "La opci�n "+opcion+ " es:", JOptionPane.PLAIN_MESSAGE);
			break;
		case "5":
			System.out.print("LA OPCION QUE USTED ELIGIO ES EL MES DE MAYO");
			JOptionPane.showMessageDialog(null,"MAYO", "La opci�n "+opcion+ " es:", JOptionPane.PLAIN_MESSAGE);
			break;
		case "6":
			System.out.print("LA OPCION QUE USTED ELIGIO ES EL MES DE JUNIO");
			JOptionPane.showMessageDialog(null,"JUNIO", "La opci�n "+opcion+ " es:", JOptionPane.PLAIN_MESSAGE);
			break;
		case "7":
			System.out.print("LA OPCION QUE USTED ELIGIO ES EL MES DE JULIO");
			JOptionPane.showMessageDialog(null,"JULIO", "La opci�n "+opcion+ " es:", JOptionPane.PLAIN_MESSAGE);
			break;
		case "8":
			System.out.print("LA OPCION QUE USTED ELIGIO ES EL MES DE AGOSTO");
			JOptionPane.showMessageDialog(null,"AGOSTO", "La opci�n "+opcion+ " es:", JOptionPane.PLAIN_MESSAGE);
			break;
		case "9":
			System.out.print("LA OPCION QUE USTED ELIGIO ES EL MES DE SEPTIEMBRE");
			JOptionPane.showMessageDialog(null,"SEPTIEMBRE", "La opci�n "+opcion+ " es:", JOptionPane.PLAIN_MESSAGE);
			break;
		case "10":
			System.out.print("LA OPCION QUE USTED ELIGIO ES EL MES DE OCTUBRE");
			JOptionPane.showMessageDialog(null,"OCTUBRE", "La opci�n "+opcion+ " es:", JOptionPane.PLAIN_MESSAGE);
			break;
		case "11":
			System.out.print("LA OPCION QUE USTED ELIGIO ES EL MES DE NOVIEMBRE");
			JOptionPane.showMessageDialog(null,"NOVIEMbRE", "La opci�n "+opcion+ " es:", JOptionPane.PLAIN_MESSAGE);
			break;
		case "12":
			System.out.print("LA OPCION QUE USTED ELIGIO ES EL MES DE DICIEMBRE");
			JOptionPane.showMessageDialog(null,"DICIEMBRE", "La opci�n "+opcion+ " es:", JOptionPane.PLAIN_MESSAGE);
			break;
		default:
			System.err.println("Error!"+"\nLa opci�n no es correcta!!!");
			JOptionPane.showMessageDialog(null, "Numero incorrecto", "ERROR", JOptionPane.ERROR_MESSAGE);

		}
		
		

	}

}
