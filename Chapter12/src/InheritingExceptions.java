/**
 * <pre>
 * desc ��TODO
 * author ��lizj
 * date ��2019-08-18 19:51
 * </pre>
 */

class SimpleException extends Exception{


}
public class InheritingExceptions {
    public void f() throws SimpleException{
        System.out.println("Throw");
        throw new SimpleException();
    }

    public static void main(String[] args) {
        InheritingExceptions inheritingExceptions = new InheritingExceptions();
        try {
            inheritingExceptions.f();
        }catch (SimpleException s){
            System.out.println("caught it");
        }
    }
}
