/**
 * <pre>
 * desc ��TODO
 * author ��lizj
 * date ��2019-07-12 07:13
 * </pre>
 */
public class Demo912 {
    public static void main(String[] args) {
        Hero hero = new Hero();
        hero.climb();
        hero.fight();
        hero.fly();
    }
}


interface CanFight{
    void fight();
}
interface CanFly{
    void fly();
}

interface CanClimb{
    void climb();
}
class Hero implements CanFight,CanFly,CanClimb{
    @Override
    public void fight() {

    }

    @Override
    public void fly() {

    }

    @Override
    public void climb() {

    }
}