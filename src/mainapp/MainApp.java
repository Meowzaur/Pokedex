package mainapp;

import enums.Tipo;
import models.Pokemon;
import models.Usuario;
import ui.LoginView;
import utils.Almacen;

public class MainApp {

	public static void main(String[] args) {
		
		Almacen.listaPokemon.add(new Pokemon(1, "Bulbasaur", Tipo.Planta, Tipo.Veneno, 0.7, 6.9, "Semilla", "Espesura"));
		Almacen.listaPokemon.add(new Pokemon(2, "Ivysaur", Tipo.Planta, Tipo.Veneno, 1, 13, "Semilla", "Espesura"));
		Almacen.listaPokemon.add(new Pokemon(3, "Venusaur", Tipo.Planta, Tipo.Veneno, 2, 100, "Semilla", "Espesura"));
		Almacen.listaPokemon.add(new Pokemon(4, "Charmander", Tipo.Fuego, Tipo.Nulo, 0.6, 8.5, "Lagartija", "Mar Llamas"));
		Almacen.listaPokemon.add(new Pokemon(5, "Charmeleon", Tipo.Fuego, Tipo.Nulo, 1.1, 19, "Llama", "Mar Llamas"));
		Almacen.listaPokemon.add(new Pokemon(6, "Charizard", Tipo.Fuego, Tipo.Volador, 1.7, 90.5, "Llama", "Mar Llamas"));
		Almacen.listaPokemon.add(new Pokemon(7, "Squirtle", Tipo.Agua, Tipo.Nulo, 0.5, 9, "Tortuguita", "Torrente"));
		Almacen.listaPokemon.add(new Pokemon(8, "Wartortle", Tipo.Agua, Tipo.Nulo, 1, 22.5, "Tortuga", "Torrente"));
		Almacen.listaPokemon.add(new Pokemon(9, "Blastoise", Tipo.Agua, Tipo.Nulo, 1.6, 85.5, "Armazon", "Torrente"));
		
		Almacen.listaUsuario.add(new Usuario("Jose","pollo"));
		Almacen.listaUsuario.add(new Usuario("Pablo","casa"));
		
		new LoginView();

	}

}