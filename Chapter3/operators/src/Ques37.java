/**
 * <pre>
 * desc £ºTODO
 * author £ºlizj
 * date £º2019-07-01 12:52
 * </pre>
 */
public class Ques37 {

    public static void main(String[] args) {

        boolean a = true;
        System.out.println("aaa"+a);

        boolean b = false;
        System.out.println(a | b);

        System.out.println( a & b);
        System.out.println( a && b);

        int num = 127;
        byte b1 = (byte)num;
        System.out.println(b1);

        float c = 1.9f;
        c++;
        System.out.println(c);
        num = (byte)c;
        System.out.println(num);


    }
}

