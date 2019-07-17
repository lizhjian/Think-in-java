/**
 * <pre>
 * desc ：TODO
 * author ：lizj
 * date ：2019-07-14 07:41
 * </pre>
 */


interface Cycle1018{

    void next();

}

class Unicycle1018 implements Cycle1018{
    @Override
    public void next() {
        System.out.println("Unicycle1018...next");
    }

    public static CycleFactory1018 cycleFactory = new CycleFactory1018(){
        @Override
        public Cycle1018 getCycle() {
            return  new Unicycle1018();
        }
    };


}

class Bicycle1018 implements Cycle1018{
    @Override
    public void next() {
        System.out.println("Bicycle1018...next");
    }

    private static CycleFactory1018 factory1018 = new CycleFactory1018() {
        @Override
        public Cycle1018 getCycle() {
            return new Bicycle1018();
        }
    };


}


interface CycleFactory1018 {   //工厂接口返回接口的引用  工厂实现类返回具体引用
    Cycle1018 getCycle();
}

public class Demo1016 {

    public static void print(CycleFactory1018 cycleFactory1018){
        cycleFactory1018.getCycle().next();

    }

    public static void main(String[] args) {
        print(Unicycle1018.cycleFactory);
    }

}
