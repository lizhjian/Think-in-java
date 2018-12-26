import java.util.ArrayList;
import java.util.List;

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
//        Main.dosomething(circle);
//        Main.dosomething(line);
        // 容器泛型
        List<Shape> shapes = new ArrayList<>();
        shapes.add(new Shape());
        shapes.add(circle);
        for (Shape shape:shapes){
            Main.dosomething(shape);
        }
    }

    static void dosomething(Shape shape){
        shape.show();
    }
}
