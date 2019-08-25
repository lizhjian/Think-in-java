/**
 * <pre>
 * desc ：TODO
 * author ：lizj
 * date ：2019-08-18 22:22
 * </pre>
 */
public class Demo1213 {
    public static void main(String[] args) {
//        Object obj = null;
//        obj.toString();
        //show();
        throw new NullPointerException("s");
//        if(obj ==null)
//            throw new NullPointerException();
    }

    static void show() throws Exception{
        throw new Exception();
    }
}
