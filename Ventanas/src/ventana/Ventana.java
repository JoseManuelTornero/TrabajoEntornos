package ventana;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
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
		
		JTextPane txtpnDavid = new JTextPane();
		txtpnDavid.setText("David ");
		txtpnDavid.setBounds(99, 11, 68, 20);
		contentPane.add(txtpnDavid);
		
		JTextPane txtpnNombre = new JTextPane();
		txtpnNombre.setText("Nombre:");
		txtpnNombre.setBounds(44, 11, 61, 20);
		contentPane.add(txtpnNombre);
		
		JTextPane txtpnGarcaLera = new JTextPane();
		txtpnGarcaLera.setText("Garc\u00EDa Lera\r\n");
		txtpnGarcaLera.setBounds(99, 42, 91, 20);
		contentPane.add(txtpnGarcaLera);
		
		JTextPane txtpnApellidos = new JTextPane();
		txtpnApellidos.setText("Apellidos: \r\n");
		txtpnApellidos.setBounds(44, 42, 61, 20);
		contentPane.add(txtpnApellidos);
		
		JTextPane textPane = new JTextPane();
		textPane.setText("25");
		textPane.setBounds(99, 73, 28, 20);
		contentPane.add(textPane);
		
		JTextPane txtpnEdad = new JTextPane();
		txtpnEdad.setText("Edad: ");
		txtpnEdad.setBounds(44, 73, 61, 20);
		contentPane.add(txtpnEdad);
		
		JTextPane textPane_1 = new JTextPane();
		textPane_1.setText("1.78");
		textPane_1.setBounds(99, 104, 44, 20);
		contentPane.add(textPane_1);
		
		JTextPane txtpnAltura = new JTextPane();
		txtpnAltura.setText("Altura: ");
		txtpnAltura.setBounds(44, 104, 61, 20);
		contentPane.add(txtpnAltura);
		
		JTextPane txtpnDam = new JTextPane();
		txtpnDam.setText("1\u00BA DAM.");
		txtpnDam.setBounds(99, 135, 61, 20);
		contentPane.add(txtpnDam);
		
		JTextPane txtpnCurso = new JTextPane();
		txtpnCurso.setText("Curso: ");
		txtpnCurso.setBounds(44, 135, 61, 20);
		contentPane.add(txtpnCurso);
	}
}
