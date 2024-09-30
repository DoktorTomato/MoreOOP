package lotr;

public class GameManager {
    public void fight(Character c1, Character c2){
        int counter = 0;
        while (c1.getHp() > 0 && c2.getHp() > 0){
            System.out.println(c1.getClass().getSimpleName()+" kicks "+c2.getClass().getSimpleName());
            c1.kick(c2);
            System.out.println(c1.getClass().getSimpleName()+ "'s HP is " +c1.getHp());
            System.out.println(c2.getClass().getSimpleName()+ "'s HP is " +c2.getHp());

            System.out.println("======================================================");

            System.out.println(c2.getClass().getSimpleName()+" kicks "+c1.getClass().getSimpleName());
            c2.kick(c1);
            System.out.println(c1.getClass().getSimpleName()+ "'s HP is " +c1.getHp());
            System.out.println(c2.getClass().getSimpleName()+ "'s HP is " +c2.getHp());

            counter += 1;

            if (counter >= 10 && c1.getClass().isInstance(c2)){
                System.out.println("======================================================");
                System.out.println("Two hobbits were crying forever and forever untill the end of time");
                break;
            }
        }
        System.out.println("=======================THE END========================");
    }
}
