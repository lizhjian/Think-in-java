import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.logging.Logger;

/**
 * <pre>
 * desc ：TODO
 * author ：lizj
 * date ：2019-08-18 20:57
 * </pre>
 */
public class Demo1207 {
    private static int[] ia = new int[2];
    private static Logger logger = Logger.getLogger("Ex7 Exceptions");
    static void logException(Exception e) { // Exception e argument
        StringWriter trace = new StringWriter();
        e.printStackTrace(new PrintWriter(trace));
        logger.severe(trace.toString());
    }
    public static void main(String[] args) {
        try {
            ia[2] = 3;
        } catch(ArrayIndexOutOfBoundsException e) {
            System.err.println(
                    "Caught ArrayIndexOutOfBoundsException");
            e.printStackTrace();
            // call logging method:
            logException(e);
        }
    }
}
