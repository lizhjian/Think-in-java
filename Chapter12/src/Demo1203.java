import java.util.concurrent.ExecutionException;

/**
 * <pre>
 * desc ：TODO
 * author ：lizj
 * date ：2019-08-18 20:15
 * </pre>
 */
public class Demo1203 {

    public static void main(String[] args) {
        try {
            String [] str = new String[]{"1","2","3"};
            System.out.println(str[4]);
        }catch (Exception e){

            e.printStackTrace();
        }
    }
}
