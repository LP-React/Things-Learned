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

		double ahorro_Inicial = Double.parseDouble(JOptionPane.showInputDialog("Inserta tu ahorro inicial"));

		System.out.println();
		
		for (int fila = 0; fila < 5; fila++) {

			System.out.println("       ----------------------------------------------------");
			System.out.println("       |          |         |         |         |         |");

			for (int columna = 0; columna < 5; columna++) {

				switch (fila) {
				
				case 1:
					tabla[fila][columna] = ahorro_Inicial;
					break;
					
				case 2: 
					tabla[fila][columna] = (tabla[fila - 1][columna] * tabla[fila - 2][columna]) + tabla[fila - 1][columna];
					break;
					
				case 3:
					tabla[fila][columna] = (tabla[fila - 1][columna] * tabla[fila - 3][columna]) + tabla[fila - 1][columna];
					break;
					
				case 4:
					tabla[fila][columna] = (tabla[fila - 1][columna] * tabla[fila - 4][columna]) + tabla[fila - 1][columna];
					break;
					
				case 5:
					tabla[fila][columna] = (tabla[fila - 1][columna] * tabla[fila - 5][columna]) + tabla[fila - 1][columna];
					break;

				}

				if (columna == 0) {
					System.out.print("       |  ");
				}

				if (fila == 0) {
					System.out.print(" ");
				}

				System.out.printf("%1.2f ", tabla[fila][columna]);
				System.out.print("  | ");
			}

			System.out.println();
			System.out.println("       |          |         |         |         |         |");

			if (fila == 4) {
				System.out.println("       ----------------------------------------------------");
			}
		}
	}
}