package class18_ControlDeFlujos_Bucles;

import javax.swing.JOptionPane;

/**
 * 
 * @author LP-React
 *
 */

public class Bucle_While {

	public static void main(String[] args) {
		
		String password = "123";
		String pass = "";

		while (password.equals(pass) == false) {
			
			pass = JOptionPane.showInputDialog("Introduce tu contraseña");

			if (password.equals(pass) == false) {
			
				System.out.println("Contraseña incorrecta");

			}

		}

		System.out.println("Contaseña correcta, bienvenido.");

	}

}
