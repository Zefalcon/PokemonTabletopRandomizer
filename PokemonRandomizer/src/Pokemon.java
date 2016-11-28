/**
 * Created by Evelyn Moss on 11/17/2016.
 */
package PokemonTabletopRandomizer.PokemonRandomizer.src;
import java.util.Map;

public class Pokemon {

	String name;
	int firstEvolution;
	int secondEvolution;
	Rarity rarity;
	boolean isSpecial = false;

	public Pokemon(String name, int first, int second, Rarity rare){
		this.name = name;
		firstEvolution = first;
		secondEvolution = second;
		rarity = rare;
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

	public Rarity getRarity(){
		return rarity;
	}

	public boolean isSpecial(){
		return isSpecial;
	}

	public void markSpecial(){
		isSpecial = true;
	}

	public String details(int level){
		StringBuilder b = new StringBuilder();
		b.append(name + ": ");
		b.append("Stage " + getStage(level));
		b.append("Is Special?: " + isSpecial);
		return b.toString();
	}
}
