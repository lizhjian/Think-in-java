import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * <pre>
 * desc £ºTODO
 * author £ºlizj
 * date £º2019-07-21 07:39
 * </pre>
 */

class Car1107{
    private int speed;

    public Car1107(int speed) {
        this.speed = speed;
    }
}

public class Demo1107 {
    public static void main(String[] args) {

        List<Car1107> list = new ArrayList<>();
        list.add(new Car1107(1));
        list.add(new Car1107(2));
        list.add(new Car1107(3));
        list.add(new Car1107(4));
        list.add(new Car1107(5));

        List<Car1107> list1 = list.subList(2,4);
        System.out.println(list);
        System.out.println(list1);
        list.set(3,new Car1107(8));
        System.out.println(list);
        System.out.println(list1);

       // System.out.println(list.removeAll(list1));
       // System.out.println(list);





    }
}
