package Ventanas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JTextPane;

public class Ventana extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ventana frame = new Ventana();
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
	public Ventana() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTextPane txtpnNombre = new JTextPane();
		txtpnNombre.setText("Nombre:");
		txtpnNombre.setBounds(10, 45, 153, 20);
		contentPane.add(txtpnNombre);
		
		JTextPane txtpnAndrs = new JTextPane();
		txtpnAndrs.setText("Andr\u00E9s");
		txtpnAndrs.setBounds(160, 45, 211, 20);
		contentPane.add(txtpnAndrs);
		
		JTextPane txtpnApellidos = new JTextPane();
		txtpnApellidos.setText("Apellidos:");
		txtpnApellidos.setBounds(10, 76, 153, 20);
		contentPane.add(txtpnApellidos);
		
		JTextPane txtpnMartosCaballero = new JTextPane();
		txtpnMartosCaballero.setText("Martos Caballero");
		txtpnMartosCaballero.setBounds(160, 76, 211, 20);
		contentPane.add(txtpnMartosCaballero);
		
		JTextPane txtpnEdad = new JTextPane();
		txtpnEdad.setText("Edad:");
		txtpnEdad.setBounds(10, 107, 153, 20);
		contentPane.add(txtpnEdad);
		
		JTextPane textPane = new JTextPane();
		textPane.setText("20");
		textPane.setBounds(160, 107, 211, 20);
		contentPane.add(textPane);
		
		JTextPane txtpnAltura = new JTextPane();
		txtpnAltura.setText("Altura:");
		txtpnAltura.setBounds(10, 138, 153, 20);
		contentPane.add(txtpnAltura);
		
		JTextPane textPane_1 = new JTextPane();
		textPane_1.setText("1.72");
		textPane_1.setBounds(160, 138, 211, 20);
		contentPane.add(textPane_1);
		
		JTextPane txtpnCurso = new JTextPane();
		txtpnCurso.setText("Curso:");
		txtpnCurso.setBounds(10, 169, 153, 20);
		contentPane.add(txtpnCurso);
		
		JTextPane txtpnDam = new JTextPane();
		txtpnDam.setText("1\u00BA DAM");
		txtpnDam.setBounds(160, 169, 211, 20);
		contentPane.add(txtpnDam);
	}
}
