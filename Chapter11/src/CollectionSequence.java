import java.util.Collection;
import java.util.Iterator;

/**
 * <pre>
 * desc £ºTODO
 * author £ºlizj
 * date £º2019-08-15 21:27
 * </pre>
 */
public class CollectionSequence implements Collection {

    private String[] strings = new String[]{"aaa","bbb"};

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public int size() {

        return strings.length;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public Iterator iterator() {
        return new Iterator() {
            private int index = 0;
            @Override
            public boolean hasNext() {

                return index<strings.length;
            }

            @Override
            public Object next() {
                return strings[index++];
                //return null;
            }

            @Override
            public void remove() {
                throw new UnsupportedOperationException();

            }
        };
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public Object[] toArray(Object[] a) {
        return new Object[0];
    }

    @Override
    public boolean add(Object o) {
        return false;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean containsAll(Collection c) {
        return false;
    }

    @Override
    public boolean addAll(Collection c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection c) {
        return false;
    }

    @Override
    public void clear() {
        if(this.size() !=0){
            for(String str:strings){
             str = null;
            }
        }


    }
}
