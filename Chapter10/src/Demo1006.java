import com1.Test1006;
import com2.Outer1006;

/**
 * <pre>
 * desc ：TODO
 * author ：lizj
 * date ：2019-07-14 16:26
 * </pre>
 */
public class Demo1006 extends Outer1006 {
    //子类通过this方法可以访问父类的protect的变量
    Test1006 getInner(){
       return this.new Inner();
    }

    public static void main(String[] args) {
        Demo1006 demo1006 = new Demo1006();
        demo1006.getInner().show();
    }

}
