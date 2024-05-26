package ejercicio;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JButton;

public class jenkins {

	private JFrame frame;
	private JTextField txtProbando;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					jenkins window = new jenkins();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public jenkins() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		txtProbando = new JTextField();
		txtProbando.setText("Probando");
		frame.getContentPane().add(txtProbando, BorderLayout.NORTH);
		txtProbando.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Hola solo es una prueba funcional");
		frame.getContentPane().add(lblNewLabel, BorderLayout.WEST);
		
		JButton btnNewButton = new JButton("No funciono");
		frame.getContentPane().add(btnNewButton, BorderLayout.CENTER);
	}

}
