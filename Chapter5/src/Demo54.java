/**
 * <pre>
 * desc ��TODO
 * author ��lizj
 * date ��2019-07-02 13:12
 * </pre>
 */
public class Demo54 {
    public static void main(String[] args) {
        Test55 test54 = new Test55();
        Test55 test55 = new Test55("aaa");


    }
}


class Test55{
    public Test55() {
        System.out.println(this.getClass());
    }
    public Test55(String s) {
        System.out.println(s);
    }


}