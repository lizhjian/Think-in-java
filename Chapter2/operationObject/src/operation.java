/**
 * <pre>
 * desc ：万物皆对象
 * author ：lizj
 * date ：2019-04-24 22:59
 * </pre>
 */
public class operation {

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
        System.out.println(arr[0]);
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
        //9.




    }
}
