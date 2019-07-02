/**
 * <pre>
 * desc £ºTODO
 * author £ºlizj
 * date £º2019-07-02 20:57
 * </pre>
 */
public class PassingThis {
    public static void main(String[] args) {

        Apple apple = new Apple();
        apple.num = 11;
        new Person().eat(apple);
    }

}
class Peeler{
    static Apple peel(Apple apple){
        return apple;
    }
}
class Apple{
    int num;
    Apple getPeeled(){
        return Peeler.peel(this);
    }
}

class Person{
    public void eat(Apple apple){
        Apple peeled = apple.getPeeled();
        System.out.println(peeled.num);
    }
}

//class Apple{
//    Apple getPeel(){
//        return Peeler.peel(this);
//    }
//}
//class Peeler{
//   static Apple peel(Apple apple){
//       return apple;
//    }
//}
//class Person{
//    void eat(Apple apple){
//        Apple a = apple.getPeel();
//    }
//}