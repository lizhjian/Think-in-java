/**
 * <pre>
 * desc £ºTODO
 * author £ºlizj
 * date £º2019-07-12 08:21
 * </pre>
 */
public class Demo917  {
    public static void main(String[] args) {
        Son917 son917 = new Son917();
        System.out.println(Son917.MONTH);
       // Son917.MONTH =  - 1;
        System.out.println(Test917.MONTH);

    }
}


interface Test917{

    int MONTH = 1;
    int TUES = 2;
}

class Son917 implements Test917{

}