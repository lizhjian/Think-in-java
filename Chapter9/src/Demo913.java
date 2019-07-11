/**
 * <pre>
 * desc £ºTODO
 * author £ºlizj
 * date £º2019-07-12 07:19
 * </pre>
 */
public class Demo913 {

    public static void main(String[] args) {
        CanFly1 canFly1 = new Doer();
        //((Doer) canFly1).fly3();
    }
}

interface CanSwim{
    void swim();
}

interface CanFly1 extends CanSwim {
    void fly();
}

interface CanFly2 extends CanSwim{
    void fly2();
}

interface CanFly3 extends CanFly1,CanFly2{
    void fly3();
}
class Doer implements CanFly3{
    @Override
    public void swim() {

    }

    @Override
    public void fly() {

    }

    @Override
    public void fly2() {

    }

    @Override
    public void fly3() {

    }
}

