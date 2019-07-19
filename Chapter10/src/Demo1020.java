/**
 * <pre>
 * desc ：嵌套类
 * author ：lizj
 * date ：2019-07-16 08:07
 * </pre>
 */
public class Demo1020 {

    public static void main(String[] args) {
        Out1020.Inner1020 inner1020 = new Out1020.Inner1020();
        inner1020.run();
    }

}
interface Out1020{
    void run();

    class Inner1020 implements Out1020{
        @Override
        public void run() {
            System.out.println("内部类run......");
        }
    }
}