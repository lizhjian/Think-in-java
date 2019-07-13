/**
 * <pre>
 * desc £ºTODO
 * author £ºlizj
 * date £º2019-07-14 06:19
 * </pre>
 */
public class A917 {

    interface B{
     void f();
    }

    private interface D{
        void f();
    }

    private class DImp implements D{
        @Override
        public void f() {

        }
    }
    public class DImp2 implements D{
        @Override
        public void f() {

        }
    }

    public D  getD(){
        return new DImp2();
    }

    private D dRef;

    public void receiveD(D d){
      dRef = d;
      dRef.f();
    }


    public static void main(String[] args) {
        A917 a1  = new A917();
        A917.D d = a1.getD();

        A917 a2  = new A917();
        a2.receiveD(a1.getD());



    }
}
