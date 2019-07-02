/**
 * <pre>
 * desc £ºTODO
 * author £ºlizj
 * date £º2019-07-01 12:48
 * </pre>
 */
public class Ques35 {
    public static void main(String[] args) {
        Dog dog1 = new Dog("spot","Ruff!");
        Dog dog2 = new Dog("scruffy","Wurf!");

        System.out.println(dog1.name +"------>"+dog1.says);
        System.out.println(dog2.name +"------>"+dog2.says);

        Dog dog3 =dog1;

        System.out.println(dog1.equals(dog3));
        System.out.println(dog1==dog3);

    }

}


class Dog{
    String name;

    String says;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSays() {
        return says;
    }

    public void setSays(String says) {
        this.says = says;
    }

    public Dog(String name, String says) {
        this.name = name;
        this.says = says;
    }
}