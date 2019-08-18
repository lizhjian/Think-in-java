import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.logging.Logger;

/**
 * <pre>
 * desc ：TODO
 * author ：lizj
 * date ：2019-08-18 20:45
 * </pre>
 */
public class LoggerException {
    private static Logger logger =Logger.getLogger("LoggerException--");


    static void logException(Exception e){
        StringWriter stringWriter = new StringWriter();
        e.printStackTrace(new PrintWriter(stringWriter));
        logger.severe(stringWriter.toString());
    }

    public static void main(String[] args) {
        try {
            throw new NullPointerException();
        }catch (NullPointerException e){
            logException(e);
        }

    }
}
