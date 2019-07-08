/**
 * <pre>
 * desc ：TODO
 * author ：lizj
 * date ：2019-07-08 20:41
 * </pre>
 */
//public class Demo722 extends Test722{
public class Demo722 {
    public static void main(String[] args) {
        Test722 test722 = new Test722();


    }
}


 class Test722{

    private Integer num  = show();
    private static String num1  = print("静态");



    Integer show(){
        System.out.println("初始化");
         return new Integer(1);
    }
    static String print(String str){
        System.out.println(str);
        return str;
    }



    //public static
}