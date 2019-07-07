/**
 * <pre>
 * desc ：TODO    lizhijian
 * author ：lizj
 * date ：2019-07-07 17:10
 * </pre>
 */
public class Demo701 {

    private String fuselage, wings, tail;

    private Engine engine1;
    private Engine engine2;

    public Demo701() {
        this.fuselage = fuselage;
        this.wings = wings;
        this.tail = tail;
    }

    @Override
    public String toString() {
        if(engine1==null){
            engine1 = new Engine();
            System.out.println("初始化");
        }
        return "Demo701{" +
                "fuselage='" + fuselage + '\'' +
                ", wings='" + wings + '\'' +
                ", tail='" + tail + '\'' +
                ", engine1=" + engine1 +
                '}';
    }

    public static void main(String[] args) {
        Demo701 N1234 = new Demo701();
        System.out.println(N1234);

    }
}
class Engine{

    private String s;

    public Engine() {
        System.out.println("Engine()");
        s ="Constructed";
    }
}
