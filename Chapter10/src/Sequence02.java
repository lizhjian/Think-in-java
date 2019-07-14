import java.util.Arrays;

/**
 * <pre>
 * desc ：内部类持有外部类对象的引用
 * author ：lizj
 * date ：2019-07-14 15:06
 * </pre>
 */
class Word{
    private String word;

    @Override
    public String toString() {
        return "word..."+word;
    }

    public Word(String word) {
        this.word = word;
    }
}

interface Selector02{
    boolean end();

    Object current();

    void next();

}

public class Sequence02 {

    public Object[] items;

    private int next = 0;

    public Sequence02(int size) {
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
        Sequence02 sequence = new Sequence02(3);

//        for(int i = 0;i<10;i++){
//            sequence.add(Integer.toString(i));
//        }
//        System.out.println(Arrays.toString(sequence.items));
//        Selector selector = sequence.selector();
//        while (!selector.end()){
//            System.out.println(selector.current() + " ");
//            selector.next();
//        }
        Word w1 = new Word("abc");
        Word w2 = new Word("bcd");
        Word w3 = new Word("efg");

        sequence.add(w1);
        sequence.add(w2);
        sequence.add(w3);

        Selector selector = sequence.selector();

        while (!selector.end()){
            System.out.println(selector.current()+" ");
            selector.next();
        }
    }
}
