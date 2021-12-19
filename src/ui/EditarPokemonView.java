package ui;

import javax.swing.JFrame;
import javax.swing.JTextField;

import enums.Tipo;
import models.Pokemon;
import utils.Almacen;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class EditarPokemonView {

	private JFrame frmEditarPokemon;
	private JTextField txtNumeroEditarPokemon;
	private JTextField txtNombreEditarPokemon;
	private JTextField txtTipo1EditarPokemon;
	private JTextField txtTipo2EditarPokemon;
	private JTextField txtAlturaEditarPokemon;
	private JTextField txtPesoEditarPokemon;
	private JTextField txtCategoriaEditarPokemon;
	private JTextField txtHabilidadEditarPokemon;
	private JButton btnFinalizarEditarPokemon;
	private JFrame padre;

	/**
	 * Create the application.
	 */
	public EditarPokemonView(JFrame padre, boolean ocultar) {
		initialize();
		this.padre = padre;
		this.frmEditarPokemon.setVisible(true);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmEditarPokemon = new JFrame();
		configureUIComponents();
		configureListeners();
	}

	private void configureUIComponents() {

		frmEditarPokemon.setTitle("Crear/Editar Pokemon");
		frmEditarPokemon.setBounds(100, 100, 450, 300);
		frmEditarPokemon.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmEditarPokemon.getContentPane().setLayout(null);

		txtNumeroEditarPokemon = new JTextField();
		txtNumeroEditarPokemon.setText("Numero");
		txtNumeroEditarPokemon.setBounds(71, 34, 57, 20);
		frmEditarPokemon.getContentPane().add(txtNumeroEditarPokemon);
		txtNumeroEditarPokemon.setColumns(10);

		txtNombreEditarPokemon = new JTextField();
		txtNombreEditarPokemon.setText("Nombre");
		txtNombreEditarPokemon.setBounds(244, 34, 86, 20);
		frmEditarPokemon.getContentPane().add(txtNombreEditarPokemon);
		txtNombreEditarPokemon.setColumns(10);

		txtTipo1EditarPokemon = new JTextField();
		txtTipo1EditarPokemon.setText("Tipo1");
		txtTipo1EditarPokemon.setBounds(57, 82, 86, 20);
		frmEditarPokemon.getContentPane().add(txtTipo1EditarPokemon);
		txtTipo1EditarPokemon.setColumns(10);

		txtTipo2EditarPokemon = new JTextField();
		txtTipo2EditarPokemon.setText("Tipo2");
		txtTipo2EditarPokemon.setColumns(10);
		txtTipo2EditarPokemon.setBounds(57, 113, 86, 20);
		frmEditarPokemon.getContentPane().add(txtTipo2EditarPokemon);

		txtAlturaEditarPokemon = new JTextField();
		txtAlturaEditarPokemon.setText("Altura");
		txtAlturaEditarPokemon.setColumns(10);
		txtAlturaEditarPokemon.setBounds(260, 82, 54, 20);
		frmEditarPokemon.getContentPane().add(txtAlturaEditarPokemon);

		txtPesoEditarPokemon = new JTextField();
		txtPesoEditarPokemon.setText("Peso");
		txtPesoEditarPokemon.setColumns(10);
		txtPesoEditarPokemon.setBounds(260, 113, 54, 20);
		frmEditarPokemon.getContentPane().add(txtPesoEditarPokemon);

		txtCategoriaEditarPokemon = new JTextField();
		txtCategoriaEditarPokemon.setText("Categoria");
		txtCategoriaEditarPokemon.setColumns(10);
		txtCategoriaEditarPokemon.setBounds(57, 162, 86, 20);
		frmEditarPokemon.getContentPane().add(txtCategoriaEditarPokemon);

		txtHabilidadEditarPokemon = new JTextField();
		txtHabilidadEditarPokemon.setText("Habilidad");
		txtHabilidadEditarPokemon.setColumns(10);
		txtHabilidadEditarPokemon.setBounds(244, 162, 86, 20);
		frmEditarPokemon.getContentPane().add(txtHabilidadEditarPokemon);

		btnFinalizarEditarPokemon = new JButton("Finalizar");
		btnFinalizarEditarPokemon.setBounds(143, 210, 98, 23);
		frmEditarPokemon.getContentPane().add(btnFinalizarEditarPokemon);

	}

	private void configureListeners() {

		btnFinalizarEditarPokemon.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int numero = Integer.parseInt(txtNumeroEditarPokemon.getText());
				String nombre = txtNombreEditarPokemon.getText();
				Tipo tipo1 = Tipo.valueOf(txtTipo1EditarPokemon.getText());
				Tipo tipo2 = Tipo.valueOf(txtTipo2EditarPokemon.getText());
				// No sé dónde tengo el error. El valor del peso está asignado al txtAltura y viceversa.
				double peso = Double.parseDouble(txtAlturaEditarPokemon.getText());
				double altura = Double.parseDouble(txtPesoEditarPokemon.getText());
				String categoria = txtCategoriaEditarPokemon.getText();
				String habilidad = txtHabilidadEditarPokemon.getText();
				
				Almacen.listaPokemon.add(new Pokemon(numero, nombre, tipo1, tipo2, peso, altura, categoria, habilidad));
				
				frmEditarPokemon.dispose();
				padre.setVisible(true);
			}
		});

	}
}
