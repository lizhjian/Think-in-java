/**
 * <pre>
 * desc £ºTODO
 * author £ºlizj
 * date £º2019-07-10 08:39
 * </pre>
 */
public class Demo817 {
    public static void main(String[] args) {
        Cycle817 animal817[] = new Cycle817[]{new Cycle817(),new Unicycle817(),new Bicycle817()};
        animal817[0].say();
        animal817[1].say();
        ((Unicycle817)animal817[1]).bal();
        ((Unicycle817)animal817[2]).bal();
    }


}
class Cycle817{
    void say(){
        System.out.println("ani");
    }
}

class Unicycle817 extends Cycle817{

    void say() {
        System.out.println("pig");
    }

    void bal(){
        System.out.println("pig...bal");
    }
}

class Bicycle817 extends Cycle817{

    void say() {
        System.out.println("cat");
    }
}