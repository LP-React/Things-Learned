package class26_Matrices_Bidimensionales;

/**
 * 
 * @author LP-React
 *
 */

public class Array_Bidimensional_For_Each {
	public static void main(String[] args) {

		int[][] my_Array = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

		for (int[] i : my_Array) {

			System.out.println("-------------");
			System.out.print("|");
			
			for (int j : i) {

				System.out.print(" " + j + " |");

			}
			System.out.println();

		}
		System.out.println("-------------");

	}
}
