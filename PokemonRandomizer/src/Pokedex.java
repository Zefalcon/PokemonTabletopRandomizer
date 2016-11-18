/**
 * Created by Evelyn Moss on 11/17/2016.
 */
import java.util.ArrayList;
import java.util.HashMap;

public class Pokedex {

	static int NONE = Integer.MAX_VALUE;

	//static HashMap<TerrainIndex, Pokemon> terrainMap; //???
	static ArrayList<TerrainExclusive> specials;

	public Pokedex(){
		Pokemon Caterpie = new Pokemon("Caterpie", 5, 10);
		Pokemon Pidgey = new Pokemon("Pidgey", 15, 30);
		Pokemon Rattata = new Pokemon("Rattata", 20, NONE);
		Pokemon Zubat = new Pokemon("Zubat", 20, 30);
		Pokemon Tentacool = new Pokemon("Tentacool", 25, NONE);
		Pokemon Goldeen = new Pokemon("Goldeen", 30, NONE);
		Pokemon Hoothoot = new Pokemon("Hoothoot", 20, NONE);
		Pokemon Weedle = new Pokemon("Weedle", 5, 10);
		Pokemon Magikarp = new Pokemon("Magikarp", 20, NONE);
		Pokemon Sentret = new Pokemon("Sentret", 15, NONE);
		Pokemon Spinarak = new Pokemon("Spinarak", 20, NONE);
		Pokemon Hoppip = new Pokemon("Hoppip", 15, 30);
		Pokemon Poochyena = new Pokemon("Poochyena", 15, NONE);
		Pokemon Cleffa = new Pokemon("Cleffa", 10, 20);
		Pokemon Bidoof = new Pokemon("Bidoof", 15, NONE);
		Pokemon Wingull = new Pokemon("Wingull", 25, NONE);
		Pokemon Taillow = new Pokemon("Taillow", 20, NONE);
		Pokemon Sunkern = new Pokemon("Sunkern", 20, NONE);
		Pokemon Geodude = new Pokemon("Geodude", 25, 35);
		Pokemon Natu = new Pokemon("Natu", 25, NONE);
		Pokemon Psyduck = new Pokemon("Psyduck", 30, NONE);
		Pokemon Basculin = new Pokemon("Basculin", NONE, NONE);
		Pokemon Starly = new Pokemon("Starly", 15, 30);
		Pokemon Luvdisc = new Pokemon("Luvdisc", NONE, NONE);
		Pokemon Budew = new Pokemon("Budew", 20, 30);
		Pokemon Mareep = new Pokemon("Mareep", 15, 30);
		Pokemon Teddiursa = new Pokemon("Teddiursa", 30, NONE);
		Pokemon Slowpoke = new Pokemon("Slowpoke", 35, NONE);
		Pokemon Ducklett = new Pokemon("Ducklett", 35, NONE);
		Pokemon Finneon = new Pokemon("Finneon", 30, NONE);
		Pokemon Burmy = new Pokemon("Burmy", 20, NONE);
		Pokemon Ledyba = new Pokemon("Ledyba", 15, NONE);
		Pokemon Zigzagoon = new Pokemon("Zigzagoon", 15, NONE);
		Pokemon Aron = new Pokemon("Aron", 30, 40);
		Pokemon Krabby = new Pokemon("Krabby", 25, NONE);
		Pokemon Buizel = new Pokemon("Buizel", 25, NONE);
		Pokemon Meditite = new Pokemon("Meditite", 35, NONE);
		Pokemon Ekans = new Pokemon("Ekans", 20, NONE);
		Pokemon Spearow = new Pokemon("Spearow", 20, NONE);
		Pokemon Shellos = new Pokemon("Shellos", 30, NONE);
		Pokemon Pachirisu = new Pokemon("Pachirisu", NONE, NONE);
		Pokemon Sandshrew = new Pokemon("Sandshrew", 20, NONE);
		Pokemon Roggenrola = new Pokemon("Roggenrola", 25, 40);
		Pokemon Seel = new Pokemon("Seel", 30, NONE);
		Pokemon Poliwag = new Pokemon("Poliwag", 25, 30);
		Pokemon Purrloin = new Pokemon("Purrloin", 20, NONE);
		Pokemon Wurmple = new Pokemon("Wurmple", 5, 10);
		Pokemon Dwebble = new Pokemon("Dwebble", 30, NONE);
		Pokemon Buneary = new Pokemon("Buneary", 10, NONE);
		Pokemon Paras = new Pokemon("Paras", 20, NONE);
		Pokemon Shellder = new Pokemon("Shellder", 30, NONE);
		Pokemon Horsea = new Pokemon("Horsea", 30, 40);
		Pokemon Diglett = new Pokemon("Diglett", 25, NONE);
		Pokemon Scatterbug = new Pokemon("Scatterbug", 5, 10);
		Pokemon Tyrogue = new Pokemon("Tyrogue", 20, NONE);
		Pokemon Yanma = new Pokemon("Yanma", 30, NONE);
		Pokemon Woobat = new Pokemon("Woobat", 20, NONE);
		Pokemon Remoraid = new Pokemon("Remoraid", 25, NONE);
		Pokemon Azurill = new Pokemon("Azurill", 10, 20);
		Pokemon Mankey = new Pokemon("Mankey", 25, NONE);
		Pokemon Girafarig = new Pokemon("Girafarig", NONE, NONE);

		//Special Pokemon
		specials.add(new TerrainExclusive(Terrain.FIRE_HILLS, Hoppip));
		specials.add(new TerrainExclusive(Terrain.DESERT, Hoothoot));
		specials.add(new TerrainExclusive(Terrain.COLD, Mareep));
		specials.add(new TerrainExclusive(Terrain.DESERT, Poochyena));
		specials.add(new TerrainExclusive(Terrain.RIVER, Ekans));
		specials.add(new TerrainExclusive(Terrain.DESERT, Taillow));
		specials.add(new TerrainExclusive(Terrain.COLD, Pachirisu));
		specials.add(new TerrainExclusive(Terrain.DESERT, Starly));
		specials.add(new TerrainExclusive(Terrain.COLD, Buneary));
		specials.add(new TerrainExclusive(Terrain.FIRE_HILLS, Burmy));
		specials.add(new TerrainExclusive(Terrain.DESERT, Burmy));

		//Range 1-128
		IntegerRange first = new IntegerRange(1, 128);

		//Range 129-256
		IntegerRange second = new IntegerRange(129, 256);
	}

	public static Pokemon getPokemon(Terrain t, int index){
		//Search ranges within Terrain for index.
		//When found, return Pokemon associated.
		return null;

	}
}
