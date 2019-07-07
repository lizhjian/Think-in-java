/**
 * <pre>
 * desc £ºTODO
 * author £ºlizj
 * date £º2019-07-07 18:13
 * </pre>
 */
public class Demo709 extends Root{

    Component1 component11;
    Component2 component22;
    Component3 component33;

    public Demo709() {
        System.out.println("Demo709");
    }

    public static void main(String[] args) {
        Demo709 demo709 = new Demo709();

    }
}


class Component1{
    public Component1() {
        System.out.println("Component1");
    }
}
class Component2{
    public Component2() {
        System.out.println("Component2");
    }
}
class Component3{
    public Component3() {
        System.out.println("Component3");
    }
}

class Root{
    Component1 component1;
    Component2 component2;
    Component3 component3;

}