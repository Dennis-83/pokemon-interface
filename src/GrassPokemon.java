public class GrassPokemon extends Pokemon  {
    private String type = "ElectricPokemon";

    public GrassPokemon(String food, int hp, int level, String name, String sound) {
        super(food, hp, level, name, sound);
        this.setType("GrassPokemon");
    }

}
