import java.util.Random;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 * <pre>
 * desc £ºset
 * author £ºlizj
 * date £º2019-07-20 20:46
 * </pre>
 */
public class SortedSetOfInteger {
    public static void main(String[] args) {
        Random rand = new Random(47);
        SortedSet<Integer> set = new TreeSet<Integer>();
        for(int i =0;i<1000;i++){
            set.add(rand.nextInt(30));
        }
        System.out.println(set);
    }
}
