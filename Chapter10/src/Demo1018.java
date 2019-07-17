/**
 * <pre>
 * desc £ºÇ¶Ì×Àà
 * author £ºlizj
 * date £º2019-07-16 07:54
 * </pre>
 */
public class Demo1018 {

    private static String str = "";

    private static class ParcelContents implements Contents{

    }
    interface Contents{

    }

    public static void main(String[] args) {
        ParcelContents p = new ParcelContents();
        System.out.println(str);

    }
}
