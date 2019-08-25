/**
 * <pre>
 * desc ：TODO
 * author ：lizj
 * date ：2019-08-18 22:07
 * </pre>
 */
public class Demo1210 {


    public static void main(String[] args) {
        try {
            f();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    static void f() throws Exception{
        try {
            g();
        }catch (Exception e){
            e.printStackTrace();
            throw new Exception("f-->");

        }
    }

    static void g() throws Exception{
        throw new RuntimeException("g-->");
    }
}
