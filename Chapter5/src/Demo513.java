/**
 * <pre>
 * desc ：静态代码块(在类被实例化 或者 引用类静态变量时 或类的静态方法 被执行)
 * author ：lizj
 * date ：2019-07-07 07:34
 * </pre>
 */

class Cup{
    public Cup(int marker) {
        System.out.println("Cup"+"("+marker+")");
    }
    void f(int marker){
        System.out.println("f("+marker+")");
    }
}
class Cups{
    static Cup cup1;  //不new Cup() 是不输出Cup的静态变量的

    static Cup cup2;

    static {
        cup1 = new Cup(1);
        cup2 = new Cup(2);
    }
    Cups(){
        System.out.println("Cups");
    }
}

public class Demo513 {

    public static void main(String[] args) {
        System.out.println("inside main");
        Cups.cup1.f(99);
    }


}
