package class20_ControlDeFlujos_Bucles;

import java.util.Scanner;

/**
 * 
 * @author LP-React
 *
 */

public class Bucle_Do_While {

	public static void main(String[] args) {

		int random_num = (int) (Math.random() * 10);

		Scanner input = new Scanner(System.in);

		int num = 0;
		int tries = 1;
		
		System.out.println("Introduce un número, por favor");
		
		while (random_num != num && tries <= 5) {

			num = input.nextInt();
			
			if (random_num == num) {

				System.out.println("¡ Ganaste ! Acertaste en el intento número " + tries);
				break;
				
			} else if (random_num > num) {

				System.out.println("El número aleatorio es mayor ! ");
				
			} else if (random_num < num) {

				System.out.println("El número aleatorio es menor ! ");

			}
			
			tries++;
			
		}

		System.out.println("Juego terminado");

	}

}
