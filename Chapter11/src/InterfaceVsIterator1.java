import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * <pre>
 * desc £ºTODO
 * author £ºlizj
 * date £º2019-08-15 21:21
 * </pre>
 */
public class InterfaceVsIterator1 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("aa","bbb");
        Set<String> set = new HashSet<>(list);
        System.out.println(set);
        System.out.println(list);
    }
}
