import java.util.Iterator;
import java.util.Random;

/**
 * <pre>
 * desc £ºTODO
 * author £ºlizj
 * date £º2019-08-16 08:19
 * </pre>
 */

   class Shape1 {
 	public void draw() {}
 	public void erase() {}
 	public void amend() { System.out.println("Shape.amend()"); }
 	@Override public String toString() { return "Shape"; }
  }
   class Circle1 extends Shape1 {
 	@Override public void draw() {
        System.out.println("Circle.draw()"); }
 	@Override public void erase() { System.out.println("Circle.erase()"); }
 	@Override public void amend() { System.out.println("Circle.amend()"); }
 	@Override public String toString() { return "Circle"; }
  }
   class Square1 extends Shape1 {
 	@Override public void draw() { System.out.println("Square.draw()"); }
 	@Override public void erase() { System.out.println("Square.erase()"); }
 	@Override public void amend() { System.out.println("Square.amend()"); }
 	@Override public String toString() { return "Square"; }
  }
   class Triangle1 extends Shape1 {
 	@Override public void draw() { System.out.println("Triangle.draw()"); }
 	@Override public void erase() { System.out.println("Triangle.erase()"); }
 	@Override public void amend() { System.out.println("Triangle.amend()"); }
 	@Override public String toString() { return "Triangle"; }
  }
public class Demo1131 implements Iterable<Shape1> {

       public Iterable<Shape1> resverved(){

           return new Iterable<Shape1>() {
               @Override
               public Iterator<Shape1> iterator() {
                   return null;
               }
           };
       }

    private Random rand = new Random();
    public Shape1 make() {
        switch(rand.nextInt(3)) {
            default:
            case 0: return new Circle1();
            case 1: return new Square1();
            case 2: return new Triangle1();
        }
    }
    private Shape1[] shapes;
    Demo1131(int n) {
        shapes = new Shape1[n];
        for(int i = 0; i < n; i++)
            shapes[i] = make();

    }
    public Iterator<Shape1> iterator() {
        return new Iterator<Shape1>() {
            private int index = 0;
            public boolean hasNext() {
                return index < shapes.length;
            }
            public Shape1 next() {
                return shapes[index++];
            }
            public void remove() {
                throw new UnsupportedOperationException();
            }
        };
    }
    public static void main(String[] args) {
        Demo1131 rsg = new Demo1131(20);
        for(Shape1 s : rsg)
            System.out.println(s);
    }
}