/**
 * <pre>
 * desc £ºTODO
 * author £ºlizj
 * date £º2019-07-08 21:28
 * </pre>
 */
public class Demo801 {
    void run(){
        System.out.println("Demo801......run");
    }


    void ride(Demo801 demo801){
      demo801.run();
    }

    public static void main(String[] args) {
        Unicycle unicycle = new Unicycle();
        Bicycle bicycle = new Bicycle();
        Demo801 demo801 = new Demo801();
        demo801.ride(unicycle);
        demo801.ride(bicycle);
    }

}

class Unicycle extends Demo801{
    void run(){
        System.out.println("Unicycle...run");
    }
}
class Bicycle extends Demo801{
    void run(){
        System.out.println("Bicycle...run");
    }
}
class Tricycle extends Demo801{
    void run(){
        System.out.println("Tricycle...run");
    }
}
