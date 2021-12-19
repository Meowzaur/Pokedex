package mainapp;

import enums.Tipo;
import models.Pokemon;
import models.Usuario;
import ui.LoginView;
import utils.Almacen;

public class MainApp {

	public static void main(String[] args) {
		
		Almacen.listaPokemon.add(new Pokemon(1, "Bulbasaur", Tipo.Planta, Tipo.Veneno, "Semilla", 0.7, 6.9, "Espesura"));
		Almacen.listaPokemon.add(new Pokemon(2, "Ivysaur", Tipo.Planta, Tipo.Veneno, "Semilla", 1, 13, "Espesura"));
		Almacen.listaPokemon.add(new Pokemon(3, "Venusaur", Tipo.Planta, Tipo.Veneno, "Semilla", 2, 100, "Espesura"));
		Almacen.listaPokemon.add(new Pokemon(4, "Charmander", Tipo.Fuego, Tipo.Nulo, "Lagartija", 0.6, 8.5, "Mar Llamas"));
		Almacen.listaPokemon.add(new Pokemon(5, "Charmeleon", Tipo.Fuego, Tipo.Nulo, "Llama", 1.1, 19, "Mar Llamas"));
		Almacen.listaPokemon.add(new Pokemon(6, "Charizard", Tipo.Fuego, Tipo.Volador, "Llama", 1.7, 90.5, "Mar Llamas"));
		Almacen.listaPokemon.add(new Pokemon(7, "Squirtle", Tipo.Agua, Tipo.Nulo, "Tortuguita", 0.5, 9, "Torrente"));
		Almacen.listaPokemon.add(new Pokemon(8, "Wartortle", Tipo.Agua, Tipo.Nulo, "Tortuga", 1, 22.5, "Torrente"));
		Almacen.listaPokemon.add(new Pokemon(9, "Blastoise", Tipo.Agua, Tipo.Nulo, "Armazon", 1.6, 85.5, "Torrente"));
		
		Almacen.listaUsuario.add(new Usuario("Jose","pollo"));
		Almacen.listaUsuario.add(new Usuario("Pablo","casa"));
		
		new LoginView();

	}

}
