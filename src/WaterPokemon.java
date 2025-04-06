import java.util.Arrays;
import java.util.List;

public class WaterPokemon extends Pokemon {
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

    void surf(Pokemon name, Pokemon enemy) {
        System.out.println(name.getName() + " attacks " + enemy.getName() + " with surf");
        determineDmgOutput(type, enemy);
    }

    void hydroPump(Pokemon name, Pokemon enemy) {
        System.out.println(name.getName() + " attacks " + enemy.getName() + " with hydroPump");
        determineDmgOutput(type, enemy);
    }

    void hydroCanon(Pokemon name, Pokemon enemy) {
        System.out.println(name.getName() + " attacks " + enemy.getName() + " with hydroCanon");
        determineDmgOutput(type, enemy);
    }

    void rainDance(Pokemon name, Pokemon enemy) {
        if (enemy.getType() == "grass") {
            enemy.setHp(enemy.getHp() + 10);
            System.out.println("rainDance boosted " + enemy.getName() + " 's hp by 10");
            System.out.println(enemy.getName() + " now has " + enemy.getHp() + " hp");
        }

        if (enemy.getType() == "electric") {
            System.out.println("has no effect on " + enemy.getName());
        } else {
            System.out.println(name.getName() + " attacks " + enemy.getName() + " with rainDance");
            determineDmgOutput(type, enemy);
        }
    }
}
