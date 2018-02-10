package com.novaxs.pokemon.database;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

import com.google.gson.Gson;

public class ImportFileApp {

	/**
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {
		Gson gson = new Gson();
		String stringPokemons = read("pokedex.json");
		Map<?,?> file = gson.fromJson(stringPokemons, Map.class);

		List<?> pks = (List<?>) file.get("pokemon");
		System.out.println(pks.size() + " pokemons para importar.");
		PokemonRepositorio repositorio = new PokemonRepositorio();
		for (Object object : pks) {
			String json = gson.toJson(object);
			Pokemon pokemon = gson.fromJson(json, Pokemon.class);
			repositorio.add(pokemon);
		}
		
		System.out.println(pks.size() + " pokemons importados.");
	}

	public static String read(String filePath) throws IOException {
		return new String(Files.readAllBytes(Paths.get(filePath)), StandardCharsets.UTF_8);
	}

}
