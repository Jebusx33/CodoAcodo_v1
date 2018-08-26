import java.util.*;
public class While_adivina_numero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//quiero que genere un numero de o a 100
		
		
		
		
		
		
		int aleatorio=(int)(Math.random()*100);
		//System.out.println(aleatorio);
		Scanner entrada=new Scanner(System.in);
		int numero=0;
		int intentos=0;
		while(numero!=aleatorio){
			intentos++;
			System.out.println("introduce un numero");
			numero=entrada.nextInt();
			if(aleatorio<numero){
				System.out.println("Má bajo");
			}
			else if(aleatorio>numero){
				System.out.println("Mäs alto");
				
			}
			}
		System.out.println("Correcto!!!" + " en " +intentos+ " intentos." );
	}

}
