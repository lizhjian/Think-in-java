/**
 * <pre>
 * desc ：万物皆对象
 * author ：lizj
 * date ：2019-04-24 22:59
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

        //1.只是一个有引用，不指向任何对象，所以没办法对s进行实际操作
        String s;
        //s.length();
        //2.给我一个新的对象
        String s1 = new String("abc");   //被放在堆中
        String b = new String("abc");
        System.out.println(s1==b);
        System.out.println(s1.equals(b));
        //3.基础变量被放到堆栈中，直接存储值；
        int a =1;
        //4.拆箱 装箱
        char c='x';
        Character ch = new Character(c);
        char d = ch;
        //5.数组
        char[] arr = {};
        System.out.println(arr.length);
       // System.out.println(arr[0]);
        //6.作用域
        {
            int x =12;
            {
                int q =98;
               // int x = 89;  不合法
            }
        }
        //7.对象作用域  引用s2在作用域终点消失,但是s2指向的String对象仍继续占据着内存空间。
        {
            String s2 = new String("a string");
        }
        //8.类
        class AtypeName{}
        AtypeName a1 = new AtypeName();
        //9.类的成员变量初始化
        Operation operation = new Operation();
        System.out.println("boolean==>"+operation.a1);
        System.out.println("char==>"+operation.a2);
        System.out.println("byte==>"+operation.a3);
        System.out.println("short==>"+operation.a4);
        System.out.println("int==>"+operation.a5);
        System.out.println("long==>"+operation.a6);
        System.out.println("float==>"+operation.a7);
        System.out.println("souble==>"+operation.a8);
        //10.Java函数的参数列表中传递的是引用(地址)

        //11.静态变量  可以通过类进行访问  也可以通过类对象进行访问
        System.out.println("==>"+Operation.i);
        Operation operation1 = new Operation();
        System.out.println("==>"+operation1.i);

        //通过类调用方法
        Operation.add();
        System.out.println("==>"+Operation.i);
        System.out.println("==>"+operation1.i);

        //也可以通过类对象调用方法
        operation.add();
        System.out.println("==>"+Operation.i);
        System.out.println("==>"+operation1.i);



    }
}
