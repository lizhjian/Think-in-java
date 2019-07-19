/**
 * <pre>
 * desc ：TODO
 * author ：lizj
 * date ：2019-07-17 21:53
 * </pre>
 */
public class Demo1021 implements Outer1021{

    @Override
    public void run() {
        System.out.println("子类..");

    }

    public static void main(String[] args) {

        Outer1021.Inner1021.say(new Demo1021());

    }
}
//包含嵌套类接口
interface Outer1021{
    void run();

    //嵌套类
    class Inner1021{


        static void say(Outer1021 outer1021){
            //System.out.println(outer1021.run());
            outer1021.run();
        }
    }
}