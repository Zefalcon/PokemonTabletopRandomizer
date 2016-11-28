package PokemonTabletopRandomizer.PokemonRandomizer.src;
/**
 * Created by Evelyn Moss on 11/17/2016.
 */
public class IntegerRange {

	int min;
	int max;

	public IntegerRange(int minimum, int maximum){
		min = minimum;
		max = maximum;
	}

	public int getMin(){
		return min;
	}

	public int getMax(){
		return max;
	}
}
