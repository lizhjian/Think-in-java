import java.io.IOException;
import java.nio.CharBuffer;
import java.util.Random;
import java.util.Scanner;

/**
 * <pre>
 * desc £ºTODO
 * author £ºlizj
 * date £º2019-07-12 07:36
 * </pre>
 */
public class RandomWords implements Readable {

    private static Random rand = new Random(47);

    private static final char[] chars = "aaa".toCharArray();


    private int count;

    public RandomWords(int count) {
        this.count = count;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(new RandomWords(49));
        while (scanner.hasNext()){
            System.out.println(scanner.next());
            System.out.println(scanner.nextDouble());
        }
    }

    @Override
    public int read(CharBuffer cb) throws IOException {
        System.out.println("read...."+cb);
        return 10;
    }
}
