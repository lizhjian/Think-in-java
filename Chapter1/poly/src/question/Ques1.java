package question;

/**
 * <pre>
 * desc ：创建一个类  包含int 和 char 验证默认值
 * author ：lizj
 * date ：2019-06-30 08:02
 * </pre>
 */
class Bean{
    int i;
    char c;

}
public class Ques1 {

    public static void main(String[] args) {
        Bean b = new Bean();
        System.out.println("i="+b.i);
        System.out.println("c="+b.c);
    }
}
//==============================


//public class PrimitiveTest {
//    static int i;
//    static char c;
//    public static void main(String[] args) {
//        System.out.println("int = " + i);
//        System.out.println("char = " + c);
//    }
//}

//=============================