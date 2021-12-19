package ui;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JButton;

public class RegistroView {

	private JFrame frmRegistro;
	private JLabel lblUsuarioRegistro;
	private JTextField tfUsuarioRegistro;
	private JLabel lblPasswordRegistro;
	private JPasswordField pfPasswordRegistro;
	private JLabel lblRepetirPasswordRegistro;
	private JPasswordField pfRepetirPasswordRegistro;
	private JButton btnCrearRegistro;
	private JButton btnVolverALogin;

	/**
	 * Create the application.
	 */
	public RegistroView() {
		initialize();
		this.frmRegistro.setVisible(true);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmRegistro = new JFrame();
		configureUIComponents();
		configureListeners();
	}
	
	private void configureUIComponents( ) {
		frmRegistro.setTitle("Registro");
		frmRegistro.setBounds(100, 100, 450, 300);
		frmRegistro.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmRegistro.setVisible(true);
		frmRegistro.getContentPane().setLayout(null);
		
		lblUsuarioRegistro = new JLabel("Nuevo usuario");
		lblUsuarioRegistro.setBounds(45, 51, 96, 14);
		frmRegistro.getContentPane().add(lblUsuarioRegistro);
		
		tfUsuarioRegistro = new JTextField();
		tfUsuarioRegistro.setBounds(174, 48, 169, 20);
		frmRegistro.getContentPane().add(tfUsuarioRegistro);
		tfUsuarioRegistro.setColumns(10);
		
		lblPasswordRegistro = new JLabel("Nuevo password");
		lblPasswordRegistro.setBounds(45, 103, 96, 14);
		frmRegistro.getContentPane().add(lblPasswordRegistro);
		
		pfPasswordRegistro = new JPasswordField();
		pfPasswordRegistro.setBounds(174, 100, 169, 20);
		frmRegistro.getContentPane().add(pfPasswordRegistro);
		
		lblRepetirPasswordRegistro = new JLabel("Repetir password");
		lblRepetirPasswordRegistro.setBounds(45, 134, 96, 14);
		frmRegistro.getContentPane().add(lblRepetirPasswordRegistro);
		
		pfRepetirPasswordRegistro = new JPasswordField();
		pfRepetirPasswordRegistro.setBounds(174, 131, 169, 20);
		frmRegistro.getContentPane().add(pfRepetirPasswordRegistro);
		
		btnCrearRegistro = new JButton("Crear usuario");
		btnCrearRegistro.setBounds(145, 187, 103, 23);
		frmRegistro.getContentPane().add(btnCrearRegistro);
		
		btnVolverALogin = new JButton("Volver");
		btnVolverALogin.setBounds(323, 215, 89, 23);
		frmRegistro.getContentPane().add(btnVolverALogin);
	}
	
	private void configureListeners() {
		
		btnCrearRegistro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				crearRegistro();
			}
		});
		
		pfRepetirPasswordRegistro.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if (e.getKeyCode() == KeyEvent.VK_ENTER) {
					crearRegistro();
				}
			}
		});
		
	}
	
	private void crearRegistro() {
		String usuario = tfUsuarioRegistro.getText();
		String password = new String(pfPasswordRegistro.getPassword());
		String repetirPassword = new String(pfPasswordRegistro.getPassword());
		if (password.equals(repetirPassword)) {
			// Crea usuario.
		} else {
			JOptionPane.showMessageDialog(btnCrearRegistro, "Las contraseñas no son iguales.");
		}
	}
}
