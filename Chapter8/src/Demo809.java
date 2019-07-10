/**
 * <pre>
 * desc £ºTODO
 * author £ºlizj
 * date £º2019-07-09 22:53
 * </pre>
 */
public class Demo809 {

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


class Rodent{
    public void show(){
        System.out.println("Rodent...show");
    }
}
class Mouse extends Rodent{
    @Override
    public void show() {
        System.out.println("Mouse....show");
    }
}
class Gerbil extends Rodent{
    @Override
    public void show() {
        System.out.println("Gerbil...show");
    }
}
class Hamster extends Rodent{
    @Override
    public void show() {
        System.out.println("Hamster....show");
    }
}