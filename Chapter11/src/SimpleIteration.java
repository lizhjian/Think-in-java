import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * <pre>
 * desc £ºµü´úÆ÷
 * author £ºlizj
 * date £º2019-07-20 15:04
 * </pre>
 */
public class SimpleIteration {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
      //List<String> list1 = null;

        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        System.out.println(list);
        Iterator iterator = list.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
            iterator.remove();
            System.out.println(list);
        }
        System.out.println(list);



    }
}
