public class WaterPokemon extends Pokemon  {
    private String type = "ElectricPokemon";

    public WaterPokemon(String food, int hp, int level, String name, String sound) {
        super(food, hp, level, name, sound);
        this.setType("WaterPokemon");
    }

}
