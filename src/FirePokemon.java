public class FirePokemon extends Pokemon  {
    private String type = "ElectricPokemon";

    public FirePokemon(String food, int hp, int level, String name, String sound) {
        super(food, hp, level, name, sound);
        this.setType("FirePokemon");
    }

}
