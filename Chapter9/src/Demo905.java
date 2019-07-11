/**
 * <pre>
 * desc ：TODO
 * author ：lizj
 * date ：2019-07-11 22:39
 * </pre>
 */
public class Demo905 implements Test905{

    @Override
    public void show() {
        System.out.println("子类...show");
    }

    @Override
    public void say() {
        System.out.println("子类...say");
    }

    public static void main(String[] args) {
        Demo905 demo905 = new Demo905();
        demo905.say();
        demo905.show();
    }
}
