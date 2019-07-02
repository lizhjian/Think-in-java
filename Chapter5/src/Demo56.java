/**
 * <pre>
 * desc £ºTODO
 * author £ºlizj
 * date £º2019-07-02 20:30
 * </pre>
 */
public class Demo56 {
    public static void main(String[] args) {
        Dog2 dog2 = new Dog2();
        dog2.bark(1,"aaa");
        dog2.bark("aa",22);
    }

}

class Dog2{
    void bark(int a ,String b){
        System.out.println("int --> string");

    }
    void bark(String a ,int b){
        System.out.println("String --> int");

    }
}
