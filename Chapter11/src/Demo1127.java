import java.util.LinkedList;
import java.util.Queue;

/**
 * <pre>
 * desc £ºTODO
 * author £ºlizj
 * date £º2019-08-11 10:55
 * </pre>
 */
public class Demo1127 {

    public static void main(String[] args) {
        Command c1 = new Command("11");
        Command c2 = new Command("22");
        Command c3 = new Command("33");

        QueueTest test = new QueueTest();
        Queue<Command> queue = new LinkedList<Command>();
        queue.offer(c1);
        queue.offer(c2);
        queue.offer(c3);
        test.setQueue(queue);

        while (queue.peek()!=null){
            System.out.println(queue.poll().operation());
        }
    }

}

class Command{
    public Command(String length) {
        this.length = length;
    }

    private String length;

    public String getLength() {
        return length;
    }

    public void setLength(String length) {
        this.length = length;
    }
    public String operation(){
        return length;
    }
}

class QueueTest{
    private Queue queue;

    public Queue getQueue() {
        return queue;
    }

    public void setQueue(Queue queue) {
        this.queue = queue;
    }
}

