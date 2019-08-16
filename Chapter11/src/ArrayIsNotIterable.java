import java.util.Arrays;

/**
 * <pre>
 * desc ：测试数据无法实现forEach
 * author ：lizj
 * date ：2019-08-16 08:13
 * </pre>
 */
public class ArrayIsNotIterable {

    static <T> void test(Iterable<T> ib){
        for (T t:ib){
            System.out.println(t +" ");
        }

    }

    public static void main(String[] args) {
        test(Arrays.asList(1,2,3));
        String[] strings = {"A","B","C"};
        //test(strings);

    }
}
