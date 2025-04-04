public class ElectricPokemon extends Pokemon  {
    private String type = "ElectricPokemon";

    public ElectricPokemon(String food, int hp, int level, String name, String sound) {
        super(food, hp, level, name, sound);
        this.setType(type);
    }

}
