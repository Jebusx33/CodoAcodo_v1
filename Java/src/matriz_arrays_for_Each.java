import javax.swing.JOptionPane;

public class matriz_arrays_for_Each {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String [] paises=new String [8];
				
		paises[0]=" ARGENTINA";
		paises[1]=" ESPAÑA";
		paises[2]=" MEXICO";
		paises[3]=" VENEZUELA";
		paises[4]=" COLOMBIA";
		paises[5]=" ECUADOR";
		paises[6]=" PERU";
		paises[7]=" FRANCIA";
		
		for(int i=0;i<paises.length;i++)
		{
			System.out.println("pais " + (i+1)+ paises[i]);
		}
		
		//bucle for each
		System.out.println();
		
		
		
		for(String elemento:paises){
			System.out.println("pais" + elemento);
		}
		//forma cimplificada
		System.out.println();
		
	
		String[] paises2={"Argentina", "España", "mexico","venezuela", "Colombia", "ecuasoe", "peru", "francia" };
	for(String elemento:paises2){
			System.out.println("pais " + elemento);
		}
//nuevo codigo simplificado con entrada por panel
	System.out.println();
	
	String[] paises3=new String[4];
	for(int i=0; i<4; i++)
	{
		paises3[i]=JOptionPane.showInputDialog("Introduce pais" + (i+1));
		
	}
	for(String elemento2:paises3){
		System.out.println("pais " + elemento2);
	}
	
	
	}

}
