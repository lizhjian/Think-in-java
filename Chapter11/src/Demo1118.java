import java.util.*;

/**
 * <pre>
 * desc ：TODO
 * author ：lizj
 * date ：2019-07-22 22:35
 * </pre>
 */
public class Demo1118 {

    public static void main(String[] args) {
        HashMap<String,String> map = new HashMap<>();

        map.put("g","gg");
        map.put("a","aa");
        map.put("b","bb");
        map.put("c","cc");
        map.put("d","dd");
        map.put("e","ee");
        map.put("f","ff");

        //System.out.println();

       // map.values();

       // Set<String> s = map.keySet();

        Set<String> set = new TreeSet<String>(map.keySet());//给set排序
        System.out.println(set);

        Map<String,String> linkMap = new LinkedHashMap<>();

        for(String s :set){

            linkMap.put(s,map.get(s));

        }

        System.out.println(linkMap);


        Map<String,String> treeMap = new TreeMap<String,String>(map);//格式化map 给map排序
        System.out.println(treeMap);




    }

}
