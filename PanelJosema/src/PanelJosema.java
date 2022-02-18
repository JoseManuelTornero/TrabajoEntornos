import javax.swing.JPanel;
import javax.swing.JTextPane;

public class PanelJosema extends JPanel {

	/**
	 * Create the panel.
	 */
	public PanelJosema() {
		setLayout(null);
		
		JTextPane txtpnJoseManuel = new JTextPane();
		txtpnJoseManuel.setText("Jose Manuel");
		txtpnJoseManuel.setEditable(false);
		txtpnJoseManuel.setBounds(141, 59, 283, 20);
		add(txtpnJoseManuel);
		
		JTextPane txtpnNombre = new JTextPane();
		txtpnNombre.setText("Nombre:");
		txtpnNombre.setEditable(false);
		txtpnNombre.setBounds(10, 59, 147, 20);
		add(txtpnNombre);
		
		JTextPane txtpnTorneroSanchez = new JTextPane();
		txtpnTorneroSanchez.setText("Tornero Sanchez");
		txtpnTorneroSanchez.setEditable(false);
		txtpnTorneroSanchez.setBounds(141, 90, 283, 20);
		add(txtpnTorneroSanchez);
		
		JTextPane txtpnApellidos = new JTextPane();
		txtpnApellidos.setText("Apellidos:");
		txtpnApellidos.setEditable(false);
		txtpnApellidos.setBounds(10, 90, 147, 20);
		add(txtpnApellidos);
		
		JTextPane textPane = new JTextPane();
		textPane.setText("18");
		textPane.setEditable(false);
		textPane.setBounds(141, 121, 283, 20);
		add(textPane);
		
		JTextPane txtpnEdad = new JTextPane();
		txtpnEdad.setText("Edad:");
		txtpnEdad.setEditable(false);
		txtpnEdad.setBounds(10, 121, 147, 20);
		add(txtpnEdad);
		
		JTextPane textPane_1 = new JTextPane();
		textPane_1.setText("1.77");
		textPane_1.setEditable(false);
		textPane_1.setBounds(141, 152, 283, 20);
		add(textPane_1);
		
		JTextPane txtpnAltura = new JTextPane();
		txtpnAltura.setText("Altura:");
		txtpnAltura.setEditable(false);
		txtpnAltura.setBounds(10, 152, 147, 20);
		add(txtpnAltura);
		
		JTextPane txtpndam = new JTextPane();
		txtpndam.setText("1\u00BADAM");
		txtpndam.setEditable(false);
		txtpndam.setBounds(141, 183, 283, 20);
		add(txtpndam);
		
		JTextPane txtpnCurso = new JTextPane();
		txtpnCurso.setText("Curso:");
		txtpnCurso.setEditable(false);
		txtpnCurso.setBounds(10, 183, 147, 20);
		add(txtpnCurso);

	}

}
