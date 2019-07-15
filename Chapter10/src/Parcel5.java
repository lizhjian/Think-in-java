
/**
 * <pre>
 * desc ：具备内部类
 * author ：lizj
 * date ：2019-07-16 05:14
 * </pre>
 */
public class Parcel5 {

    public Destination destination(String s) {
        class PDestination implements Destination {
            private String label;

            private PDestination(String whereTo) {
                label = whereTo;
                System.out.println("内部类..."+whereTo);
            }

            public String readLabel() {
                return label;
            }
        }
        return new PDestination(s);
    }

    public static void main(String[] args) {
        Parcel5  p = new Parcel5();
        Destination d = p.destination("ssss");
    }
}

interface Destination {
    String readLabel();
}
