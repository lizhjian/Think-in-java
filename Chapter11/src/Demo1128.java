import java.util.PriorityQueue;
import java.util.Random;

/**
 * <pre>
 * desc £ºTODO
 * author £ºlizj
 * date £º2019-08-11 11:21
 * </pre>
 */
public class Demo1128 {
    public static void main(String[] args) {

        PriorityQueue<Double> queue = new PriorityQueue<Double>();
        Random random = new Random();
        for(int i = 0;i<10;i++){
            queue.offer(random.nextDouble()*i);
        }
        while (queue.peek()!=null){
            System.out.println(queue.poll());
        }
    }
}
