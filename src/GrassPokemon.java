import java.util.Arrays;
import java.util.List;

public class GrassPokemon extends Pokemon  {
    private String type = "grass";
    List<String> attacks = Arrays.asList("leafStorm", "leechSeed", "leaveBlade", "solarBeam");


    public GrassPokemon(String food, int hp, int level, String name, String sound) {
        super(food, hp, level, name, sound);
        this.setType(type);
    }

    @Override
    List<String> getAttacks() {
        return attacks;
    }

    public void leafStorm(Pokemon name, Pokemon enemy) {}

    public void leechSeed(Pokemon name, Pokemon enemy) {}

    public void leaveBlade(Pokemon name, Pokemon enemy) {}

    public void solarBeam(Pokemon name, Pokemon enemy) {}

}
