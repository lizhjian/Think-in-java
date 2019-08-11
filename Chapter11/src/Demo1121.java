import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 * <pre>
 * desc £ºTODO
 * author £ºlizj
 * date £º2019-07-23 07:46
 * </pre>
 */
public class Demo1121 {
    private static Map<String,Integer> countNum(String[] arrs){
        Map<String,Integer> map = new TreeMap<>(String.CASE_INSENSITIVE_ORDER);

        for(String c:arrs){
            map.put(c,map.get(c)==null?1:map.get(c)+1);
        }
        return map;
    }

    public static void main(String[] args) {

        String[] arrs = new String[]{"bbdf","aaa","abc","dashfi"};
        System.out.println(countNum(arrs));



    }
}
