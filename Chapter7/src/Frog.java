/**
 * <pre>
 * desc ：TODO
 * author ：lizj
 * date ：2019-07-08 19:47
 * </pre>
 */
public class Frog extends Amphibian{

//    @Override
//    void show() {
//        //super.show();
//        System.out.println("Frog");
//    }

    @Override
    void say(Amphibian amphibian) {
        //super.say(amphibian);
        System.out.println("say");
    }

    public static void main(String[] args) {
        Amphibian amphibian = new Amphibian();
        amphibian.show();
        amphibian.say(new Frog());


    }
}

class Amphibian{
    void show(){
        System.out.println("Amphibian");
    }

    void say(Amphibian amphibian){
        amphibian.show();
    }
}