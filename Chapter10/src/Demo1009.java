/**
 * <pre>
 * desc ：TODO
 * author ：lizj
 * date ：2019-07-16 06:19
 * </pre>
 */
public class Demo1009 {

    inter1009 ride(){
        class Inner implements inter1009{
            @Override
            public void run() {

            }

            public Inner() {
                System.out.println("内部类");
            }
        }

        return new Inner();
    }

    public static void main(String[] args) {
        Demo1009 demo1009 = new Demo1009();
        demo1009.ride();
    }
}

interface inter1009{
    void run();
}