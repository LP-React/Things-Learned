package class22_ControlDeFlujos_Bucles;

import java.util.Scanner;

import javax.swing.JOptionPane;

/**
 * 
 * @author LP-React
 *
 */

public class Factorial_calculator {

	public static void main(String[] args) {
		
		Scanner Input = new Scanner(System.in);
		System.out.println("Introduce un número");
		
		int num = Input.nextInt();
		Long result = 1l;
		
		
		for (int i= num; i > 0; i--) {
			
			result = result * i;
			
		}
		
		System.out.println("El factorial de " + num + " es " + result);
	}

}
