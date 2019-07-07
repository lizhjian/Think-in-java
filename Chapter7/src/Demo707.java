/**
 * <pre>
 * desc £ºTODO
 * author £ºlizj
 * date £º2019-07-07 18:24
 * </pre>
 */
public class Demo707 {

    private Cleanser cleanser = new Cleanser();

    private void show(){
        cleanser.show();
    }

    public static void main(String[] args) {
        Demo707 demo707 = new Demo707();
        demo707.show();
    }
}


class Cleanser{
    private String str = "abc";

    public void show(){
        System.out.println("show");
    }
}
