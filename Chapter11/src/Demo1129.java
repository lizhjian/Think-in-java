import java.util.PriorityQueue;

/**
 * <pre>
 * desc £∫”≈œ»º∂
 * author £∫lizj
 * date £∫2019-08-15 21:01
 * </pre>
 */
public class Demo1129 {
    public static void main(String[] args) {

//        PriorityQueue<Object>  queue = new PriorityQueue<Object>();
////        queue.offer(new Sub());
////        queue.offer(new Sub());
////        System.out.println(queue.poll());
        PriorityQueue<Sub> s = new PriorityQueue<Sub>();
        // OK to add one Simple:
        s.offer(new Sub());
        // but no more allowed; get runtime exception:
        // Simple cannot be cast to Comparable:
        s.offer(new Sub());

    }
}
class Simple extends Object {}

class Sub extends Object {
    private int age;

}