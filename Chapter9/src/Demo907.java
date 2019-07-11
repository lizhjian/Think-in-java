/**
 * <pre>
 * desc £ºTODO
 * author £ºlizj
 * date £º2019-07-11 22:49
 * </pre>
 */
public class Demo907 {
    public static void main(String[] args) {

    }
}


interface Rodent907{
    void show();
}
class Mouse907 implements Rodent907{
    @Override
    public void show() {
        System.out.println("Mouse....show");
    }
}
class Gerbil907 implements Rodent907{
    @Override
    public void show() {
        System.out.println("Gerbil...show");
    }
}
class Hamster907 implements Rodent907{
    @Override
    public void show() {
        System.out.println("Hamster....show");
    }
}