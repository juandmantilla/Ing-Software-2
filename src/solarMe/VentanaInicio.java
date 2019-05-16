package solarMe;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextPane;
import java.awt.GridBagLayout;
import java.awt.CardLayout;
import java.awt.Label;
import java.awt.Font;

public class VentanaInicio extends JFrame {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaInicio frame = new VentanaInicio();
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
	public VentanaInicio() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//SetBounds (posición en x, posición y, anchura, altura)
		setBounds(100, 100, 600, 600);
		//Colocar la ventana en el centro de la pantalla
		setLocationRelativeTo(null);
		
		Label label = new Label("SolarMe");
		label.setAlignment(Label.CENTER);
		label.setFont(new Font("Ubuntu", Font.PLAIN, 26));
		getContentPane().add(label, BorderLayout.NORTH);
	
		
	}

}
