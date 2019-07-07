/**
 * <pre>
 * desc £ºTODO
 * author £ºlizj
 * date £º2019-07-07 17:43
 * </pre>
 */
public class Cartoon extends Drawing{
//    public Cartoon() {
//        System.out.println("Cartoon");
//    }

    public static void main(String[] args) {
        Cartoon cartoon = new Cartoon();
    }
}

class Art{
    public Art() {
        System.out.println("Ant ");
    }
}
class Drawing extends Art{
    public Drawing() {
        System.out.println("Draw");
    }
}
