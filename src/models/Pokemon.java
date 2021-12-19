package models;

import enums.Tipo;

public class Pokemon {

	private int numero;
	private String nombre;
	private Tipo tipo1;
	private Tipo tipo2;
	private String categoria;
	private double altura;
	private double peso;
	private String habilidad;
	
	public Pokemon(int numero, String nombre, Tipo tipo1, Tipo tipo2, String categoria, double altura,
			double peso, String habilidad) {
		super();
		this.numero = numero;
		this.nombre = nombre;
		this.tipo1 = tipo1;
		this.tipo2 = tipo2;
		this.categoria = categoria;
		this.altura = altura;
		this.peso = peso;
		this.habilidad = habilidad;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Tipo getTipo1() {
		return tipo1;
	}

	public void setTipo1(Tipo tipo1) {
		this.tipo1 = tipo1;
	}

	public Tipo getTipo2() {
		return tipo2;
	}

	public void setTipo2(Tipo tipo2) {
		this.tipo2 = tipo2;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public String getHabilidad() {
		return habilidad;
	}

	public void setHabilidad(String habilidad) {
		this.habilidad = habilidad;
	}

	@Override
	public String toString() {
		return "Pokemon [numero=" + numero + ", nombre=" + nombre + ", tipo1=" + tipo1 + ", tipo2=" + tipo2
				+ ", categoria=" + categoria + ", altura=" + altura + ", peso=" + peso
				+ ", habilidad=" + habilidad + "]";
	}

}
