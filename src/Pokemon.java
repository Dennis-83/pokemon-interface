import java.util.List;

public abstract class Pokemon {

    private String name;
    private int level;
    private int hp;
    private String sound;
    private String food;
    private String type;

    public Pokemon(String name, int hp, int level, String food, String sound) {
        this.food = name;
        this.hp = hp;
        this.level = level;
        this.name = name;
        this.sound = sound;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    abstract List<String> getAttacks();


    public void determineDmgOutput(String type, Pokemon enemy) {
        switch (type) {
            case "fire":
                fireDmgOutput(enemy);
                break;
            case "water":
                waterDmgOutput(enemy);
                break;
            case "electric":
                electricDmgOutput(enemy);
                break;
            case "grass":
                grassDmgOutput(enemy);
                break;
        }
    }

    public void electricDmgOutput(Pokemon enemy) {
        switch (enemy.getType()) {
            case "water":
                enemy.setHp(enemy.getHp()-20);
                System.out.println(enemy.getName() + " loses 20 hp");
                System.out.println(enemy.getName() + " has " + enemy.getHp() + " left");
                break;
            case "grass":
                enemy.setHp(enemy.getHp()-15);
                System.out.println(enemy.getName() + " loses 15 hp");
                System.out.println(enemy.getName() + " has " + enemy.getHp() + " left");
                break;
            case "fire":
                enemy.setHp(enemy.getHp()-10);
                System.out.println(enemy.getName() + " loses 10 hp");
                System.out.println(enemy.getName() + " has " + enemy.getHp() + " left");
                break;
            default:
                enemy.setHp(enemy.getHp()-5);
                System.out.println(enemy.getName() + " loses 5 hp");
                System.out.println(enemy.getName() + " has " + enemy.getHp() + " left");
        }
    }

    public void waterDmgOutput(Pokemon enemy) {
        switch (enemy.getType()) {
            case "fire":
                enemy.setHp(enemy.getHp()-20);
                System.out.println(enemy.getName() + " loses 20 hp");
                System.out.println(enemy.getName() + " has " + enemy.getHp() + " left");
                break;
            case "electric":
                enemy.setHp(enemy.getHp()-15);
                System.out.println(enemy.getName() + " loses 15 hp");
                System.out.println(enemy.getName() + " has " + enemy.getHp() + " left");
                break;
            case "grass":
                enemy.setHp(enemy.getHp()-10);
                System.out.println(enemy.getName() + " loses 10 hp");
                System.out.println(enemy.getName() + " has " + enemy.getHp() + " left");
                break;
            default:
                enemy.setHp(enemy.getHp()-5);
                System.out.println(enemy.getName() + " loses 5 hp");
                System.out.println(enemy.getName() + " has " + enemy.getHp() + " left");
        }
    }

    public void fireDmgOutput(Pokemon enemy) {
        switch (enemy.getType()) {
            case "grass":
                enemy.setHp(enemy.getHp()-20);
                System.out.println(enemy.getName() + " loses 20 hp");
                System.out.println(enemy.getName() + " has " + enemy.getHp() + " left");
                break;
            case "water":
                enemy.setHp(enemy.getHp()-15);
                System.out.println(enemy.getName() + " loses 15 hp");
                System.out.println(enemy.getName() + " has " + enemy.getHp() + " left");
                break;
            case "electric":
                enemy.setHp(enemy.getHp()-10);
                System.out.println(enemy.getName() + " loses 10 hp");
                System.out.println(enemy.getName() + " has " + enemy.getHp() + " left");
                break;
            default:
                enemy.setHp(enemy.getHp()-5);
                System.out.println(enemy.getName() + " loses 5 hp");
                System.out.println(enemy.getName() + " has " + enemy.getHp() + " left");
        }
    }

    public void grassDmgOutput(Pokemon enemy) {
        switch (enemy.getType()) {
            case "electric":
                enemy.setHp(enemy.getHp()-20);
                System.out.println(enemy.getName() + " loses 20 hp");
                System.out.println(enemy.getName() + " has " + enemy.getHp() + " left");
                break;
            case "fire":
                enemy.setHp(enemy.getHp()-15);
                System.out.println(enemy.getName() + " loses 15 hp");
                System.out.println(enemy.getName() + " has " + enemy.getHp() + " left");
                break;
            case "water":
                enemy.setHp(enemy.getHp()-10);
                System.out.println(enemy.getName() + " loses 10 hp");
                System.out.println(enemy.getName() + " has " + enemy.getHp() + " left");
                break;
            default:
                enemy.setHp(enemy.getHp()-5);
                System.out.println(enemy.getName() + " loses 5 hp");
                System.out.println(enemy.getName() + " has " + enemy.getHp() + " left");
        }
    }

}
