package ejenmplo;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextPane;

public class Calculadora extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtA;
	private JTextField txtC;
	private JTextField txtB;
	private JLabel lblNewLabel;
	private JButton btnCalcular;
	private JScrollPane scrollPane;
	private JTextPane textPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculadora frame = new Calculadora();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Calculadora() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblNewLabel = new JLabel(" f  ( x )  =     x²         x   +  ");
		lblNewLabel.setForeground(Color.BLACK);
		lblNewLabel.setBackground(Color.WHITE);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 28));
		lblNewLabel.setBounds(10, 11, 389, 35);
		contentPane.add(lblNewLabel);
		
		btnCalcular = new JButton("Calcular");
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//Creacion de variables
				int y, a ,b , c ;
				
				//Declaración de variables
				a = Integer.parseInt(txtA.getText());
				b = Integer.parseInt(txtB.getText());
				c = Integer.parseInt(txtC.getText());
				
				//Proceso
				y = ((4*a*c) - ( (int)Math.pow(b,2 ))) / 4 * a;
				
				//Salida de datos
			
				textPane.setText("El maximo valor es: "  + y );
				
			}
		});
		btnCalcular.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnCalcular.setBounds(146, 57, 118, 35);
		contentPane.add(btnCalcular);
		
		txtA = new JTextField();
		txtA.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtA.setColumns(10);
		txtA.setBounds(146, 17, 28, 29);
		contentPane.add(txtA);
		
		txtC = new JTextField();
		txtC.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtC.setColumns(10);
		txtC.setBounds(368, 17, 28, 29);
		contentPane.add(txtC);
		
		txtB = new JTextField();
		txtB.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtB.setColumns(10);
		txtB.setBounds(231, 17, 53, 29);
		contentPane.add(txtB);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 101, 414, 149);
		contentPane.add(scrollPane);
		
		textPane = new JTextPane();
		scrollPane.setViewportView(textPane);
	}
}
