package Codoacodo;

//@author Jesus Arias
import java.util.Scanner;

/*
 6.Para los 10 empleados de una empresa debemos ingresar, por teclado, los
siguientes datos:
nombre
apellido
cantidad de horas trabajadas
Además debemos cargar
El valor de la hora trabajada:
La cantidad mínima de horas trabajadas
Calcular:
El valor de la hora extra: el valor de la hora trabajada incrementado en un 50
por ciento.
La cantidad de horas extras del empleado (Cantidad de horas trabajadas - Cantidad
mínima de horas trabajadas)
El sueldo del empleado (horas trabajadas * cantidad de horas mínimas) + (horas
extras * valor hora extra)
Cantidad total a abonar de sueldos.
 */
public class codoacodo_EjOb_unidad5p6 {

	private static int canthorasextra;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nombre, apellido;
		int horastrabajadas, horasmin, valorporhora, sueldoempleado;
		double horasextras;

		for (int i = 0; i < 10; i++) {
			System.out.println("Ingresar el nombre del empleado");
			nombre = new Scanner(System.in).next();
			System.out.println("Ingresar el apellido del empleado");
			apellido = new Scanner(System.in).next();
			System.out.println("Ingresar la cantidad de horas trabajadas");
			horastrabajadas = new Scanner(System.in).nextInt();
			System.out.println("Ingresar las horas minimas que trabajo");
			horasmin = new Scanner(System.in).nextInt();
			System.out.println("Ingresar el valor por hora");
			valorporhora = new Scanner(System.in).nextInt();

			horasextras = horastrabajadas * 0.50;
			setCanthorasextra(horastrabajadas - horasmin);
			sueldoempleado = (int) ((horastrabajadas * horasmin) + (horasextras * valorporhora));

			System.out.println(nombre + " " + apellido + " debe cobrar: $" + sueldoempleado);

		}
	}

	public static int getCanthorasextra() {
		return canthorasextra;
	}

	public static void setCanthorasextra(int canthorasextra) {
		codoacodo_EjOb_unidad5p6.canthorasextra = canthorasextra;
	}

}
