package class24_Matrices;

/**
 * 
 * @author LP-React
 * 
 */

import javax.swing.JOptionPane;

public class Using_ForEach {
	public static void main(String[] args) {

		String[] countries = new String[5];

		for (int i = 0; i < countries.length; i++) {
			countries[i] = JOptionPane.showInputDialog("Inserta un país");
		}

		System.out.println("Lista de países insertados : ");
		int position = 0;

		for (String iterator : countries) {
			position++;
			System.out.println("El pais N° " + position + " es " + iterator);
		}
		
	}

}
