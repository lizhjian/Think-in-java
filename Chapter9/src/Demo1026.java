/**
 * <pre>
 * desc £ºTODO
 * author £ºlizj
 * date £º2019-07-20 10:17
 * </pre>
 */
public class Demo1026 {
    class MainInner extends Outer1026.Inner1026{
        public MainInner(Outer1026 out) {
            out.super(1);
        }
    }

    public static void main(String[] args) {
        Outer1026 out = new Outer1026();
        Demo1026 demo1026 = new Demo1026();
        MainInner inner = demo1026.new MainInner(out);
    }

}


class Outer1026{
    class Inner1026{
        public Inner1026(int i) {
            System.out.println("¹¹Ôìº¯Êý....");
        }
    }

}