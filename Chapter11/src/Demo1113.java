import java.awt.*;
import java.util.LinkedList;
import java.util.ListIterator;

/**
 * <pre>
 * desc ��TODO
 * author ��lizj
 * date ��2019-07-22 20:59
 * </pre>
 */
public class Demo1113 {
    // A class from java.util to hold Event objects:
    private LinkedList<Event> eventList = new LinkedList<Event>();
    public void addEvent(Event c) { eventList.add(c); }
    public void run() {
        LinkedList<Event> eventListCopy =
                new LinkedList<Event>(eventList);
        ListIterator<Event> it
                = eventListCopy.listIterator();
        while(it.hasNext()) {
            //it.next().action();
            it.previous();
            System.out.println(it.next());
        }
    }
}
