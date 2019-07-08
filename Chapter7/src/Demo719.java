/**
 * <pre>
 * desc ：空白final对象 使用前必须被初始化  不管在定义处还是在构造函数处
 * author ：lizj
 * date ：2019-07-08 20:22
 * </pre>
 */
class People{
    private int i;

    public People(int i) {
        this.i = i;
    }
}

public class Demo719 {

    private final int i =0;

    private final int j;

    private final People people;


    public Demo719() {
        j = 1;
        people = new People(1);
    }
    public Demo719(String str) {
        j = 1;
        people = new People(1);
    }

    public static void main(String[] args) {

    }




}

