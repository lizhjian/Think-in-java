/**
 * <pre>
 * desc ：TODO
 * author ：lizj
 * date ：2019-07-09 19:47
 * </pre>
 */
class Orange{
    public Orange() {
        System.out.println("父类成员变量...初始化");
    }
}

class Insect{
    static {
        System.out.println("父类静态代码块01...");
    }
    public Insect() {
        System.out.println("父类...构造函数");
    }
    private Orange orange = new Orange();
    {
        System.out.println("父类代码块01...");
    }
    private static int num = show();




    static int show(){
        System.out.println("父类静态变量....初始化");
        return 1;
    }
    static {
        System.out.println("父类静态代码块02...");
    }
    {
        System.out.println("父类代码块02...");
    }
}

class Ban{

    public Ban() {
        System.out.println("子类成员变量...初始化");
    }
}
class Car{

    public Car() {
        System.out.println("子类成员Car变量...初始化");
    }
}

public class PortableLunch extends Insect{

    static {
        System.out.println("子类静态代码块01...");
    }
    private static int count = say();

    {
        System.out.println("子类代码块01...");
    }

    private Ban ban = new Ban();

    private Car car = null;

    static int say(){
        System.out.println("子类静态变量....初始化");
        return 2;
    }

    public PortableLunch() {
        System.out.println("子类....构造函数");
    }

    public static void main(String[] args) {

        new PortableLunch();

    }
    static {
        System.out.println("子类静态代码块02...");
    }
    {
        System.out.println("子类代码块02...");
    }
}
