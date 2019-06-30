/**
 * <pre>
 * desc £ºTODO
 * author £ºlizj
 * date £º2019-06-30 09:22
 * </pre>
 */
public class Ques8 {
    public static void main(String[] args) {
        StaticTest8 staticTest8 = new StaticTest8();
        System.out.println(staticTest8.i);

        StaticTest8 staticTest9 = new StaticTest8();

        System.out.println(staticTest8.i==staticTest9.i);







        //staticTest8.i;
    }

}

class StaticTest8{
    static int i;
}