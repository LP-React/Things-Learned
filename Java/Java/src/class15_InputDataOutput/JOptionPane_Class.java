package class15_InputDataOutput;

import javax.swing.*;

/**
 * 
 * @author LP-React
 *
 */

public class JOptionPane_Class {

	public static void main(String[] args) {
		
		String numero = JOptionPane.showInputDialog("Introduce un número, por favor");
		
		double edadToDouble = Double.parseDouble(numero); 

		System.out.print("Tú numero es " + numero + " y su raíz cuadrada es ");
		
		System.out.printf( "%1.3f", Math.sqrt(edadToDouble));
		
	}

}
