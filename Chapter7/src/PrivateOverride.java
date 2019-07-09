/**
 * <pre>
 * desc £ºTODO
 * author £ºlizj
 * date £º2019-07-09 08:29
 * </pre>
 */
public class PrivateOverride {
    private void f(){
        System.out.println("private .....f");
    }

    public static void main(String[] args) {

        PrivateOverride p  = new Derived();
        p.f();

    }
}
class Derived extends PrivateOverride{
    public void f(){
        System.out.println("public...f");
    }
}