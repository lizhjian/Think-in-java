/**
 * <pre>
 * desc ：代码块每次实例化都会执行  代码块不实例化不会执行
 * author ：lizj
 * date ：2019-07-07 08:33
 * </pre>
 */
public class Demo515 {
    public static void main(String[] args) {
//        Cup515 cup515 = new Cup515();
//        Cup515 cup516 = new Cup515();

        System.out.println(Cup515.str1);
        System.out.println(Cup515.str1);
    }

}

class Cup515{
    static String str1;

    static String str2,str3;

      {
        str1 = "111";
        str2 = "2222";

        System.out.println("静态代码块");

        str3 = "3333";
    }

        }