
public class Arrays_bidimencionales {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int[][] matrix=new int [4][5];
		
		matrix [0][0]=00;
		matrix [0][1]=23;
		matrix [0][2]=76;
		matrix [0][3]=22;
		matrix [0][4]=04;
		
		matrix [1][0]=17;
		matrix [1][1]=27;
		matrix [1][2]=13;
		matrix [1][3]=39;
		matrix [1][4]=67;
		
		matrix [2][0]=03;
		matrix [2][1]=79;
		matrix [2][2]=28;
		matrix [2][3]=94;
		matrix [2][4]=20;
		
		matrix [3][0]=75;
		matrix [3][1]=70;
		matrix [3][2]=93;
		matrix [3][3]=73;
		matrix [3][4]=62;
		
		for(int i=0; i<4; i++){
			System.out.println();
			for(int j=0; j<5; j++)
			{
				System.out.print(matrix[i][j]+" ");
			}
			
		}
//forma simplificada
		System.out.println();
		
		int[][] matrix2={
				{0,23,76,22,4},
				{17,27,13,39,67},
				{3,79,28,94,20},
				{75,70,93,73,62}
		};

		
		for(int []fila:matrix2){
					System.out.println();
					for(int z: fila)
					{
						System.out.print(z + " ");
					}
					
				}
		
	}
	
}
