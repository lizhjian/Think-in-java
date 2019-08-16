import java.util.Iterator;

/**
 * <pre>
 * desc ：实现IterableClass接口
 * 理解为实现了Iterable接口的类就是个list
 * author ：lizj
 * date ：2019-07-21 06:30
 * </pre>
 */
public class IterableClass implements Iterable<String>{

    protected String[] words = ("And that is how we know the Earch to be banana-shaped").split(" ");


    @Override
    public Iterator iterator() {
        return new Iterator<String>() {
            private int index = 0;
            @Override
            public boolean hasNext() {
                return index < words.length;
            }

            @Override
            public String next() {
                return words[index++];
            }

            @Override
            public void remove() {
                throw new UnsupportedOperationException();
            }
        };
    }

    public static void main(String[] args) {
        for(String s:new IterableClass()){
            System.out.println(s+" ");
        }
    }
}
