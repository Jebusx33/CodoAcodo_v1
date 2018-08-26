import java.util.Calendar;
import java.util.GregorianCalendar;

import javax.swing.JOptionPane;

public class algoritmos_1_utn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Ejercicio1
		/*
		 * Dados dos valores num�ricos enteros a y b, calcular e informar la
		 * suma: a+b, la diferencia: a-b, y el producto: a*b entre dichos
		 * valores.
		 */
		System.out.println("Ejercicio1");
		String a0 = JOptionPane.showInputDialog("Introduce el valor de A");
		String b0 = JOptionPane.showInputDialog("Introduce el valor de B");

		// convertir String a numerico
		int a1 = Integer.parseInt(a0);
		int b1 = Integer.parseInt(b0);

		System.out.println("Los valores ingresados son: " + "a=" + (a1) + ", b=" + (b1));
		System.out.println("La suma de a y b es: " + (a1 + b1));
		System.out.println("La resta de a y b es: " + (a1 - b1));
		System.out.println("La multiplicacion de a y b es: " + (a1 * b1));
		System.out.println("La divicion de a y b es: " + (a1 / b1));

		// Ejercicio2
		/*
		 * Dados dos valores num�ricos enteros a y b calcular e informar el
		 * cosiente a/b. Considere que b puede ser cero. En ese caso mostrar el
		 * correspondiente mensaje de error.
		 */
		System.out.println("Ejercicio2");
		System.out.println("Los valores ingresados son: " + "a=" + (a1) + ", b=" + (b1));
		if (a1 / b1 == 0) {
			System.out.println("error");
		} else {
			System.out.println("correcto");
		}

		// Ejercicio3
		/*
		 * Dado valor num�rico entero que se ingresa por teclado, se pide
		 * informar: La quinta parte de dicho valor, el resto de la divisi�n por
		 * 5 y la s�ptima parte de la quinta parte.
		 */
		System.out.println("Ejercicio3 ");

		String valor = JOptionPane.showInputDialog("Ingrese un valor");
		double numero = Double.parseDouble(valor);
		System.out.println("El valor ingresado es:" + (numero));
		System.out.println("La quinta parte del numero ingresado es " + (numero / 5));
		System.out.println("El resto de dividir al numero ingresado  por 5 es " + (numero % 5));
		System.out.println("la septima parte de la quinta del numero ingresado es " + "%1.2f" + ((numero / 5) / 7));

		// Ejercicio4 y 5
		/*
		 * Dados dos valores num�ricos diferentes entre s�, informar cual es el
		 * mayor. Dados dos valores num�ricos, informar cual es el mayor y cual
		 * es el menor o, si ambos valores son iguales emitir un mensaje.
		 */
		System.out.println("Ejercicio4 y 5 ");

		String a2 = JOptionPane.showInputDialog("Introduce el valor de A1");
		String b2 = JOptionPane.showInputDialog("Introduce el valor de B1");

		// convertir String a numerico
		int a3 = Integer.parseInt(a2);
		int b3 = Integer.parseInt(b2);
		System.out.println("Los valores ingresados son: " + "a=" + (a3) + ", b=" + (b3));

		if (a3 > b3) {
			System.out.println("A1 es mayor que B1 ");

		}
		if (a3 == b3) {
			System.out.println("A1 es igual a B1");
		} else {
			System.out.println("A1 es menor que B1");
		}
		// Ejercicio6
		/*
		 * Dados tres valores num�ricos diferentes, indicar cual es el menor,
		 * cual est� en el medio y cual es el mayor.
		 */
		System.out.println("Ejercicio6 ");

		String a4 = JOptionPane.showInputDialog("Introduce el valor de A2");
		String b4 = JOptionPane.showInputDialog("Introduce el valor de B2");
		String c4 = JOptionPane.showInputDialog("Introduce el valor de C2");

		// convertir String a numerico
		int a5 = Integer.parseInt(a4);
		int b5 = Integer.parseInt(b4);
		int c5 = Integer.parseInt(c4);

		System.out.println("Los valores ingresados son: " + "a=" + (a5) + ", b=" + (b5) + ", c=" + (c5));

		int mayor;
		int menor;
		int medio;

		if (a5 > b5 && a5 > c5) {
			mayor = a5;
		} else if (b5 > a5 && b5 > c5) {
			mayor = b5;
		} else {
			mayor = c5;
		}
		if (a5 < b5 && a5 < c5) {
			menor = a5;
		} else if (b5 < a5 && b5 < c5) {
			menor = b5;
		} else {
			menor = c5;
		}
		medio = ((a5 + b5 + c5) - (mayor + menor));
		System.out.println(menor + ", " + medio + ", " + mayor);

		// Ejercicio7
		/*
		 * Dada una terna de n�meros naturales que representan el d�a, el mes y
		 * el a�o de una determinada fecha in- formarla como un solo n�mero
		 * natural de 8 d�gitos (aaaammdd).
		 */
		System.out.println("Ejercicio7");
		String dia0 = JOptionPane.showInputDialog("Ingrese el dia");
		String mes0 = JOptionPane.showInputDialog("Ingrese el mes");
		String anio0 = JOptionPane.showInputDialog("ingrese el a�o");

		int dia1 = Integer.parseInt(dia0);
		int mes1 = Integer.parseInt(mes0);
		int anio1 = Integer.parseInt(anio0);
		// falta diferencias de n> o> y si ni es l FECHA INDICAR ERROR
		System.out.println("La fecha ingresada es: " + dia1 + mes1 + anio1);

		// Ejercicio 8
		/*
		 * Dado un n�mero de 8 d�gitos que representa una fecha con formato
		 * aaaammdd, se pide mostrar por separado el d�a, el mes y el a�o de la
		 * ingresada.
		 */
		System.out.println("Ejercicio8");
		String fecha = JOptionPane.showInputDialog("Ingrese la fecha con el siguiente formato ddmmaa");
		System.out.println("La Fecha ingresada es:  " + fecha.charAt(0) + fecha.charAt(1) + "/" + fecha.charAt(2)
				+ fecha.charAt(3) + "/" + fecha.charAt(4) + fecha.charAt(5));

		// Ejercicio9
		/*
		 * Dadas dos fechas, informar cual es la m�s cercana a la fecha del
		 * proceso (es decir, al d�a de hoy). Determinar cuales deben ser los
		 * datos de entrada y en que formato los debe ingresar el usuario. Nota:
		 * considere que las fechas ingresadas pueden ser anteriores,
		 * posteriores o bien una podr�a ser anterior y la otra posterior a la
		 * fecha de actual.
		 */
		System.out.println("Ejercicio9");
		// en fecha obtenemos la fecha y hora del sistema
		Calendar fecha2 = new GregorianCalendar();

		int anio = fecha2.get(Calendar.YEAR);
		int mes = fecha2.get(Calendar.MONTH);
		int dia = fecha2.get(Calendar.DAY_OF_MONTH);
		// System.out.println("Fecha Actual: " + dia + "/" + (mes+1) + "/" +
		// a�o);
/*
		String dia = JOptionPane.showInputDialog("Ingrese el dia");
		String mes0 = JOptionPane.showInputDialog("Ingrese el mes");
		String anio0 = JOptionPane.showInputDialog("ingrese el a�o");

		int dia1 = Integer.parseInt(dia0);
		int mes1 = Integer.parseInt(mes0);
		int anio1 = Integer.parseInt(anio0);
*/
	}

}
