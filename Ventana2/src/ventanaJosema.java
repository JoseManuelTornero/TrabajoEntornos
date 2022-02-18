import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextPane;

public class ventanaJosema extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ventanaJosema frame = new ventanaJosema();
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
	public ventanaJosema() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTextPane txtpnJoseManuel = new JTextPane();
		txtpnJoseManuel.setEditable(false);
		txtpnJoseManuel.setText("Jose Manuel");
		txtpnJoseManuel.setBounds(141, 52, 283, 20);
		contentPane.add(txtpnJoseManuel);
		
		JTextPane txtpnNombre = new JTextPane();
		txtpnNombre.setEditable(false);
		txtpnNombre.setText("Nombre:");
		txtpnNombre.setBounds(10, 52, 147, 20);
		contentPane.add(txtpnNombre);
		
		JTextPane txtpnTorneroSanchez = new JTextPane();
		txtpnTorneroSanchez.setEditable(false);
		txtpnTorneroSanchez.setText("Tornero Sanchez");
		txtpnTorneroSanchez.setBounds(141, 83, 283, 20);
		contentPane.add(txtpnTorneroSanchez);
		
		JTextPane txtpnApellidos = new JTextPane();
		txtpnApellidos.setEditable(false);
		txtpnApellidos.setText("Apellidos:");
		txtpnApellidos.setBounds(10, 83, 147, 20);
		contentPane.add(txtpnApellidos);
		
		JTextPane textPane = new JTextPane();
		textPane.setEditable(false);
		textPane.setText("18");
		textPane.setBounds(141, 114, 283, 20);
		contentPane.add(textPane);
		
		JTextPane txtpnEdad = new JTextPane();
		txtpnEdad.setEditable(false);
		txtpnEdad.setText("Edad:");
		txtpnEdad.setBounds(10, 114, 147, 20);
		contentPane.add(txtpnEdad);
		
		JTextPane textPane_1 = new JTextPane();
		textPane_1.setEditable(false);
		textPane_1.setText("1.77");
		textPane_1.setBounds(141, 145, 283, 20);
		contentPane.add(textPane_1);
		
		JTextPane txtpnAltura = new JTextPane();
		txtpnAltura.setEditable(false);
		txtpnAltura.setText("Altura:");
		txtpnAltura.setBounds(10, 145, 147, 20);
		contentPane.add(txtpnAltura);
		
		JTextPane txtpndam = new JTextPane();
		txtpndam.setEditable(false);
		txtpndam.setText("1\u00BADAM");
		txtpndam.setBounds(141, 176, 283, 20);
		contentPane.add(txtpndam);
		
		JTextPane txtpnCurso = new JTextPane();
		txtpnCurso.setEditable(false);
		txtpnCurso.setText("Curso:");
		txtpnCurso.setBounds(10, 176, 147, 20);
		contentPane.add(txtpnCurso);
	}
}
