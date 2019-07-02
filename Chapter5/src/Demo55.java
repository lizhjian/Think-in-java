/**
 * <pre>
 * desc £ºTODO
 * author £ºlizj
 * date £º2019-07-02 20:26
 * </pre>
 */
public class Demo55 {
    public static void main(String[] args) {
        Dog1 dog1 = new Dog1();
        dog1.bark(1);
        dog1.bark("aa");
    }
}


class Dog1{

    void bark(int a){
        System.out.println("barking");

    }
    void bark(String str){
        System.out.println("howling");
    }


}