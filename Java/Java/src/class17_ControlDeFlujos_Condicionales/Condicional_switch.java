package class17_ControlDeFlujos_Condicionales;

import java.util.*;

import javax.swing.JOptionPane;

/**
 * 
 * @author LP-React
 *
 */

public class Condicional_switch {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Elige una opción: \n1: Cuadrado\n2: Rectángulo\n3: Triaángulo\n4: Círculo");

		int figura = input.nextInt();
		
		
		double lado;
		double base;
		double altura;
		double radio;
		double resultado;

		switch (figura) {
		
		case 1:

			lado = Integer.parseInt(JOptionPane.showInputDialog("Introduce el lado"));
			
			resultado = Math.pow(lado, 2);

			System.out.println("El área del cuadrado es " + resultado);
			
			break;

		case 2:

			base = Integer.parseInt(JOptionPane.showInputDialog("Introduce la base"));
			altura = Integer.parseInt(JOptionPane.showInputDialog("Introduce la altura"));

			resultado = base * altura;
			
			System.out.println("El área del rectangulo es" + resultado);
			
			break;

		case 3:
			
			base = Integer.parseInt(JOptionPane.showInputDialog("Introduce la base"));
			altura = Integer.parseInt(JOptionPane.showInputDialog("Introduce la altura"));
			
			resultado = (base * altura) /2;
			
			System.out.println("El área del triangulo es" + resultado);
			
			break;
			
		case 4: 
			
			radio = Integer.parseInt(JOptionPane.showInputDialog("Introduce el radio"));
			
			resultado = Math.PI * (Math.pow(radio, 2));
			
			System.out.print("El área del circulo es ");
			System.out.printf("%1.2f" , resultado);
			
			break;
		
		default:
			
			System.out.println("Opcion no reconocida, por favor intente de nuevo.");
			
			break;
		}

	}

}
