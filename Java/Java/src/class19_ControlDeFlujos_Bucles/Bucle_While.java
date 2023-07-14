package class19_ControlDeFlujos_Bucles;

import java.util.Scanner;
import javax.swing.*;

/**
 * 
 * @author LP-React
 *
 */

public class Bucle_While {

	public static void main(String[] args) {
	
		String sex = "" ;
		int height = 0;
		int ideal_weight = 0;
		
		do {
			sex = JOptionPane.showInputDialog("Introduce tu sexo ( H / M )");
			
		} while ( sex.equalsIgnoreCase("H") == false && sex.equalsIgnoreCase("M") == false);
		
		height = Integer.parseInt(JOptionPane.showInputDialog("Introduce tu estatura en cm por favor"));
		
		if ( sex.equalsIgnoreCase("H")) {
			
			ideal_weight = height - 110;
			
		} else if (sex.equalsIgnoreCase("M")) {
			
			ideal_weight = height - 120;
		
		}
		
		JOptionPane.showMessageDialog(null, "Tu peso ideal es " + ideal_weight + " kilos ");
		
	}

}
