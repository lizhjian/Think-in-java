/**
 * <pre>
 * desc ��TODO
 * author ��lizj
 * date ��2019-07-07 21:43
 * </pre>
 */
public class Demo713 extends A713{

    @Override
    void show(int a) {
        super.show(a);
    }

    @Override
    void show(String a) {
        super.show(a);
    }

    @Override
    void show(double a) {
        super.show(a);
    }

    public static void main(String[] args) {

    }
}

class A713{
    void show(int a){
        System.out.println("����");
    }
    void show(String a){
        System.out.println("�ַ���");
    }
    void show(double a){
        System.out.println("double");
    }
}
