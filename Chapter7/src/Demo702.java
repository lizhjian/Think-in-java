/**
 * <pre>
 * desc £ºTODO
 * author £ºlizj
 * date £º2019-07-07 17:31
 * </pre>
 */
public class Demo702 extends Detergent{
    @Override
    void scrub() {
        //super.scrub();
        System.out.println("bbb");
    }
    void sterilize(){
        System.out.println("cccc");
    }

    public static void main(String[] args) {
        Demo702 demo702 = new Demo702();
        demo702.scrub();
        demo702.sterilize();
    }
}

class Detergent{
    void scrub(){
        System.out.println("aaa");
    }
}