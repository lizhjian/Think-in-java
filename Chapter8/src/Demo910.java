/**
 * <pre>
 * desc ：TODO
 * author ：lizj
 * date ：2019-07-09 23:00
 * </pre>
 */
public class Demo910 extends BaseClass{

    void show(){
        System.out.println("基类...show");  //可以这么联想
        this.say();

    }
    @Override
    void say() {
        System.out.println("子类...say");
    }

    public static void main(String[] args) {
        Demo910 demo910 =new Demo910();
        ((BaseClass)demo910).show();
    }
}
class BaseClass{
    void show(){
        System.out.println("基类...show");
        this.say();                         //谁持有say调用的谁的say(多态)

    }
    void say(){
        System.out.println("基类...say");

    }
}