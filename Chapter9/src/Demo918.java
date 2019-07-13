/**
 * <pre>
 * desc £ºTODO
 * author £ºlizj
 * date £º2019-07-14 07:41
 * </pre>
 */


interface Cycle918{

    void next();

}

class Unicycle918 implements Cycle918{
    @Override
    public void next() {
        System.out.println("Unicycle...next");
    }
}
class Bicycle918 implements Cycle918{
    @Override
    public void next() {
        System.out.println("Unicycle...next");
    }
}



interface CycleFactory {
    Cycle918 getCycle();
}

class Unicycle918Factory implements CycleFactory{
    @Override
    public Cycle918 getCycle() {
        return new Unicycle918();
    }
}

class Bicycle918Factory implements CycleFactory{
    @Override
    public Cycle918 getCycle() {
        return new Bicycle918();
    }
}
public class Demo918 {

    public static void print(CycleFactory cycleFactory){
        cycleFactory.getCycle().next();

    }

    public static void main(String[] args) {
        print(new Unicycle918Factory());
    }

}
