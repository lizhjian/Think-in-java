import java.util.*;

/**
 * <pre>
 * desc £ºTODO
 * author £ºlizj
 * date £º2019-07-22 22:57
 * </pre>
 */
public class Demo1120 {
    private static Map<Character,Integer> countNum(Character[] arr){
        Map<Character,Integer> map = new HashMap<>();
        for(Character c:arr){
            map.put(c,map.get(c)==null?1:map.get(c)+1);
        }
        return map;


    }


    public static void main(String[] args) {
        Character[] arr = new Character[]{'a','b','s','d','a','3'};
        System.out.println(countNum(arr));;

    }
}
