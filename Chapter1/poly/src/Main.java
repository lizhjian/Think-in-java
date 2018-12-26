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



        // 1.多态
        /*Circle circle = new Circle();
        Line line = new Line();
        Main.dosomething(circle);
        Main.dosomething(line);*/
        // 2.容器泛型
        /*List<Shape> shapes = new ArrayList<>();
        shapes.add(new Shape());
        shapes.add(circle);
        for (Shape shape:shapes){
            Main.dosomething(shape);
        }*/
        //3.类变量初始化
        DataOnly dataOnly = new DataOnly();
        System.out.println(dataOnly.i);
        System.out.println(dataOnly.j);
        System.out.println(dataOnly.k);
        System.out.println(dataOnly.aByte);
        System.out.println(dataOnly.aChar);
        System.out.println(dataOnly.aFloat);
        System.out.println(dataOnly.aLong);
        System.out.println(dataOnly.aShort);




    }

    static void dosomething(Shape shape){
        shape.show();
    }
}
