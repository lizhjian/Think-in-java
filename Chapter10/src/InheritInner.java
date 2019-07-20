/**
 * <pre>
 * desc ：内部类的继承
 * author ：lizj
 * date ：2019-07-20 10:08
 * </pre>
 */

class WithInner{
    class Inner{}
}

public class InheritInner extends WithInner.Inner {
    public InheritInner(WithInner inner) {
        inner.super();
    }

    public static void main(String[] args) {
        WithInner wi = new WithInner();
        InheritInner ii = new InheritInner(wi);
    }
}
