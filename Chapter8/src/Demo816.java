/**
 * <pre>
 * desc £ºTODO
 * author £ºlizj
 * date £º2019-07-10 08:32
 * </pre>
 */
class Animal{
    public void say(){}
}

class Pig extends Animal{
    public void say(){
        System.out.println("i am a pig");
    }
}
class Cat extends Animal{
    @Override
    public void say() {
        System.out.println("i am a cat");
    }
}

class Cycle{
    private Animal animal = new Pig();

    public void change(){
        animal = new Cat();
    }

    void show(){
        animal.say();
    }
}

public class Demo816 {

    public static void main(String[] args) {
        Cycle cycle = new Cycle();
        cycle.show();
        cycle.change();
        cycle.show();
    }


}
