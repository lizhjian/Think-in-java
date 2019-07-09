/**
 * <pre>
 * desc £ºTODO
 * author £ºlizj
 * date £º2019-07-09 22:19
 * </pre>
 */
public class Demo803 {

    public void ride(Shape803 shape803){

        shape803.show();

    }

    public static void main(String[] args) {
        Demo803 demo803 = new Demo803();

        Shape803 shape803 = new Shape803();

        Circle803 circle803 = new Circle803();

        Triangle803 triangle803 = new Triangle803();

        demo803.ride(shape803);
        demo803.ride(circle803);
        demo803.ride(triangle803);

    }
}


class Shape803{
    public void draw(){}

    public void erase(){}

    public void show(){
        System.out.println("Shape.....show");
    }
}

class Circle803 extends Shape803{
    @Override
    public void draw() {
        super.draw();
    }

    @Override
    public void erase() {
        super.erase();
    }

    @Override
    public void show() {
        System.out.println("Circle803....show");
    }
}
class Triangle803 extends Shape803{
    @Override
    public void draw() {
        super.draw();
    }

    @Override
    public void erase() {
        super.erase();
    }
    @Override
    public void show() {
        System.out.println("Triangle803....show");
    }
}