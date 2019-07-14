/**
 * <pre>
 * desc ：TODO
 * author ：lizj
 * date ：2019-07-14 15:37
 * </pre>
 */
public class Demo1003 {

    private String str;

    public Demo1003(String str) {
        this.str = str;
    }

    class Inner {

        @Override
        public String toString() {
            return "内部类..."+str;

        }
    }
    Inner getInner(){
        return new Inner();
    }

    public static void main(String[] args) {
        System.out.println(new Demo1003("abc").getInner());
    }
}
