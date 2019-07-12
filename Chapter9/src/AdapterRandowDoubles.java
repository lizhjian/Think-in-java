import java.io.IOException;
import java.nio.CharBuffer;
import java.util.Random;
import java.util.Scanner;

/**
 * <pre>
 * desc ：TODO
 * author ：lizj
 * date ：2019-07-12 08:03
 * </pre>
 */
public class AdapterRandowDoubles extends RandomDoubles implements Readable{

    private int count;

    public AdapterRandowDoubles(int count) {
        this.count = count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(new AdapterRandowDoubles(7));
        scanner.nextDouble();
    }

    @Override
    public int read(CharBuffer cb) throws IOException {
        System.out.println("实现接口");
        return 0;
    }
}


class RandomDoubles{

    private static Random rand  = new Random(47);

    public double next(){
        return rand.nextDouble();
    }

}