import javax.swing.JOptionPane;

public class Factorial_usando_FOR {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int resultado=1; //si el resultado da Negativo hay que cambiar el tipo de variable a ej a long
		//Long resultado=1L // a log se le aplica l al final 
		int numero=Integer.parseInt(JOptionPane.showInputDialog("introdce un numero"));
		for(int i = numero;i>0;i--){
			resultado=resultado*i;
		}
				System.out.println("el factorial de "+ numero + " es " + resultado);
		
	}

}
