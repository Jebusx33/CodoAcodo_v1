import javax.swing.JOptionPane;

public class Ejercicio_video_7_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*Crea una clase con el nombre de Ejercicio_2. Declara e inicia las siguientes variables y constantes
		que aparecen en la siguiente tabla:
    	Nombre Variable/Constante Tipo de datos Valor de la variable
		dolar(constante)            Decimal   1,137
		salario(constante)          Decimal   2125,70
		salario_en_dolar (variable) Decimal
		nombre(variable)            Texto     “Manuel”
	
	*/
	
	
	
		
		String nombre=JOptionPane.showInputDialog("");
	    double dolar=1.137;
		double salario=2125.70;
		
		double salario_en_dolar=dolar*salario;
		
		System.out.println("El salario en dolar de " + nombre + " es " + salario_en_dolar);
		
		
		
	}

}
