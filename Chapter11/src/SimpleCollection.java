import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

/**
 * <pre>
 * desc £º¼¯ºÏ
 * author £ºlizj
 * date £º2019-07-20 12:47
 * </pre>
 */
public class SimpleCollection {
    public static void main(String[] args) {
        Set<Integer> c = new HashSet<>();
        c.add(1);
        c.add(2);
        c.add(3);
        c.add(3);
        for(Integer i:c){
            System.out.println(i);

        }
    }

}


