import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * <pre>
 * desc £ºTODO
 * author £ºlizj
 * date £º2019-07-22 22:22
 * </pre>
 */
public class Demo1117 {
    public static void main(String[] args) {
        Map<String,Gerbil1101>  gerbil1101Map = new HashMap<String,Gerbil1101>();
        gerbil1101Map.put("aaa",new Gerbil1101(111));
        gerbil1101Map.put("bbb",new Gerbil1101(222));
        gerbil1101Map.put("ccc",new Gerbil1101(333));
        gerbil1101Map.put("ddd",new Gerbil1101(444));

        Iterator<String> iterator = gerbil1101Map.keySet().iterator();
        while (iterator.hasNext()){
            System.out.println();;
            System.out.println(gerbil1101Map.get(iterator.next()));
        }
    }
}

