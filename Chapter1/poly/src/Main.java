/**
 * <pre>
 * desc : TODO
 * @author : lzhj
 * date : 2018-12-26 20:12:32
 * @Param null 
 * @return 
 * </pre>
 */
public class Main {

    public static void main(String[] args) {

        Circle circle = new Circle();
        Line line = new Line();
        Main.dosomething(circle);
        Main.dosomething(line);
    }

    static void dosomething(Shape shape){
        shape.show();
    }
}
