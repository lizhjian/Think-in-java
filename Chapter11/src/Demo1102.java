import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

/**
 * <pre>
 * desc ��TODO
 * author ��lizj
 * date ��2019-07-21 07:31
 * </pre>
 */
public class Demo1102 {
    public static void main(String[] args) {
        Set<Integer> c = new HashSet<>();
        for(int i = 0;i<10;i++){
            c.add(i);
        }
        for(Integer i:c){
            System.out.println(i+ " ");
        }
    }
}
