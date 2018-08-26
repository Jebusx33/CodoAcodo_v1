
public class Matriz_bidimencional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Hacer la tabla de intereses 
/*
    ----------------------------------------------------------- 
	10%       11%       12%       13%       14%       15%
	-----------------------------------------------------------
	10000,00| 10000,00| 10000,00| 10000,00| 10000,00| 10000,00| 
	11000,00| 11100,00| 11200,00| 11300,00| 11400,00| 11500,00|
	12100,00| 12321,00| 12544,00| 12769,00| 12996,00| 13225,00|	
	13310,00| 13676,31| 14049,28| 14428,97| 14815,44| 15208,75|
	-----------------------------------------------------------
	14641,00| 15180,70| 15735,19| 16304,74| 16889,60| 17490,06|
*/		
		
		double acumulado;
		double intereses=0.10;
		double[][] saldo=new double[6][5];
		
		for(int i=0; i<6; i++)
		{
			saldo[i][0]=10000;
			acumulado=10000;
			for(int j=1; j<5; j++){
				acumulado=acumulado+(acumulado*intereses);
				saldo[i][j]=acumulado;
				
			}
			intereses=intereses+0.01;
		}		
		for(int z=0; z<6;z++){
			System.out.println();
			for(int h=0; h<5; h++)
			{
			System.out.printf("%1.2f", saldo[z][h]);
			System.out.print(" ");
			}
		}

		
	}
}
