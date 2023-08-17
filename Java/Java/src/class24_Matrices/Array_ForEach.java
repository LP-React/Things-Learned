package class24_Matrices;

/**
 * 
 * @author LP-React
 *
 */

public class Array_ForEach {
	public static void main(String[] args) {
	
	// En un for each, el "iterador" es una variable que tomara el valor de cada elemento en el array hasta el limite de esta.
	// Entonces podriamos decir que el valor final de iterador es 9 en este caso.
		
	//-----------------------------------------------------------------------------------------------------
		
		int[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

		for (int iterator : numbers) {
			System.out.println(iterator);
		}
		 
	//-----------------------------------------------------------------------------------------------------
		
		String names[] = {"Juan","Mateo","Smith","Ronald","Maite"};
		
		for (String iterador : names) {
			System.out.println(iterador);
		}
		
	}

}
