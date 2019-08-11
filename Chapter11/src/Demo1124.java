import java.util.*;

/**
 * <pre>
 * desc £ºTODO
 * author £ºlizj
 * date £º2019-08-11 10:13
 * </pre>
 */
public class Demo1124 {

    public static void main(String[] args) {

        Map<String,Integer> map = new LinkedHashMap<String,Integer>();
        Map<String,Integer> mapTemp = new LinkedHashMap<String,Integer>();

        map.put("ba",1);
        map.put("a",1);
        map.put("d",1);
        map.put("bda",1);
        System.out.println(map);
        System.out.println(map.keySet());
        Set<String> set = new TreeSet<>(map.keySet());
        System.out.println(set);
        //±éÀúset
        Iterator iterator = set.iterator();

        while (iterator.hasNext()){
            String key =(String) iterator.next();
            mapTemp.put(key,map.get(key));
            map.remove(key);
        }
        System.out.println("mapTemp-->"+mapTemp);
        Set<String> s  = new TreeSet<>(mapTemp.keySet());
        Iterator ss = s.iterator();
        while (ss.hasNext()){
            String key = (String) ss.next();
            map.put(key,mapTemp.get(key));
        }
        System.out.println("map-->"+map);
//        Iterator iterator = map.entrySet().iterator();
//        Map<String,Integer> treeMap = new TreeMap<String,Integer>();
//        while (iterator.hasNext()){
//            Map.Entry entry =  (Map.Entry)iterator.next();
//            treeMap.put(entry.getKey(),entry.getValue());
//        }



        Map<String,Integer> test = new HashMap<>();
        //Iterator iterator1 = test.entrySet().iterator();
        for(Map.Entry entry :test.entrySet()){


        }

    }
}
