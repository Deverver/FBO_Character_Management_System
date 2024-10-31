import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {

        //region Creates and shuffles ArrayList of Character objects
        ArrayList<Character> listOfCharacters = new ArrayList<>();

        listOfCharacters.add(new Jedi("Johannes", 28));
        listOfCharacters.add(new Jedi("Charles", 41));
        listOfCharacters.add(new Jedi("Kaithlyn", 35));
        listOfCharacters.add(new Sith("Dickens", 34));
        listOfCharacters.add(new Sith("Quelaan", 53));
        listOfCharacters.add(new Sith("Azuras", 60));
        listOfCharacters.add(new Droid("E130-02", 100));
        listOfCharacters.add(new Droid("E240-04", 85));
        listOfCharacters.add(new Droid("E360-x", 66));

        // Creates a Character and then casts it as a Sith, then it adds it to the Arraylist
        Character jediSpy = new Sith("ImForcedToBeHere", 30);
        Sith disguisedJedi = (Sith) jediSpy;
        listOfCharacters.add(disguisedJedi);

        // Creates a Character and then casts it as a Droid, then it adds it to the Arraylist
        Character jediRobot = new Droid("EM-Hum4n", 26);
        Droid goodRobot = (Droid) jediRobot;
        listOfCharacters.add(goodRobot);


        Collections.shuffle(listOfCharacters);
        //endregion

        for (Character character : listOfCharacters) {
            character.showInfo();
            character.action();
            System.out.println("****************************************");
        }


    }// main End


}// Main Class End