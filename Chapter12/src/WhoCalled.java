/**
 * <pre>
 * desc ：TODO
 * author ：lizj
 * date ：2019-08-18 21:22
 * </pre>
 */
public class WhoCalled {
    static void f(){
        try {
            throw new Exception();
        }catch (Exception e){
            for(StackTraceElement element:e.getStackTrace()){
                System.out.println(element.getMethodName());
            }

        }
    }

    static void g(){
        f();
    }
    static void h(){
        g();
    }


    public static void main(String[] args) {
        f();
        System.out.println("---------------");
        g();
        System.out.println("---------------");
        h();

    }
}
