
/**
 * Created by Evelyn Moss on 11/17/2016.
 */
package PokemonTabletopRandomizer.PokemonRandomizer.src;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Pokedex {

	static int NONE = Integer.MAX_VALUE;

	static ArrayList<TerrainExclusive> specials;

	public Pokedex(){
		Pokemon Caterpie = new Pokemon("Caterpie", 5, 10, Rarity.SuperCommon);
		Pokemon Pidgey = new Pokemon("Pidgey", 15, 30, Rarity.SuperCommon);
		Pokemon Rattata = new Pokemon("Rattata", 20, NONE, Rarity.SuperCommon);
		Pokemon Zubat = new Pokemon("Zubat", 20, 30, Rarity.SuperCommon);
		Pokemon Tentacool = new Pokemon("Tentacool", 25, NONE, Rarity.SuperCommon);
		Pokemon Goldeen = new Pokemon("Goldeen", 30, NONE, Rarity.SuperCommon);
		Pokemon Hoothoot = new Pokemon("Hoothoot", 20, NONE, Rarity.SuperCommon);
		Pokemon Weedle = new Pokemon("Weedle", 5, 10, Rarity.SuperCommon);
		Pokemon Magikarp = new Pokemon("Magikarp", 20, NONE, Rarity.SuperCommon);
		Pokemon Sentret = new Pokemon("Sentret", 15, NONE, Rarity.SuperCommon);
		Pokemon Spinarak = new Pokemon("Spinarak", 20, NONE, Rarity.SuperCommon);
		Pokemon Hoppip = new Pokemon("Hoppip", 15, 30, Rarity.SuperCommon);
		Pokemon Poochyena = new Pokemon("Poochyena", 15, NONE, Rarity.SuperCommon);
		Pokemon Cleffa = new Pokemon("Cleffa", 10, 20, Rarity.Common);
		Pokemon Bidoof = new Pokemon("Bidoof", 15, NONE, Rarity.SuperCommon);
		Pokemon Wingull = new Pokemon("Wingull", 25, NONE, Rarity.SuperCommon);
		Pokemon Taillow = new Pokemon("Taillow", 20, NONE, Rarity.SuperCommon);
		Pokemon Sunkern = new Pokemon("Sunkern", 20, NONE, Rarity.SuperCommon);
		Pokemon Geodude = new Pokemon("Geodude", 25, 35, Rarity.Common);
		Pokemon Natu = new Pokemon("Natu", 25, NONE, Rarity.Common);
		Pokemon Psyduck = new Pokemon("Psyduck", 30, NONE, Rarity.Common);
		Pokemon Basculin = new Pokemon("Basculin", NONE, NONE, Rarity.SuperCommon);
		Pokemon Starly = new Pokemon("Starly", 15, 30, Rarity.SuperCommon);
		Pokemon Luvdisc = new Pokemon("Luvdisc", NONE, NONE, Rarity.SuperCommon);
		Pokemon Budew = new Pokemon("Budew", 20, 30, Rarity.SuperCommon);
		Pokemon Mareep = new Pokemon("Mareep", 15, 30, Rarity.Common);
		Pokemon Teddiursa = new Pokemon("Teddiursa", 30, NONE, Rarity.Common);
		Pokemon Slowpoke = new Pokemon("Slowpoke", 35, NONE, Rarity.Common);
		Pokemon Ducklett = new Pokemon("Ducklett", 35, NONE, Rarity.SuperCommon);
		Pokemon Finneon = new Pokemon("Finneon", 30, NONE, Rarity.SuperCommon);
		Pokemon Burmy = new Pokemon("Burmy", 20, NONE, Rarity.SuperCommon);
		Pokemon Ledyba = new Pokemon("Ledyba", 15, NONE, Rarity.SuperCommon);
		Pokemon Zigzagoon = new Pokemon("Zigzagoon", 15, NONE, Rarity.SuperCommon);
		Pokemon Aron = new Pokemon("Aron", 30, 40, Rarity.Common);
		Pokemon Krabby = new Pokemon("Krabby", 25, NONE, Rarity.Common);
		Pokemon Buizel = new Pokemon("Buizel", 25, NONE, Rarity.Common);
		Pokemon Meditite = new Pokemon("Meditite", 35, NONE, Rarity.Common);
		Pokemon Ekans = new Pokemon("Ekans", 20, NONE, Rarity.Common);
		Pokemon Spearow = new Pokemon("Spearow", 20, NONE, Rarity.Common);
		Pokemon Shellos = new Pokemon("Shellos", 30, NONE, Rarity.Common);
		Pokemon Pachirisu = new Pokemon("Pachirisu", NONE, NONE, Rarity.Common);
		Pokemon Sandshrew = new Pokemon("Sandshrew", 20, NONE, Rarity.Common);
		Pokemon Roggenrola = new Pokemon("Roggenrola", 25, 40, Rarity.Common);
		Pokemon Seel = new Pokemon("Seel", 30, NONE, Rarity.Common);
		Pokemon Poliwag = new Pokemon("Poliwag", 25, 30, Rarity.Common);
		Pokemon Purrloin = new Pokemon("Purrloin", 20, NONE, Rarity.SuperCommon);
		Pokemon Wurmple = new Pokemon("Wurmple", 5, 10, Rarity.SuperCommon);
		Pokemon Dwebble = new Pokemon("Dwebble", 30, NONE, Rarity.Common);
		Pokemon Buneary = new Pokemon("Buneary", 10, NONE, Rarity.Common);
		Pokemon Paras = new Pokemon("Paras", 20, NONE, Rarity.Common);
		Pokemon Shellder = new Pokemon("Shellder", 30, NONE, Rarity.Uncommon);
		Pokemon Horsea = new Pokemon("Horsea", 30, 40, Rarity.Common);
		Pokemon Diglett = new Pokemon("Diglett", 25, NONE, Rarity.Common);
		Pokemon Scatterbug = new Pokemon("Scatterbug", 5, 10, Rarity.SuperCommon);
		Pokemon Tyrogue = new Pokemon("Tyrogue", 20, NONE, Rarity.Uncommon);
		Pokemon Yanma = new Pokemon("Yanma", 30, NONE, Rarity.Uncommon);
		Pokemon Woobat = new Pokemon("Woobat", 20, NONE, Rarity.Common);
		Pokemon Remoraid = new Pokemon("Remoraid", 25, NONE, Rarity.Common);
		Pokemon Azurill = new Pokemon("Azurill", 10, 20, Rarity.Common);
		Pokemon Mankey = new Pokemon("Mankey", 25, NONE, Rarity.Common);
		Pokemon Girafarig = new Pokemon("Girafarig", NONE, NONE, Rarity.Uncommon);

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
	}

	public static Pokemon getPokemon(Terrain t, Rarity r, int index){
		//Searches for Pokemon at index for specified Rarity r in Terrain t.
		//When found, return Pokemon associated.
		Pokemon toReturn;
		//TODO: Get list of Pokemon in t with rarity r
		//TODO: Check special list for Pokemon and terrain
		//toReturn.markSpecial();  //TODO: FLAG
		return null;

	}

	public static void main(String[] args){
		//User inputs Terrain(s) desired, number of Pokemon, and level (only supports one level).
		Scanner s = new Scanner(System.in);
		System.out.println("Enter 1 or more Terrain types, separated by spaces");
		ArrayList<Terrain> terrains = new ArrayList<>();
		while(s.hasNext()){
			//Parse Terrains
			String toParse = s.next();
			for(Terrain t: Terrain.values()){
				if(toParse.equals(t.name())){ //Doesn't check if Terrain in list so user can manually alter terrain weights
					terrains.add(t);
				}
			}
		}
		//Prints out that many Pokemon.
		if(args.length < 2){ //Needs 1 Terrain and a level
			System.out.println("Please try again with more arguments.  Requires at least 1 Terrain and a level.");
		}
		else if(args.length > 2){ //User has either input more than one terrain

		}
	}
}
