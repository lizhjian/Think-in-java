import java.util.HashSet;
import java.util.Random;
import java.util.Set;

/**
 * <pre>
 * desc £ºTODO
 * author £ºlizj
 * date £º2019-07-20 15:43
 * </pre>
 */
public class SetOfInteger {

    public static void main(String[] args) {
        Random random = new Random(47);

        Set<Integer> s = new HashSet<>();
        for(int i = 0;i<1000;i++){
            s.add(random.nextInt(30));
        }
        System.out.println(s);
    }
}
