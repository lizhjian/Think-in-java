import java.util.*;

/**
 * <pre>
 * desc £ºTODO
 * author £ºlizj
 * date £º2019-07-22 22:51
 * </pre>
 */
public class Demo1119 {

    public static void main(String[] args) {
        Set<String> s = new HashSet<>();
        s.add("aaa");
        s.add("bbb");
        s.add("ccc");
        s.add("ddd");
        System.out.println(s);

        Set<String> set = new LinkedHashSet<String>(s);
        Set<String> set1 = new LinkedHashSet<String>(s);

        System.out.println(set);

        Iterator<String> iterator = s.iterator();

        while (iterator.hasNext()){
            set.add(iterator.next());
        }
        System.out.println(set);
        for (String str:s){
            set1.add(str);
        }
        System.out.println(set1);
    }
}
