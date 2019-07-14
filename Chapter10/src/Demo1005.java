/**
 * <pre>
 * desc ：创建内部类实例
 * author ：lizj
 * date ：2019-07-14 16:17
 * </pre>
 */
public class Demo1005 {
    public static void main(String[] args) {
       Out1005 out1005 = new Out1005();
        Out1005.Inner inner = out1005.new Inner();
        inner.show();

    }
}


class Out1005{
    class Inner{
        void show(){
            System.out.println("内部类");
        }
    }
}