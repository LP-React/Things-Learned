package class21_ControlDeFlujos_Bucles;

import javax.swing.JOptionPane;

/**
 * 
 * @author LP-React
 *
 */

public class Ejercicio_For {
	public static void main(String[] args) {

		boolean arroba = false;
		boolean dot = false;

		while (arroba == false || dot == false) {

			String mail = JOptionPane.showInputDialog("Introduce tu e-mail");

			for (int i = 0; i < mail.length(); i++) {
				if (mail.charAt(i) == '@') {
					arroba = true;
				}
			}
			
			for (int i = 0; i < mail.length(); i++) {
				if (mail.charAt(i) == '.') {
					dot = true;
				}
			}

			if (arroba == true && dot == true) {
				JOptionPane.showMessageDialog(null, "Correo correcto");
			} else {
				JOptionPane.showMessageDialog(null, "Correo incorrecto, vuelve a intentarlo");
			}

		}

	}
}
