/**
 * <pre>
 * desc ：TODO
 * author ：lizj
 * date ：2019-07-12 15:56
 * </pre>
 */
public class Son1 extends Father1 {


    @Override
    void say() {
        System.out.println("子类say");
    }

    public static void main(String[] args) {
        Son1 son1 = new Son1();
        son1.print();
    }
}

abstract  class Father1 {
//    public Father1() {
//        display();
//    }
//
//    public void display() {
//        System.out.println("Father's display");
//    }
    void print(){
        say();
    }
    //abstract void say();

    void say(){
        System.out.println("父类sat");
    }
}