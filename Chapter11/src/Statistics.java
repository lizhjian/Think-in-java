import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/**
 * <pre>
 * desc £ºmap
 * author £ºlizj
 * date £º2019-07-20 20:57
 * </pre>
 */
public class Statistics {

    public static void main(String[] args) {
        Random rand = new Random();
        Map<Integer,Integer> map = new HashMap<Integer,Integer>();

        for(int i = 0;i<1000;i++){
            int r = rand.nextInt(20);
            Integer freq = map.get(r);
            map.put(r,freq==null?1:freq+1);
        }
        System.out.println(map);
    }
}
