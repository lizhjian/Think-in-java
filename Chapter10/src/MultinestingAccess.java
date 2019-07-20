/**
 * <pre>
 * desc £ºTODO
 * author £ºlizj
 * date £º2019-07-19 21:04
 * </pre>
 */

class MNA{
    private void f(){}
    class A{
        private void g(){}
        public class B{
            void h(){
                g();
                f();
            }
        }
    }
}


public class MultinestingAccess {

    public static void main(String[] args) {
        MNA mna = new MNA();
        MNA.A mnaa = mna.new A();
        MNA.A.B b = mnaa.new B();



    }
}
