import java.util.LinkedList;
import java.util.ListIterator;

/**
 * <pre>
 * desc ：TODO
 * author ：lizj
 * date ：2019-07-22 21:00
 * </pre>
 */
public class Demo1114 {


    public static void main(String[] args) {

        LinkedList<Integer> list = new LinkedList<>();

        ListIterator iterator = list.listIterator();

       // iterator.nextIndex()

        Integer[] arr = new Integer[]{1,2,3,4,5,55,22};
        for(Integer i : arr) {
            ListIterator<Integer> it =
                    list.listIterator((list.size())/2);   //迭代器获得索引位置
            it.add(i);//在当前位置追加
            System.out.println(list);
        }


        LinkedList<Integer> list1 = new LinkedList<>();
        ListIterator iterator1 = list1.listIterator();
        Integer[] arr1 = new Integer[]{12,2,334,4,45,55,22};
        for(Integer integer:arr1){
            iterator1 = list1.listIterator(list1.size()/2);
            iterator1.add(integer);
            System.out.println(list1);
        }


    }



}
