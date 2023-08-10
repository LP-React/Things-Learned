package class22_ControlDeFlujos_Bucles;

import javax.swing.JOptionPane;

/**
 * 
 * @author LP-React
 *
 */

public class Email_Checker_v2 {
	public static void main(String[] args) {
		
		String mail;
		int arroba = 0;
		boolean dot = false;

		while (arroba != 1 || dot == false) {

			mail = JOptionPane.showInputDialog("Introduce tu e-mail");

			for (int i = 0; i < mail.length(); i++) {
				
				if (mail.charAt(i) == '@') {
					arroba++;
				}
				if (mail.charAt(i) == '.') {
					dot = true;
				}
				
			}

			if (arroba == 1 && dot == true) {
				JOptionPane.showMessageDialog(null, "Correo correcto");
			} else {
				JOptionPane.showMessageDialog(null, "Correo incorrecto, vuelve a intentarlo");
				arroba = 0;
				dot = false;
			}

		}

	}
}
