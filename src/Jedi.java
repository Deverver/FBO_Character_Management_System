public class Jedi extends Character {


    @Override
    protected void action() {
        System.out.println("Jedi " + this.getCharacterName() + " uses the Force for good");
    }

    //region Constructors
    public Jedi() {
    }

    public Jedi(String characterName, int characterAge) {
        super(characterName, characterAge);
    }
    //endregion


}
