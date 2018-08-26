package Codoacodo;
//@author Jesus Arias
import javax.swing.JOptionPane;
/*
  3.- “La langosta ahumada” es una empresa dedicada a ofrecer banquetes;
  sus tarifas son las siguientes: el costo de platillo por persona es de
  $95.00, pero si el número de personas es mayor a 200 pero menor o igual a
  300, el costo es de $85.00. Para más de 300 personas el costo por
  platillo es de $75.00. Realizar un programa que ayude a determinar el
  presupuesto que se le debe presentar a los clientes. La cantidad de
  comensales se ingresa por teclado.
 */
public class codoacodo_practica_unidad5p3 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int platos200 = 200;
		int platos300 = 300;

		int personas = Integer.parseInt(JOptionPane.showInputDialog("Introduce la cantidad de personas"));

		System.out.println("La cantidad de personas ingresados son:  " + personas);

		if (personas < platos200) {
			System.out.println("El valor por platos es: $95.00 ");
		} else if (personas <= platos300) {
			System.out.println("El valor por platos es: $85.00 ");
		}

		else {
			System.out.println("El valor por platos es: $75.00 ");
		}

	}

}
