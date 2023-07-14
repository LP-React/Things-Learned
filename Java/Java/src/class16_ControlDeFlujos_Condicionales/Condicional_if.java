package class16_ControlDeFlujos_Condicionales;

import java.util.Scanner;

/**
 * 
 * @author LP-React
 *
 */

public class Condicional_if {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Ingresa tu edad, por favor");

		int edad = entrada.nextInt();

		if (edad <= 0 || edad > 100) {
			
			System.out.println("Introduce un número valido.");

		} else if (edad < 18) {
			
			System.out.println("Eres menor, no puedes ingresar.");
			
		} else if (edad >= 18) {
			
			System.out.println("Bienvenido.");
			
		}
	}

}
