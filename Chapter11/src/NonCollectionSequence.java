import java.util.*;


/**
 * <pre>
 * desc ：TODO
 * author ：lizj
 * date ：2019-08-16 09:06
 * </pre>
 */
public class NonCollectionSequence implements Iterable<String>{

    protected String[] words = ("And that is how we know the Earch to be banana-shaped").split(" ");

    @Override
    public Iterator<String> iterator() {
        return new Iterator<String>() {
            @Override
            public boolean hasNext() {
                return false;
            }

            @Override
            public String next() {
                return null;
            }

            @Override
            public void remove() {

            }
        };
    }

    public Iterable<String> reserved() {
        return new Iterable<String>() {
            @Override
            public Iterator<String> iterator() {

                //int current = pets.length - 1;
                return new Iterator<String>() {
                    int current = words.length-1;

                    @Override
                    public boolean hasNext() {
                       return current >-1;
                    }

                    @Override
                    public String next() {
                        return words[current--];
                        //return null;
                    }

                    @Override
                    public void remove() {
                        throw new RuntimeException("不可操作");

                    }
                };
            }
        };
    }

    public Iterable<String> randomized(){
        return new Iterable<String>() {
            @Override
            public Iterator<String> iterator() {
                List<String> shuffled = new
                        ArrayList<String>(Arrays.asList(words));
                Collections.shuffle(shuffled, new Random());
                return shuffled.iterator();
            }
        };
    }

    public static void main(String[] args) {
        NonCollectionSequence nc = new NonCollectionSequence();
        System.out.println("pets: ");
        for(String p : nc.words)
            System.out.println(p + " ");
        System.out.println();
        System.out.println("reversed: ");
        for(String p : nc.reserved())     //nc.reserved()  只要能返回一个Iterable接口类的实现可以实现迭代
            System.out.println(p + " ");
        System.out.println();
        System.out.println("randomized: ");
        for(String p : nc.randomized())
            System.out.println(p + " ");
    }

}
