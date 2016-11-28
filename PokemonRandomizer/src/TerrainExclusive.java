/**
 * Created by Evelyn Moss on 11/17/2016.
 */
package PokemonTabletopRandomizer.PokemonRandomizer.src;

public class TerrainExclusive {

	Terrain terrain;
	Pokemon exclusive;

	public TerrainExclusive(Terrain t, Pokemon pokemon){
		terrain = t;
		exclusive = pokemon;
	}

	public Terrain getTerrain(){
		return terrain;
	}

	public Pokemon getPokemon(){
		return  exclusive;
	}
}
