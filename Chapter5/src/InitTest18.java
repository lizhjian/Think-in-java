/**
 * <pre>
 * desc £ºTODO
 * author £ºlizj
 * date £º2019-07-07 09:27
 * </pre>
 */
class InitTest {
    InitTest(String s) {
        System.out.println("InitTest()");
        System.out.println(s);
    }
}

public class InitTest18 {
    public static void main(String[] args) {
        InitTest[] it = new InitTest[5];
        for(int i = 0; i < it.length; i++)
            it[i] = new InitTest(Integer.toString(i));
    }
}