/**
 * <pre>
 * desc ������Զ���
 * author ��lizj
 * date ��2019-04-24 22:59
 * </pre>
 */
public class Operation {

    private boolean a1;
    private char a2;
    private byte a3;
    private short a4;
    private int a5;
    private long a6;
    private float a7;
    private double a8;

    private static int i = 50;

    static void add(){
       Operation.i++;
    }

    public static void main(String[] args) {

        //1.ֻ��һ�������ã���ָ���κζ�������û�취��s����ʵ�ʲ���
        String s;
        //s.length();
        //2.����һ���µĶ���
        String s1 = new String("abc");   //�����ڶ���
        String b = new String("abc");
        System.out.println(s1==b);
        System.out.println(s1.equals(b));
        //3.�����������ŵ���ջ�У�ֱ�Ӵ洢ֵ��
        int a =1;
        //4.���� װ��
        char c='x';
        Character ch = new Character(c);
        char d = ch;
        //5.����
        char[] arr = {};
        System.out.println(arr.length);
       // System.out.println(arr[0]);
        //6.������
        {
            int x =12;
            {
                int q =98;
               // int x = 89;  ���Ϸ�
            }
        }
        //7.����������  ����s2���������յ���ʧ,����s2ָ���String�����Լ���ռ�����ڴ�ռ䡣
        {
            String s2 = new String("a string");
        }
        //8.��
        class AtypeName{}
        AtypeName a1 = new AtypeName();
        //9.��ĳ�Ա������ʼ��
        Operation operation = new Operation();
        System.out.println("boolean==>"+operation.a1);
        System.out.println("char==>"+operation.a2);
        System.out.println("byte==>"+operation.a3);
        System.out.println("short==>"+operation.a4);
        System.out.println("int==>"+operation.a5);
        System.out.println("long==>"+operation.a6);
        System.out.println("float==>"+operation.a7);
        System.out.println("souble==>"+operation.a8);
        //10.Java�����Ĳ����б��д��ݵ�������(��ַ)

        //11.��̬����  ����ͨ������з���  Ҳ����ͨ���������з���
        System.out.println("==>"+Operation.i);
        Operation operation1 = new Operation();
        System.out.println("==>"+operation1.i);

        //ͨ������÷���
        Operation.add();
        System.out.println("==>"+Operation.i);
        System.out.println("==>"+operation1.i);

        //Ҳ����ͨ���������÷���
        operation.add();
        System.out.println("==>"+Operation.i);
        System.out.println("==>"+operation1.i);



    }
}
