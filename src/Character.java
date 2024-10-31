abstract class Character {

    private String characterName;
    private int characterAge;


    protected void action() {
        System.out.println("Character does an action");
    }

    final void infoPrinter() {
        System.out.println("This character is called: " + this.getCharacterName());
        System.out.println("This character is " + this.getCharacterAge() + " years old");
    }

    final void showInfo() {
        if (this instanceof Jedi) {
            infoPrinter();
            System.out.println("They are a part of the Jedi order");
        }
        if (this instanceof Sith) {
            infoPrinter();
            System.out.println("They are a member of the Sith");
        }
        if (this instanceof Droid) {
            infoPrinter();
            System.out.println("They are a machine used by The Empire");
        }
    }

    //region Constructors
    public Character() {
    }

    public Character(String characterName, int characterAge) {
        this.characterName = characterName;
        this.characterAge = characterAge;
    }
    //endregion

    //region Gets and Sets
    public String getCharacterName() {
        return characterName;
    }

    public void setCharacterName(String characterName) {
        this.characterName = characterName;
    }

    public int getCharacterAge() {
        return characterAge;
    }

    public void setCharacterAge(int characterAge) {
        this.characterAge = characterAge;
    }
    //endregion

}
