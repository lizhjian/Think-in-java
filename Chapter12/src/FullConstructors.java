/**
 * <pre>
 * desc £ºTODO
 * author £ºlizj
 * date £º2019-08-18 20:01
 * </pre>
 */
class MyException extends Exception{
    public MyException(){}
    public MyException(String msg){
        super(msg);
    };
}
public class FullConstructors {

    public static void f() throws MyException{
        System.out.println("f----");
        throw new MyException();

    }
    public static void g() throws MyException{
        System.out.println("g----");
        throw new MyException("g() Exception");

    }

    public static void main(String[] args) {
        try {
            f();
        }catch (MyException e){
            e.printStackTrace(System.out);
        }
        try {
            g();
        }catch (MyException e){
            e.printStackTrace(System.out);
        }
    }
}
