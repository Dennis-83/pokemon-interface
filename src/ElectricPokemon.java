import java.util.Arrays;
import java.util.List;

public class ElectricPokemon extends Pokemon {
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
        System.out.println(name.getName() + " attacks " + enemy.getName() + " with thunderPunch");
        determineDmgOutput(type, enemy);
    }

    void electroBall(Pokemon name, Pokemon enemy) {
        System.out.println(name.getName() + " attacks " + enemy.getName() + " with electroBall");
        determineDmgOutput(type, enemy);
    }


    void thunder(Pokemon name, Pokemon enemy) {
        name.setHp(name.getHp() + 10);
        System.out.println(name.getName() + " receives an hp boost");
        System.out.println(name.getName() + " now has " + name.getHp() + " hp");
        System.out.println(name.getName() + " attacks " + enemy.getName() + " with thunder");
        determineDmgOutput(type, enemy);
    }

    void voltTackle(Pokemon name, Pokemon enemy) {
        System.out.println(name.getName() + " attacks " + enemy.getName() + " with voltTackle");
        determineDmgOutput(type, enemy);
    }
}
