import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * <pre>
 * desc £ºTODO
 * author £ºlizj
 * date £º2019-07-20 21:18
 * </pre>
 */
public class MapOfList {
    public static void main(String[] args) {
        Map<String,List<String>> map = new HashMap<String,List<String>>();

        List<String> list1 = Arrays.asList("1","2","3");
        List<String> list2 = Arrays.asList("a","b","c");

        map.put("key1",list1);
        map.put("key2",list2);

        System.out.println(map.keySet());   //Set
        System.out.println(map.values());   //Collection



    }
}
