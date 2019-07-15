/**
 * <pre>
 * desc £ºTODO
 * author £ºlizj
 * date £º2019-07-16 07:17
 * </pre>
 */
public class Demo1015 {
    Test1015  getTest1015(){
        return new Test1015(1){

        };
    }

    public static void main(String[] args) {
        Demo1015 demo1015 = new Demo1015();
        demo1015.getTest1015();
    }
}

class Test1015{
    private int i;

    public Test1015(int i) {
        this.i = i;
    }
}