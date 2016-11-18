/**
 * Created by Evelyn Moss on 11/17/2016.
 */
import java.util.HashMap;
import java.util.concurrent.ThreadLocalRandom;

public enum Terrain {

	GRASSLAND (6493),
	HILLS (6792),
	RIVER (1824),
	JUNGLE (5882),
	FIRE_HILLS (4043),
	SCRUBLAND (6694),
	DESERT (4914),
	OASIS (2711),
	URBAN (4997),
	MOUNTAIN (4198),
	COLD (2063),
	COAST (2104),
	OCEAN (1577),
	ROCKY_COAST (1377);

	Terrain(int maxRoll){
		numPokemon = maxRoll;
	}

	int numPokemon;

	public static Pokemon rollWild(Terrain t){
		int roll = ThreadLocalRandom.current().nextInt(1, t.numPokemon+1);
		return Pokedex.getPokemon(t, roll);
	}

}
