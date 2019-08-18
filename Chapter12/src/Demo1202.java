/**
 * <pre>
 * desc ：TODO
 * author ：lizj
 * date ：2019-08-18 20:13
 * </pre>
 */
public class Demo1202 {


    public static void main(String[] args) {
        try {
            Object obj = null;
            obj.toString();
        }catch (Exception e){
            e.printStackTrace();
            System.out.println("----");
            e.printStackTrace(System.out);
        }
    }
}
