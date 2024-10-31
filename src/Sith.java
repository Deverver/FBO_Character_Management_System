public class Sith extends Character {


    @Override
    protected void action() {
        System.out.println("Sith " + this.getCharacterName() + " uses the Force for evil");
    }


    //region Constructors
    public Sith() {
    }

    public Sith(String characterName, int characterAge) {
        super(characterName, characterAge);
    }
    //endregion


}
