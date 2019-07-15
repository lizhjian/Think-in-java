/**
 * <pre>
 * desc £ºTODO
 * author £ºlizj
 * date £º2019-07-16 06:27
 * </pre>
 */
public class Demo1011 {

    public String str = "aaa";

    public class Inner1011 implements inter1011{
        @Override
        public void run() {
            System.out.println("aaaaaa");
        }
    }

    inter1011 getInner1011(){
       return new Inner1011();
    }

    public static void main(String[] args) {
        Demo1011 demo1011 = new Demo1011();
        demo1011.getInner1011().run();


       // Inner1011 inner1011 = new Inner1011();
        ((Inner1011)(demo1011.getInner1011())).run();
    }

}
interface inter1011{
    void run();

}