package ui;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class LoginView {

	private JFrame frmLogin;
	private JLabel lblTituloLogin;
	private JLabel lblUsuarioLogin;
	private JTextField tfUsuarioLogin;
	private JLabel lblPasswordLogin;
	private JPasswordField pfPasswordLogin;
	private JButton btnEntrarLogin;
	private JButton btnIrARegistrar;

	/**
	 * Create the application.
	 */
	public LoginView() {
		initialize();
		this.frmLogin.setVisible(true);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmLogin = new JFrame();
		configureUIComponents();
		configureListeners();
	}
	
	private void configureUIComponents() {
		frmLogin.setTitle("Login");
		frmLogin.setBounds(100, 100, 450, 300);
		frmLogin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmLogin.getContentPane().setLayout(null);
		
		lblTituloLogin = new JLabel("POK\u00C9DEX");
		lblTituloLogin.setFont(new Font("Lucida Console", Font.BOLD | Font.ITALIC, 29));
		lblTituloLogin.setBounds(148, 25, 131, 53);
		frmLogin.getContentPane().add(lblTituloLogin);
		
		lblUsuarioLogin = new JLabel("Usuario");
		lblUsuarioLogin.setBounds(71, 101, 59, 14);
		frmLogin.getContentPane().add(lblUsuarioLogin);
		
		tfUsuarioLogin = new JTextField();
		tfUsuarioLogin.setBounds(135, 98, 185, 20);
		frmLogin.getContentPane().add(tfUsuarioLogin);
		tfUsuarioLogin.setColumns(10);
		
		lblPasswordLogin = new JLabel("Password");
		lblPasswordLogin.setBounds(71, 152, 59, 14);
		frmLogin.getContentPane().add(lblPasswordLogin);
		
		pfPasswordLogin = new JPasswordField();
		pfPasswordLogin.setBounds(136, 149, 184, 20);
		frmLogin.getContentPane().add(pfPasswordLogin);
		
		btnEntrarLogin = new JButton("Entrar");
		btnEntrarLogin.setBounds(169, 200, 89, 23);
		frmLogin.getContentPane().add(btnEntrarLogin);
		
		btnIrARegistrar = new JButton("Reg\u00EDstrate");
		btnIrARegistrar.setBounds(322, 214, 89, 23);
		frmLogin.getContentPane().add(btnIrARegistrar);
	}
	
	public void configureListeners() {
		btnEntrarLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				comprobarLogin();
			}
		});
		
		pfPasswordLogin.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if (e.getKeyCode() == KeyEvent.VK_ENTER) {
					comprobarLogin();
				}
			}
		});
		
		btnIrARegistrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmLogin.setVisible(false);
				// Abrir ventana de registro
			}
		});
	}
	
	private void comprobarLogin() {
		String usuario = tfUsuarioLogin.getText();
		String password = new String(pfPasswordLogin.getPassword());
		if (usuario.equals("Aqu� va el usuario de la lista") && password.equals("Aqu� va la contrase�a de la lista")) {
			frmLogin.setVisible(false);
			// Abrir ventana de Pokedex
		} else {
			JOptionPane.showMessageDialog(btnEntrarLogin, "Login incorrecto");
		}
	}
}
