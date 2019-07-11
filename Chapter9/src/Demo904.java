/**
 * <pre>
 * desc ：TODO
 * author ：lizj
 * date ：2019-07-11 22:08
 * </pre>
 */
public class Demo904 {

    public static void main(String[] args) {
        Son subTest904 = new Son();
        Son.say(subTest904);

        SecondSon secondSon = new SecondSon();
        secondSon.say(secondSon);
    }
}
//抽象类
abstract class Dad{

}

class Son extends Dad{
    void show(){
        System.out.println("Son...");
    }

    static void say(Dad test904){
        ((Son)test904).show();
    }
}

//抽象类
abstract class SecondDad{
    abstract void show();
}

class SecondSon extends SecondDad{
    @Override
    void show() {
        System.out.println("SecondSon....");
    }

    static void say(SecondDad secondDad){
        secondDad.show();
    }
}