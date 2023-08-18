package class26_Matrices_Bidimensionales;

import javax.swing.JOptionPane;

/**
 * 
 * @author LP-React
 *
 */

public class Interes_Compuesto {

	public static void main(String[] args) {

		double[][] tabla = new double[5][5];

		tabla[0][0] = 0.08;
		tabla[0][1] = 0.09;
		tabla[0][2] = 0.1;
		tabla[0][3] = 0.11;
		tabla[0][4] = 0.12;

		double inicial = Double.parseDouble(JOptionPane.showInputDialog("Inserta tu ahorro inicial"));

		for (int i = 0; i < 5; i++) {

			System.out.println("----------------------------------------------------");
			System.out.println();

			for (int j = 0; j < 5; j++) {

				switch (i) {
				case 1:
					tabla[i][j] = inicial;
					break;
				case 2: 
					tabla[i][j] = (tabla[i - 1][j] * tabla[i - 2][j]) + tabla[i - 1][j];
					break;
				case 3:
					tabla[i][j] = (tabla[i - 1][j] * tabla[i - 3][j]) + tabla[i - 1][j];
					break;
				case 4:
					tabla[i][j] = (tabla[i - 1][j] * tabla[i - 4][j]) + tabla[i - 1][j];
					break;
				case 5:
					tabla[i][j] = (tabla[i - 1][j] * tabla[i - 5][j]) + tabla[i - 1][j];
					break;

				}

				if (j == 0) {
					System.out.print("|  ");
				}

				if (i == 0) {
					System.out.print(" ");
				}

				System.out.printf("%1.2f ", tabla[i][j]);
				System.out.print("  | ");
			}

			System.out.println();
			System.out.println();

			if (i == 4) {
				System.out.println("----------------------------------------------------");
			}
		}
	}
}