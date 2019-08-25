/**
 * <pre>
 * desc ：TODO
 * author ：lizj
 * date ：2019-08-19 09:10
 * </pre>
 */

class BaseballException extends Exception{}

class Foul extends BaseballException{}

class Strike extends BaseballException{}


abstract class Inning{
    //构造方法抛出了异常
    public Inning() throws BaseballException{}
    //后续方法如果覆盖了event则需要覆盖次方法
    public void event() throws BaseballException{

    }


    public abstract void atBat() throws Strike,Foul;

    public void walk(){}
}

class StormException extends Exception{}

class RainedOut extends StormException{}

class PopFoul extends Foul{}


interface  Storm{

    public void event() throws RainedOut;

    public void rainHard() throws RainedOut;

}


//public class StormyInning extends Inning implements Storm{
public class StormyInning{


//    public StormyInning() throws RainedOut, BaseballException {
//        //super();
//    }
//    public StormyInning(String s) throws Foul, BaseballException {
//        //super();
//    }
//    @Override
//    void walk() throws PopFoul{}
//
//    @Override
//    public void event() throws RainedOut {}
//
//
//
//    @Override
//    public void rainHard() throws RainedOut {
//
//    }
//
//   // public void event(){}
//
//    @Override
//    public void atBat() throws PopFoul {
//
//    }

    public static void main(String[] args) {
//        try {
//            StormyInning si = new StormyInning();
//            si.atBat();
//        }catch (PopFoul e){
//            System.out.println("Pop foul");
//        }catch (RainedOut e){
//            System.out.println("Rained out");
//        }catch (BaseballException e){
//            System.out.println("Generic baseball exception");
//        }
//        try{
//            Inning i = new StormyInning();
//            i.atBat();
//        }catch (Strike e){
//            System.out.println("Strike");
//        }catch (Foul e){
//            System.out.println("Foul");
//        }catch (RainedOut e){
//            System.out.println("Rained out");
//        }catch (BaseballException e){
//            System.out.println("Generic baseball exception");
//        }
    }
}
