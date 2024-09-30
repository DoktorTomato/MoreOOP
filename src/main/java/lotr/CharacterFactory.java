package lotr;

import java.util.Random;

public class CharacterFactory {
    public Character createCharacter(){
        Elf elf = new Elf();
        Hobbit hobbit = new Hobbit();
        King king = new King();
        Knight knight = new Knight();
        Character[] charList = {elf, hobbit, king, knight};
        return charList[new Random().nextInt(0, charList.length)];
    }
}
