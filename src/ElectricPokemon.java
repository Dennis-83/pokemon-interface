import java.util.Arrays;
import java.util.List;

public class ElectricPokemon extends Pokemon  {
    private String type = "electric";
    List<String> attacks = Arrays.asList("thunderPunch", "electroBall", "thunder", "voltTackle");

    public ElectricPokemon(String food, int hp, int level, String name, String sound) {
        super(food, hp, level, name, sound);
        this.setType(type);
    }

    @Override
    List<String> getAttacks() {
        return attacks;
    }

    void thunderPunch(Pokemon name, Pokemon enemy) {

    }

    void electroBall(Pokemon name, Pokemon enemy) {
    }

    void thunder(Pokemon name, Pokemon enemy){

    }

    void voltTackle(Pokemon name, Pokemon enemy){

    }

}
