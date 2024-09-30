package lotr;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter @AllArgsConstructor
public abstract class Character {

    private int power;
    private int hp;

    public abstract void kick (Character c);

    public void setHp (int newHP){
        if (newHP >= 0){
            hp = newHP;
        } else {
            hp += newHP;
        }
        if (hp < 0){
            hp = 0;
        }
    }

    public boolean isAlive (){
        return (hp > 0);
    }

    @Override
    public String toString(){
        return this.getClass().getSimpleName()+"{hp="+hp+", power="+power+"}";
    }
}
