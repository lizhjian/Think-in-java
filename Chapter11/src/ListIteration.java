import java.util.*;

/**
 * <pre>
 * desc ��TODO
 * author ��lizj
 * date ��2019-07-20 15:19
 * </pre>
 */
public class ListIteration {


    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        list.add("ddd");
        ListIterator  iterator = list.listIterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        while (iterator.hasPrevious()){
            System.out.println(iterator.previous());
        }

        Stack stack = new Stack();

    }
}
