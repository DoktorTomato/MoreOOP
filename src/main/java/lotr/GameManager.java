package lotr;

public class GameManager {
    public void fight(Character c1, Character c2){
        while (c1.getHp() > 0 && c2.getHp() > 0){
            c1.kick(c2);
            System.out.println(c1.getClass().getSimpleName()+" kicks "+c2.getClass().getSimpleName());
            System.out.println(c1.getClass().getSimpleName()+ "'s HP is " +c1.getHp());
            System.out.println(c2.getClass().getSimpleName()+ "'s HP is " +c2.getHp());
        }
    }
}
