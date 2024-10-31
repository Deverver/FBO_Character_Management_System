public class Droid extends Character {

    @Override
    protected void action() {
        System.out.println("Droid " + this.getCharacterName() + " is unable to use the Force");
    }


    //region Constructors
    public Droid() {
    }

    public Droid(String characterName, int characterAge) {
        super(characterName, characterAge);
    }
    //endregion


}
