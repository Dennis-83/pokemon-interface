import java.util.Arrays;
import java.util.List;

public class WaterPokemon extends Pokemon  {
    private String type = "water";
    List<String> attacks = Arrays.asList("surf", "hydroPump", "hydroCanon", "rainDance");

    public WaterPokemon(String food, int hp, int level, String name, String sound) {
        super(food, hp, level, name, sound);
        this.setType(type);
    }

    @Override
    List<String> getAttacks() {
        return attacks;
    }

    void surf(Pokemon name, Pokemon enemy) {}

    void hydroPump(Pokemon name, Pokemon enemy) {}

    void hydroCanon(Pokemon name, Pokemon enemy){}

    void rainDance(Pokemon name, Pokemon enemy){}

}
