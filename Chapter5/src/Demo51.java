/**
 * <pre>
 * desc £ºTODO
 * author £ºlizj
 * date £º2019-07-02 08:19
 * </pre>
 */
public class Demo51 {
    public static void main(String[] args) {
        Test51 test51 = new Test51();
        System.out.println(test51.str);

        Test52 test52 = new Test52();
        System.out.println(test52.str);

        Test53 test53 = new Test53("sssss");
        System.out.println(test53.str);

        char bb= 'a';
        test53.show(bb);
        test53.show(bb);


    }

}


class Test51{
    String str;
}

class Test52{
    String str = "abc";
}

class Test53{
    String str = "abc";

    public Test53(String str) {
        this.str = str;
    }

    void show(int a){
        System.out.println("int");
    }
    void show(float a){
        System.out.println("float");
    }
}
