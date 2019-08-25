import java.util.ArrayList;
import java.util.List;

/**
 * <pre>
 * desc ：递归调用
 * author ：lizj
 * date ：2019-08-25 11:38
 * </pre>
 */
public class InfiniteRecursion2 {
    public String toString() {
        return " InfiniteRecursion address: " + this.toString() + "\n";
    }
    public static void main(String[] args) {
        List<InfiniteRecursion2> v = new ArrayList<InfiniteRecursion2>();
        for(int i = 0; i < 10; i++)
            v.add(new InfiniteRecursion2());
        System.out.println(v);
    }
}