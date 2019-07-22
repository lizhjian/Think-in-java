import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/**
 * <pre>
 * desc  逆序
 * author ：lizj
 * date ：2019-07-21 22:14
 * </pre>
 */
public class Demo1112 {

    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>(5);

        list1.add(11);
        list1.add(12);
        list1.add(13);
        list1.add(14);
        list1.add(15);
        List<Integer> list2 = new ArrayList<>(5);
        list2.add(21);
        list2.add(22);
        list2.add(23);
        list2.add(24);
        list2.add(25);

        ListIterator<Integer> iterator1 = list1.listIterator();
        ListIterator<Integer> iterator2 = list2.listIterator();

        while (iterator1.hasNext()) {
            iterator1.next();   //游标移动到最后
        }
        while (iterator2.hasNext()){
            iterator2.next();
            iterator2.set(iterator1.previous());
            //((ListIterator) iterator2).set(((ListIterator) iterator1).previous());
        }
        System.out.println(list1);
        System.out.println(list2);
    }

}
