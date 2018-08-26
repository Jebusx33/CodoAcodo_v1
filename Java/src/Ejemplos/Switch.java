package Ejemplos;



public class Switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char letra; // almacena letras y numeros como simbolos
		
		letra = 'b';

		switch (letra) {
		case 'b':
			System.out.println("El valor es b");
			break;
		case 'a':
			System.out.println("El valor es a");
			break;
		case '2':
			System.out.println("El valor es 2");
			break;
		case '%':
			System.out.println("El valor es %");
			break;
			default:
				System.out.println("El valor no esta en los case");
		}
	}
}
