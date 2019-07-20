/**
 * <pre>
 * desc ：TODO
 * author ：lizj
 * date ：2019-07-19 23:19
 * </pre>
 */

interface U{
    void method1();

    void method2();

    void method3();

}

class A1023{

   public U method(){
        return new U(){
            @Override
            public void method1() {
                System.out.println("匿名对象....method1");
            }

            @Override
            public void method2() {
                System.out.println("匿名对象....method2");
            }

            @Override
            public void method3() {
                System.out.println("匿名对象....method3");
            }
        };
    }

}

class B1023{
    private U[] us = new U[100];

    private int length;

    public void add(U u){
        us[length++] = u;
    }
    public void setNUll(){
        us = null;
        length = 0;
    }
    public void show(){
        for(int i = 0;i<length;i++){
            System.out.println(us[i]);
        }
    }
}

public class Demo1023 {



    public static void main(String[] args) {

        A1023 a = new A1023();

        B1023 b = new B1023();

        b.add(a.method());

        b.show();

        b.add(a.method());
        b.add(a.method());
        b.add(a.method());
        b.add(a.method());
        b.show();

        b.setNUll();
        b.show();
    }
}
