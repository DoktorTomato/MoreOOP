import lotr.GameManager;
import lotr.CharacterFactory;
import lotr.Character;

public class Demo {
    public static void main(String[] args) {
        CharacterFactory cf = new CharacterFactory();
        GameManager gm = new GameManager();
        Character c1 = cf.createCharacter();
        System.out.println(c1.toString() + "was created");
        Character c2 = cf.createCharacter();
        System.out.println(c1.toString() + "was created");
        gm.fight(c1, c2);   
    }
}
