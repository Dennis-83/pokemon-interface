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

    public void leafStorm(Pokemon name, Pokemon enemy) {
        System.out.println(name.getName() + " attacks " + enemy.getName() + " with leafStorm");
        determineDmgOutput(type, enemy);
    }

    public void leechSeed(Pokemon name, Pokemon enemy) {
        System.out.println(name.getName() + " attacks " + enemy.getName() + " with leechSeed");
        switch (enemy.getType()) {
            case "electric":
                enemy.setHp(enemy.getHp()-20);
                System.out.println(enemy.getName() + " loses 20 hp");
                System.out.println(enemy.getName() + " has " + enemy.getHp() + " left");
                System.out.println(name.getName() + " leeches 20 hp");
                name.setHp(name.getHp()+ 20);
                System.out.println(name.getName() + " now has " + name.getHp() + " left");
                break;
            case "fire":
                enemy.setHp(enemy.getHp()-15);
                System.out.println(enemy.getName() + " loses 15 hp");
                System.out.println(enemy.getName() + " has " + enemy.getHp() + " left");
                System.out.println(name.getName() + " leeches 15 hp");
                name.setHp(name.getHp()+ 15);
                System.out.println(name.getName() + " now has " + name.getHp() + " left");
                break;
            case "water":
                enemy.setHp(enemy.getHp()-10);
                System.out.println(enemy.getName() + " loses 10 hp");
                System.out.println(enemy.getName() + " has " + enemy.getHp() + " left");
                System.out.println(name.getName() + " leeches 10 hp");
                name.setHp(name.getHp()+ 10);
                System.out.println(name.getName() + " now has " + name.getHp() + " left");
                break;
            default:
                enemy.setHp(enemy.getHp()-5);
                System.out.println(enemy.getName() + " loses 5 hp");
                System.out.println(enemy.getName() + " has " + enemy.getHp() + " left");
                System.out.println(name.getName() + " leeches 5 hp");
                name.setHp(name.getHp()+ 5);
                System.out.println(name.getName() + " now has " + name.getHp() + " left");
        }
    }

    public void leaveBlade(Pokemon name, Pokemon enemy) {
        System.out.println(name.getName() + " attacks " + enemy.getName() + " with leaveBlade");
        determineDmgOutput(type, enemy);
    }

    public void solarBeam(Pokemon name, Pokemon enemy) {
        System.out.println(name.getName() + " attacks " + enemy.getName() + " with solarBeam");
        determineDmgOutput(type, enemy);
    }

}
