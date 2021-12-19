package ui;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;

public class PokedexView {

	private JFrame frmPokedex;
	private JLabel lblNumeroPokedex;
	private JLabel lblNombrePokedex;
	private JLabel lblTipo1Pokedex;
	private JLabel lblTipo2Pokedex;
	private JLabel lblAlturaPokedex;
	private JLabel lblPesoPokedex;
	private JLabel lblCategoriaPokedex;
	private JLabel lblHabilidadPokedex;
	private JButton btnAnteriorPokedex;
	private JButton btnSiguientePokedex;
	private JButton btnActualizarPokedex;
	private JButton btnCrearPokedex;
	private JButton btnBorrarPokedex;

	/**
	 * Create the application.
	 */
	public PokedexView() {
		initialize();
		this.frmPokedex.setVisible(true);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmPokedex = new JFrame();
		configureUIComponents();
		configureListeners();
		
	}
	

	private void configureUIComponents() {
		frmPokedex.setTitle("Pokedex");
		frmPokedex.setBounds(100, 100, 450, 300);
		frmPokedex.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmPokedex.getContentPane().setLayout(null);

		lblNumeroPokedex = new JLabel("#1");
		lblNumeroPokedex.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNumeroPokedex.setFont(new Font("Lucida Console", Font.BOLD | Font.ITALIC, 20));
		lblNumeroPokedex.setBounds(115, 35, 46, 25);
		frmPokedex.getContentPane().add(lblNumeroPokedex);
		
		lblNombrePokedex = new JLabel("Bulbasaur");
		lblNombrePokedex.setFont(new Font("Lucida Console", Font.BOLD | Font.ITALIC, 20));
		lblNombrePokedex.setBounds(183, 35, 172, 25);
		frmPokedex.getContentPane().add(lblNombrePokedex);
		
		lblTipo1Pokedex = new JLabel("Tipo Planta");
		lblTipo1Pokedex.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblTipo1Pokedex.setBounds(58, 71, 123, 25);
		frmPokedex.getContentPane().add(lblTipo1Pokedex);
		
		lblTipo2Pokedex = new JLabel("Tipo Veneno");
		lblTipo2Pokedex.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblTipo2Pokedex.setBounds(58, 95, 123, 25);
		frmPokedex.getContentPane().add(lblTipo2Pokedex);
		
		lblAlturaPokedex = new JLabel("Altura: 0.7m");
		lblAlturaPokedex.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblAlturaPokedex.setBounds(232, 71, 123, 25);
		frmPokedex.getContentPane().add(lblAlturaPokedex);
		
		lblPesoPokedex = new JLabel("Peso: 20.5kg");
		lblPesoPokedex.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblPesoPokedex.setBounds(232, 95, 123, 25);
		frmPokedex.getContentPane().add(lblPesoPokedex);
		
		lblCategoriaPokedex = new JLabel("Categ.:\r \r\nSemilladora");
		lblCategoriaPokedex.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblCategoriaPokedex.setBounds(58, 131, 151, 25);
		frmPokedex.getContentPane().add(lblCategoriaPokedex);
		
		lblHabilidadPokedex = new JLabel("Hab.: Clorofila");
		lblHabilidadPokedex.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblHabilidadPokedex.setBounds(232, 131, 138, 25);
		frmPokedex.getContentPane().add(lblHabilidadPokedex);
		
		btnAnteriorPokedex = new JButton("Anterior");
		btnAnteriorPokedex.setBounds(115, 175, 89, 23);
		frmPokedex.getContentPane().add(btnAnteriorPokedex);
		
		btnSiguientePokedex = new JButton("Siguiente");
		btnSiguientePokedex.setBounds(221, 175, 89, 23);
		frmPokedex.getContentPane().add(btnSiguientePokedex);
		
		btnActualizarPokedex = new JButton("Actualizar");
		btnActualizarPokedex.setBounds(169, 216, 89, 23);
		frmPokedex.getContentPane().add(btnActualizarPokedex);
		
		btnCrearPokedex = new JButton("Crear");
		btnCrearPokedex.setBounds(58, 216, 89, 23);
		frmPokedex.getContentPane().add(btnCrearPokedex);
		
		btnBorrarPokedex = new JButton("Borrar");
		btnBorrarPokedex.setBounds(281, 216, 89, 23);
		frmPokedex.getContentPane().add(btnBorrarPokedex);
	}
	
	
	private void configureListeners() {
		
	}
}
