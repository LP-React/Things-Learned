package class23_Matrices;

/**
 * 
 * @author LP-React
 *
 */

public class Arrays_1 {
	public static void main(String[] args) {
	 
		//We can create arrays in two ways
		
		// int [] my_array = new int[];
		// int my_array[] = new int[];
		
		int [] my_array = new int[5];
		
		my_array[0] = 40;
		my_array[1] = 8;
		my_array[2] = 39;
		my_array[3] = 16;
		my_array[4] = 52;
		
		for (int i = 0; i < 5; i++) {
			System.out.println("Valor del índice " + i + " : " + my_array[i]);
		}
		
		// int my_array[] = {21,23,32,11,52};
		
		int my_array2[] = {2,5,12,75,23,52,22,15,23,12,67,33,92};
		
		for (int i = 0; i < my_array2.length; i++) {
			System.out.println("Valor del índice " + i + " : " + my_array2[i]);
		}
	}
}
