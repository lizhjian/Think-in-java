/**
 * <pre>
 * desc £ºÄÚ²¿Àà¸²¸Ç
 * author £ºlizj
 * date £º2019-07-20 10:47
 * </pre>
 */
class Egg2{
    protected class Yolk{
        public Yolk() {
            System.out.println("Egg2.Yolk()");
        }
        public void f(){
            System.out.println("Egg2.Yolk.f()");
        }
    }
}


public class BigEgg2 extends Egg2{
    public class Yolk extends Egg2.Yolk{

        public Yolk() {
            System.out.println("BigEgg2.....Yolk");
        }

    }
}
