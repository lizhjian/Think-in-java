/**
 * <pre>
 * desc £ºTODO
 * author £ºlizj
 * date £º2019-07-02 20:55
 * </pre>
 */
public class Leaf {
    int i = 0;

    Leaf increment(){
        i++;
        return this;
    }
    void print(){
        System.out.println("i = "+i);
    }

    public static void main(String[] args) {
        Leaf x = new Leaf();
        x.increment().increment().increment().print();


    }
}
