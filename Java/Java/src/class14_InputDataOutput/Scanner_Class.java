package class14_InputDataOutput;

import java.util.Scanner;

/**
 * 
 * @author LP-React
 *
 */

public class Scanner_Class {

	public static void main(String[] args) {
		
		Scanner Input = new Scanner(System.in);
		
		System.out.println("Introduce tu nombre");
		String nombre = Input.nextLine();
		
		System.out.println("Introduce tu edad");
		int edad = Input.nextInt();

		System.out.println("Hola " + nombre + ", el proximo año cumplirás " + (edad + 1) + " años.");

	}

}
