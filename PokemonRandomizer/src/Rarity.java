package PokemonTabletopRandomizer.PokemonRandomizer.src;

/**
 * Created by zefal on 11/28/2016.
 */
public enum Rarity {

    SuperCommon(128), Common(64), Uncommon(32), Rare(16), Starter(8), Pseudo(4), Legend(1);

    Rarity(int range){
        this.range = range;
    }

    int range;
    public static int RarityCount = 7;  //Number of rarities allowed.

}
