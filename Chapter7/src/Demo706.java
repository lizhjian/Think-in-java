/**
 * <pre>
 * desc £ºTODO
 * author £ºlizj
 * date £º2019-07-07 18:09
 * </pre>
 */

public class Demo706 extends A01{
    public Demo706(String str, B01 b01) {
        super(str);
        this.b01 = b01;
    }

    B01 b01 ;
    public static void main(String[] args) {
        //Demo706 c = new Demo706();
    }

}

class A01 {
    public A01(String str) {
        System.out.println("A01");
    }
}
class B01{
    public B01(String str) {
        System.out.println("B01");
    }
}
