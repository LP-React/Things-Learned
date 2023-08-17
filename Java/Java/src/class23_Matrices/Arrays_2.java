package class23_Matrices;

/**
 * 
 * @author LP-React
 *
 */

public class Arrays_2 {
	public static void main(String[] args) {
		
		String [] countries = new String[8];
		
		countries[0] = "Perú";
		countries[1] = "Argentina";
		countries[2] = "Russia";
		countries[3] = "Brasil";
		countries[4] = "Japan";
		countries[5] = "Mexico";
		countries[6] = "Canadá";
		countries[7] = "United States";
		
		for (int i= 0; i < countries.length; i++) {
			System.out.println("País " + ( i + 1) + " : "+ countries[i]);
		}
		
		
		
	}
}
