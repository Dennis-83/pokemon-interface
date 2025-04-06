import java.util.Arrays;
import java.util.List;

public class FirePokemon extends Pokemon  {
    private String type = "fire";
    List<String> attacks = Arrays.asList("fireLash", "flameThrower", "pyroBall", "inferno");

    public FirePokemon(String food, int hp, int level, String name, String sound) {
        super(food, hp, level, name, sound);
        this.setType(type);
    }

    @Override
    List<String> getAttacks() {
        return attacks;
    }

    void fireLash(Pokemon name, Pokemon enemy){}

    void flameThrower(Pokemon name, Pokemon enemy){}

    void pyroBall(Pokemon name, Pokemon enemy){}

    void inferno(Pokemon name, Pokemon enemy){}


}
