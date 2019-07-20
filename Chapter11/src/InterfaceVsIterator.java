import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * <pre>
 * desc £ºTODO
 * author £ºlizj
 * date £º2019-07-20 22:52
 * </pre>
 */
public class InterfaceVsIterator {


    public static void main(String[] args) {
        String [] arr = {"aaa","bbb","ccc"};
        Map<String,Integer> map = new HashMap<String,Integer>();

        for(int i =0;i<arr.length;i++){
            map.put(arr[i],i);
        }
        System.out.println(map.values());
    }
//    public static void display(Collection<Inte>){
//
//    }
}
