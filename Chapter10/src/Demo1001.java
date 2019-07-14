/**
 * <pre>
 * desc £ºTODO
 * author £ºlizj
 * date £º2019-07-14 08:19
 * </pre>
 */
public class Demo1001 {

    public static void main(String[] args) {
        Outer.Inner inner = new Outer().getInner();

        System.out.println();
    }
}

class Outer{
    class Inner{

    }

    Inner getInner(){
        return new Inner();
    }
}