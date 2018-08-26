import java.util.Scanner;
public class Do_While {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//quiero que genere un numero de o a 100


		
		
		
		
		int aleatorio=(int)(Math.random()*100);
		//System.out.println(aleatorio);
		Scanner entrada=new Scanner(System.in);
		int numero=0;
		int intentos=0;
		do{
			intentos++;
			System.out.println("introduce un numero");
			numero=entrada.nextInt();
			if(aleatorio<numero){
				System.out.println("Má bajo");
			}
			else if(aleatorio>numero){
				System.out.println("Mäs alto");
				
			}
			}while(numero!=aleatorio);
		System.out.println("Correcto!!!" + " en " +intentos+ " intentos." );
	}

}
