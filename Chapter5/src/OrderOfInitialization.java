/**
 * <pre>
 * desc ：在类的内部,变量定义的先后顺序决定了初始化的顺序,
 * author ：lizj
 * date ：2019-07-06 21:48
 * </pre>
 */
public class OrderOfInitialization {
    public static void main(String[] args) {
        House h = new House();
        h.f();
        System.gc();
    }
}

class Window{
    public Window(int mark) {
        System.out.println("Window...."+mark);
    }
}
class House{
    Window w1  = new Window(1);

    public House() {
        System.out.println("House");
        Window w3 = new Window(33);
    }
    public void House1() {
        System.out.println("House1");
        Window w3 = new Window(33);
    }
    Window w2 = new Window(2);

    void f(){
        System.out.println("f()");
    }
  //  Window w3 = new Window(3);

    protected void  finalize(){
        System.out.println("垃圾回收");
    }

}