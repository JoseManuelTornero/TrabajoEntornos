package Ventana;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JLabel;
import javax.swing.JMenuItem;
import javax.swing.JButton;
import javax.swing.JMenu;
import java.awt.CardLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

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
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("Menú");
		menuBar.add(mnNewMenu);
		
		JMenuItem david = new JMenuItem("David");
		david.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				VentanaDavid d = new VentanaDavid();
				nuevoPanel(d);
			}
		});
		mnNewMenu.add(david);
		
		JMenuItem jose= new JMenuItem("José");
		jose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				VentanaJosito j = new VentanaJosito();
				nuevoPanel(j);
			}
		});
		mnNewMenu.add(jose);
		
		JMenuItem andres = new JMenuItem("Andrés");
		andres.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				VentanaAndres a = new VentanaAndres();
				nuevoPanel(a);
			}
		});
		mnNewMenu.add(andres);
		
		JMenuItem cheetos = new JMenuItem("Jos\u00E9 Manuel");
		cheetos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				VentanaJosema jm = new VentanaJosema();
				nuevoPanel(jm);
			}
		});
		mnNewMenu.add(cheetos);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new CardLayout(0, 0));
	}
	
	public void nuevoPanel(JPanel panelActual){
		contentPane.removeAll();
		contentPane.add(panelActual);
		contentPane.repaint();
		contentPane.revalidate();
	}
}
