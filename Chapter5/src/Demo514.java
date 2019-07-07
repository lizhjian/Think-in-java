/**
 * <pre>
 * desc ：TODO
 * author ：lizj
 * date ：2019-07-07 07:48
 * </pre>
 */

class Cups14{
    static String str1 = "1111";

    static String str2,str3;

    static {
        str2 = "2222";

        System.out.println("静态代码块");

        str3 = "3333";
    }

    public Cups14() {
    }
    static void show(){
        System.out.println("str1----->"+Cups14.str1);
        System.out.println("str2----->"+Cups14.str2);
        System.out.println("str3----->"+Cups14.str3);
    }
}


public class Demo514 {

    public static void main(String[] args) {
        Cups14.show();
    }

}
