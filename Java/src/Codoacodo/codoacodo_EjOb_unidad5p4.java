package Codoacodo;

import java.util.Scanner;

/*
 4. En un colegio existe la posibilidad de elegir, en la materia "lengua extranjera", entre
las siguientes opciones: [I]nglés, [F]rancés, [P]ortugués y [A]lemán. Se ingresa, para
cada alumno, la lengua elegida. La computadora muestra el porcentaje de alumnos
que eligió cada lengua, en forma de número y en forma gráfica (histograma),
utilizando líneas hechas con asteriscos.
 */
public class codoacodo_EjOb_unidad5p4 {
	private static Scanner entrada;
	private static Scanner lec;
	private static Scanner scan;
	private static String seguir;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		{
			int opcion, contadorGeneral = 0, contadorIngles = 0, contadorFrances = 0, contadorPortugues = 0,
					contadorAleman = 0;
			setSeguir("s");
			setEntrada(new Scanner(System.in));
			System.out.println(
					"ingrese la opcion del idioma segun corresponda al alumno \n [I]nglés\n[F]rancés\n[P]ortugués\n[A]lemán\n 0- finalizar ingreso");
			lec = null;
		opcion = entrada.nextInt();
			//opcion=lec.next().charAt(0);

			while (opcion != 0) {
				contadorGeneral++;
				switch (opcion) {
				case 'I': {
					contadorIngles++;
					break;
				}
				case 'F': {
					contadorFrances++;
					break;
				}
				case 'P': {
					contadorPortugues++;
					break;
				}
				case 'A': {
					contadorAleman++;
					break;
				}
				default: {
					System.out.println("la opcion ingresada no es la correcta");
				}

				}

				  System.out.println("desea seguir agregando alumnos a las materias \n s- para continuar \n n- para finalizar");
			         scan = null;
					setSeguir(scan.next());
			}

			System.out.println("del total de alumnos incriptos hubo un ");
			System.out.print("\n en Ingles    " + (contadorIngles * 100 / contadorGeneral) + "%        ");
			for (int i = 0; i < contadorIngles; i++) {
				System.out.print("*");
			}
			System.out.print("\n en Frances   " + (contadorFrances * 100 / contadorGeneral) + "%        ");
			for (int i = 0; i < contadorFrances; i++) {
				System.out.print("*");
			}
			System.out.print("\n en Portugues " + (contadorPortugues * 100 / contadorGeneral) + "%        ");
			for (int i = 0; i < contadorPortugues; i++) {
				System.out.print("*");
			}
			System.out.print("\n en Aleman    " + (contadorAleman * 100 / contadorGeneral) + "%        ");
			for (int i = 0; i < contadorAleman; i++) {
				System.out.print("*");
			}

		}

	}
	public static Scanner getEntrada() {
		return entrada;
	}
	public static void setEntrada(Scanner entrada) {
		codoacodo_EjOb_unidad5p4.entrada = entrada;
	}
	public static String getSeguir() {
		return seguir;
	}
	public static void setSeguir(String seguir) {
		codoacodo_EjOb_unidad5p4.seguir = seguir;
	}

}
