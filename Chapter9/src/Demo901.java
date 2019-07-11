/**
 * <pre>
 * desc £ºTODO
 * author £ºlizj
 * date £º2019-07-11 20:58
 * </pre>
 */
public class Demo901 {

    public void run(Rodent rodent){
        rodent.show();
    }

    public static void main(String[] args) {
        Demo809 demo809 = new Demo809();
        Rodent[] rodents = new Rodent[]{new Rodent(),new Mouse(),new Gerbil(),new Hamster()};

        for(Rodent rodent: rodents){
            rodent.show();

        }
    }
}


abstract class Rodent901{
    public abstract void show();
}
class Mouse901 extends Rodent901{
    @Override
    public void show() {
        System.out.println("Mouse....show");
    }
}
class Gerbil901 extends Rodent901{
    @Override
    public void show() {
        System.out.println("Gerbil...show");
    }
}
class Hamster901 extends Rodent901{
    @Override
    public void show() {
        System.out.println("Hamster....show");
    }
}