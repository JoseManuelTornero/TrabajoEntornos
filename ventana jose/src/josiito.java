import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextPane;


public class josiito extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					josiito frame = new josiito();
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
	public josiito() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTextPane txtpnJos = new JTextPane();
		txtpnJos.setEditable(false);
		txtpnJos.setText("Rodr\u00EDguez L\u00F3pez");
		txtpnJos.setBounds(212, 81, 163, 22);
		contentPane.add(txtpnJos);
		
		JTextPane textPane = new JTextPane();
		textPane.setEditable(false);
		textPane.setText("Jos\u00E9");
		textPane.setBounds(212, 46, 163, 22);
		contentPane.add(textPane);
		
		JTextPane textPane_1 = new JTextPane();
		textPane_1.setEditable(false);
		textPane_1.setText("1.79");
		textPane_1.setBounds(212, 151, 163, 22);
		contentPane.add(textPane_1);
		
		JTextPane textPane_2 = new JTextPane();
		textPane_2.setEditable(false);
		textPane_2.setText("18");
		textPane_2.setBounds(212, 116, 163, 22);
		contentPane.add(textPane_2);
		
		JTextPane txtpnApellidos = new JTextPane();
		txtpnApellidos.setEditable(false);
		txtpnApellidos.setText("Nombre:");
		txtpnApellidos.setBounds(50, 46, 163, 22);
		contentPane.add(txtpnApellidos);
		
		JTextPane txtpnEdad = new JTextPane();
		txtpnEdad.setEditable(false);
		txtpnEdad.setText("Edad:");
		txtpnEdad.setBounds(50, 116, 163, 22);
		contentPane.add(txtpnEdad);
		
		JTextPane textPane_4 = new JTextPane();
		textPane_4.setEditable(false);
		textPane_4.setText("Apellidos:");
		textPane_4.setBounds(50, 81, 163, 22);
		contentPane.add(textPane_4);
		
		JTextPane txtpnAltura = new JTextPane();
		txtpnAltura.setEditable(false);
		txtpnAltura.setText("Altura:");
		txtpnAltura.setBounds(50, 151, 163, 22);
		contentPane.add(txtpnAltura);
		
		JTextPane txtpnDam = new JTextPane();
		txtpnDam.setEditable(false);
		txtpnDam.setText("1\u00BA D.A.M");
		txtpnDam.setBounds(212, 186, 163, 22);
		contentPane.add(txtpnDam);
		
		JTextPane txtpnCurso = new JTextPane();
		txtpnCurso.setEditable(false);
		txtpnCurso.setText("Curso:");
		txtpnCurso.setBounds(50, 186, 163, 22);
		contentPane.add(txtpnCurso);
	}
}
