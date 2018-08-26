import java.util.Scanner;

public class prueba {

private static Scanner teclado;

public static void main(String[] args){ 
	teclado = new Scanner(System.in);        
    System.out.print("Introduce un cero: ");
    int dato = teclado.nextInt();
    while (dato != 0) {
        System.out.print("No era cero. Introduce cero: ");
        dato = teclado.nextInt();
    }
    System.out.println("Terminado!");
    
}
}


