package class25_Matrices_Bidimensionales;

/**
 * 
 * @author LP-React
 *
 */

public class Array_Bidimensional {

	public static void main(String[] args) {

		int[][] my_Array = new int[3][3];

		my_Array[0][0] = 1;
		my_Array[0][1] = 2;
		my_Array[0][2] = 3;

		my_Array[1][0] = 4;
		my_Array[1][1] = 5;
		my_Array[1][2] = 6;

		my_Array[2][0] = 7;
		my_Array[2][1] = 8;
		my_Array[2][2] = 9;
		
		System.out.println();
		
		for (int i = 0; i < 3; i++) {

			System.out.println("   -------------");
			System.out.print("   |");
 
			for (int j = 0; j < 3; j++) {

				System.out.print(" " + my_Array[i][j] + " ");
				System.out.print("|");
			}
			System.out.println();

			if (i == 2) {
				System.out.println("   -------------\n");
			}

		}
		
		for (int i = 0; i < 3; i++) {

			for (int j = 0; j < 3; j++) {
				System.out.println("El valor ubicado en las cordenadas " + i + " - " + j + " es " + my_Array[i][j]);
			}

		}

	}

}
