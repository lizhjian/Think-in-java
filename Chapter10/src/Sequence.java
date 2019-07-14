import java.sql.SQLOutput;
import java.util.Arrays;

/**
 * <pre>
 * desc ：内部类持有外部类对象的引用
 * author ：lizj
 * date ：2019-07-14 15:06
 * </pre>
 */
interface Selector{
    boolean end();

    Object current();

    void next();

}

public class Sequence {

    public Object[] items;

    private int next = 0;

    public Sequence(int size) {
        items = new Object[size];
    }

    public  void add (Object x ){
        if(next<items.length){
            items[next++] = x;
        }
    }

    private class SequenceSelector implements Selector{

        private int i = 0;
        @Override
        public boolean end() {
            return i==items.length;
        }

        @Override
        public Object current() {
            return items[i];
        }

        @Override
        public void next() {
            if(i<items.length){
                i++;
            }
        }
    }

    public Selector selector(){
        return new SequenceSelector();
    }


    public static void main(String[] args) {
        Sequence sequence = new Sequence(10);


        for(int i = 0;i<10;i++){
            sequence.add(Integer.toString(i));
        }
        System.out.println(Arrays.toString(sequence.items));
        Selector selector = sequence.selector();
        while (!selector.end()){
            System.out.println(selector.current() + " ");
            selector.next();
        }
    }
}
