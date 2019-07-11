/**
 * <pre>
 * desc ：TODO
 * author ：lizj
 * date ：2019-07-11 21:08
 * </pre>
 */
public class Demo903 {
    public static void main(String[] args) {
        SubTest903 subTest903 = new SubTest903();
        subTest903.print();
    }
}


abstract class Test903{
  abstract void print();

    public Test903() {
        this.print();  //多态导致父类调用被子类覆盖的方法被认为是调用子类
    }
}

class SubTest903 extends Test903{
    //对于子类的成员变量会先被初始化为0
    private static int num = 10;

    private int count =  15;
    @Override
    void print() {
        System.out.println("SubTest903..num.."+num);
        System.out.println("SubTest903..count.."+count);
    }
}