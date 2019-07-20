import java.util.*;

/**
 * <pre>
 * desc £º¼¯ºÏ²Ù×÷
 * author £ºlizj
 * date £º2019-07-20 12:54
 * </pre>
 */

public class AddingGroups {
    public static void main(String[] args) {
        Collection<Integer> collection = new ArrayList<>(Arrays.asList(1,2,3,4,5));

        Integer[] arrs = {6,7,8,2,3,4};

        //((ArrayList<Integer>) collection).addAll(Arrays.asList(arrs));

        //Collections.addAll(collection,Arrays.asList(args));
        ((ArrayList<Integer>) collection).addAll(Arrays.asList(arrs));

        Collections.addAll(collection,11,12,13);

        Collections.addAll(collection,arrs);
        List<Integer> list = Arrays.asList(11,22,333);
        list.set(1,99);
        list.add(21);




    }
}
