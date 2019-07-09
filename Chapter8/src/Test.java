/**
 * <pre>
 * desc ：TODO
 * author ：lizj
 * date ：2019-07-09 08:50
 * </pre>
 */
public class Test
{
    public static void main(String[] args)
    {
        Father a = new Father();
        Chilren b = new Chilren();
        Father c = new Chilren();
        a.getAge();
        System.out.println(a.age);
        b.getAge();
        System.out.println(b.age);
        c.getAge();
        System.out.println(c.age);
    }
}

class Father
{
    int age = 40;
    public void getAge()
    {
        System.out.println(age);
    }
}

class Chilren extends Father
{
    int age = 18;
    public void getAge()
    {
        System.out.println(age);
    }
}