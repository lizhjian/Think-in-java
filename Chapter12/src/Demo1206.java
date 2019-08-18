import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.logging.Logger;

/**
 * <pre>
 * desc ：TODO
 * author ：lizj
 * date ：2019-08-18 20:56
 * </pre>
 */
class Oops1 extends Exception {
    private static Logger logger = Logger.getLogger("LoggingException");
    public Oops1() {
        StringWriter trace = new StringWriter();
        printStackTrace(new PrintWriter(trace));
        logger.severe(trace.toString());
    }
}

class Oops2 extends Exception {
    private static Logger logger = Logger.getLogger("LoggingException");
    public Oops2() {
        StringWriter trace = new StringWriter();
        printStackTrace(new PrintWriter(trace));
        logger.severe(trace.toString());
    }
}

public class Demo1206 {
    static void f() throws Oops1, Oops2 {
        throw new Oops1();
    }
    static void g() throws Oops2 {
        throw new Oops2();
    }
    public static void main(String[] args) {
        try {
            f();
        } catch(Exception Oops1) {}
        try {
            g();
        } catch(Exception Oops2) {}
    }
}
