/**
 * Created by Evelyn Moss on 11/17/2016.
 */
package PokemonTabletopRandomizer.PokemonRandomizer.src;
import java.util.Map;

public class Pokemon {

	String name;
	int firstEvolution;
	int secondEvolution;

	public Pokemon(String name, int first, int second){
		this.name = name;
		firstEvolution = first;
		secondEvolution = second;
	}

	public String toString(){
		return name;
	}

	public int getStage(int level){
		if(level>secondEvolution){
			return 3;
		}
		else if(level>firstEvolution){
			return 2;
		}
		else{
			return 1;
		}
	}
}
