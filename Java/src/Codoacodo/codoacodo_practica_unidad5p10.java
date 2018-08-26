package Codoacodo;
//@author Jesus Arias
import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.swing.JOptionPane;
/*
10.- Realizar un programa que permita determinar los días de un mes a partir del ingreso
del mes. Utilizando una estructura Switch
*/
public class codoacodo_practica_unidad5p10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Calendar cal = new GregorianCalendar(2018, Calendar.MONTH, 1);
				// Create a calendar object of the desired month
				
				Calendar cal1 = new GregorianCalendar(2018, Calendar.JANUARY, 1);
				Calendar cal2 = new GregorianCalendar(2018, Calendar.FEBRUARY, 2);
				Calendar cal3 = new GregorianCalendar(2018, Calendar.MARCH, 3);
				Calendar cal4 = new GregorianCalendar(2018, Calendar.APRIL, 4);
				Calendar cal5 = new GregorianCalendar(2018, Calendar.MAY, 5);
				Calendar cal6 = new GregorianCalendar(2018, Calendar.JUNE, 6);
				Calendar cal7 = new GregorianCalendar(2018, Calendar.JULY, 7);
				Calendar cal8 = new GregorianCalendar(2018, Calendar.AUGUST, 8);
				Calendar cal9 = new GregorianCalendar(2018, Calendar.SEPTEMBER, 9);
				Calendar cal10 = new GregorianCalendar(2018, Calendar.OCTOBER, 10);
				Calendar cal11 = new GregorianCalendar(2018, Calendar.NOVEMBER, 11);
				Calendar cal12 = new GregorianCalendar(2018, Calendar.DECEMBER, 12);

				

				String opcion = JOptionPane.showInputDialog(null, "Ingrese un numero del 1 al 12", "",
						JOptionPane.PLAIN_MESSAGE);

				switch (opcion) {
				case "1":
					int dias1 = cal1.getActualMaximum(Calendar.DAY_OF_MONTH); // 28
					System.out.print("LA OPCION QUE USTED ELIGIO ES EL MES DE ENERO" + "\nY TIENE: " + dias1 + " DIAS");
					JOptionPane.showMessageDialog(null, "ENERO " + "\nTIENE: " + dias1 + " DIAS",
							"La opción " + opcion + " es:", JOptionPane.PLAIN_MESSAGE);

					break;
				case "2":
					int dias2 = cal2.getActualMaximum(Calendar.DAY_OF_MONTH); // 28
					System.out.print("LA OPCION QUE USTED ELIGIO ES EL MES DE ENERO" + "\nY TIENE: " + dias2 + " DIAS");
					JOptionPane.showMessageDialog(null, "ENERO " + "\nTIENE: " + dias2 + " DIAS",
							"La opción " + opcion + " es:", JOptionPane.PLAIN_MESSAGE);
					break;

				case "3":
					int dias3 = cal3.getActualMaximum(Calendar.DAY_OF_MONTH); // 28
					System.out.print("LA OPCION QUE USTED ELIGIO ES EL MES DE ENERO" + "\nY TIENE: " + dias3 + " DIAS");
					JOptionPane.showMessageDialog(null, "ENERO " + "\nTIENE: " + dias3 + " DIAS",
							"La opción " + opcion + " es:", JOptionPane.PLAIN_MESSAGE);

				case "4":
					int dias4 = cal4.getActualMaximum(Calendar.DAY_OF_MONTH); // 28
					System.out.print("LA OPCION QUE USTED ELIGIO ES EL MES DE ENERO" + "\nY TIENE: " + dias4 + " DIAS");
					JOptionPane.showMessageDialog(null, "ENERO " + "\nTIENE: " + dias4 + " DIAS",
							"La opción " + opcion + " es:", JOptionPane.PLAIN_MESSAGE);
					break;
				case "5":
					int dias5 = cal5.getActualMaximum(Calendar.DAY_OF_MONTH); // 28
					System.out.print("LA OPCION QUE USTED ELIGIO ES EL MES DE ENERO" + "\nY TIENE: " + dias5 + " DIAS");
					JOptionPane.showMessageDialog(null, "ENERO " + "\nTIENE: " + dias5 + " DIAS",
							"La opción " + opcion + " es:", JOptionPane.PLAIN_MESSAGE);
					break;
				case "6":
					int dias6 = cal6.getActualMaximum(Calendar.DAY_OF_MONTH); // 28
					System.out.print("LA OPCION QUE USTED ELIGIO ES EL MES DE ENERO" + "\nY TIENE: " + dias6 + " DIAS");
					JOptionPane.showMessageDialog(null, "ENERO " + "\nTIENE: " + dias6 + " DIAS",
							"La opción " + opcion + " es:", JOptionPane.PLAIN_MESSAGE);
					break;
				case "7":
					int dias7 = cal7.getActualMaximum(Calendar.DAY_OF_MONTH); // 28
					System.out.print("LA OPCION QUE USTED ELIGIO ES EL MES DE ENERO" + "\nY TIENE: " + dias7 + " DIAS");
					JOptionPane.showMessageDialog(null, "ENERO " + "\nTIENE: " + dias7 + " DIAS",
							"La opción " + opcion + " es:", JOptionPane.PLAIN_MESSAGE);
					break;
				case "8":
					int dias8 = cal8.getActualMaximum(Calendar.DAY_OF_MONTH); // 28
					System.out.print("LA OPCION QUE USTED ELIGIO ES EL MES DE ENERO" + "\nY TIENE: " + dias8 + " DIAS");
					JOptionPane.showMessageDialog(null, "ENERO " + "\nTIENE: " + dias8 + " DIAS",
							"La opción " + opcion + " es:", JOptionPane.PLAIN_MESSAGE);
					break;
				case "9":
					int dias9 = cal9.getActualMaximum(Calendar.DAY_OF_MONTH); // 28
					System.out.print("LA OPCION QUE USTED ELIGIO ES EL MES DE ENERO" + "\nY TIENE: " + dias9 + " DIAS");
					JOptionPane.showMessageDialog(null, "ENERO " + "\nTIENE: " + dias9 + " DIAS",
							"La opción " + opcion + " es:", JOptionPane.PLAIN_MESSAGE);
					break;
				case "10":
					int dias10 = cal10.getActualMaximum(Calendar.DAY_OF_MONTH); // 28
					System.out.print("LA OPCION QUE USTED ELIGIO ES EL MES DE ENERO" + "\nY TIENE: " + dias10 + " DIAS");
					JOptionPane.showMessageDialog(null, "ENERO " + "\nTIENE: " + dias10 + " DIAS",
							"La opción " + opcion + " es:", JOptionPane.PLAIN_MESSAGE);
					break;
				case "11":
					int dias11 = cal11.getActualMaximum(Calendar.DAY_OF_MONTH); // 28
					System.out.print("LA OPCION QUE USTED ELIGIO ES EL MES DE ENERO" + "\nY TIENE: " + dias11 + " DIAS");
					JOptionPane.showMessageDialog(null, "ENERO " + "\nTIENE: " + dias11 + " DIAS",
							"La opción " + opcion + " es:", JOptionPane.PLAIN_MESSAGE);
					break;
				case "12":
					int dias12 = cal12.getActualMaximum(Calendar.DAY_OF_MONTH); // 28
					System.out.print("LA OPCION QUE USTED ELIGIO ES EL MES DE ENERO" + "\nY TIENE: " + dias12 + " DIAS");
					JOptionPane.showMessageDialog(null, "ENERO " + "\nTIENE: " + dias12 + " DIAS",
							"La opción " + opcion + " es:", JOptionPane.PLAIN_MESSAGE);
					break;
				default:
					System.err.println("Error!" + "\nLa opción no es correcta!!!");
					JOptionPane.showMessageDialog(null, "Numero incorrecto", "ERROR", JOptionPane.ERROR_MESSAGE);

				}
	}

}
