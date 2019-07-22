
import java.util.*;

/**
 * <pre>
 * desc ����������
 * author ��lizj
 * date ��2019-07-21 07:49
 * </pre>
 */


public class Demo1111 {
    public static void printAny(Collection c) {
        Iterator it = c.iterator();
        while(it.hasNext())
            System.out.println((it.next() + " "));
    }
    public static void main(String[] args) {
        ArrayList<Integer> al =
                new ArrayList<Integer>(Arrays.asList(1, 2, 3));
        LinkedList<Character> ll =
                new LinkedList<Character>(Arrays.asList('a', 'b', 'c'));
        HashSet<Float> hs =
                new HashSet<Float>(Arrays.asList(1.1f, 2.2f, 3.3f));
        TreeSet<Double> ts =
                new TreeSet<Double>(Arrays.asList(1.11, 2.22, 3.33));
        LinkedHashSet<Integer> lhs =
                new LinkedHashSet<Integer>(Arrays.asList(11, 22, 33));

        printAny(al);
        printAny(ll);
        printAny(hs);
        printAny(ts);
        printAny(lhs);


    }
}