/**
 * <pre>
 * desc ：TODO
 * author ：lizj
 * date ：2019-08-25 11:15
 * </pre>
 */
public class Immutable {

    public static String upcase(String s){
        return s.toUpperCase();
    }

    public static void main(String[] args) {
        String q = "hoddy";
        System.out.println(q);
        String qq = "hoddy";
        System.out.println(upcase(qq));
        //String q = "hoddy";
        System.out.println(q);


        long startTime=System.currentTimeMillis();   //获取开始时间

        String str = null;
        for(int i=0 ;i<10000;i++){
            str +="1aaa";

        }
        long endTime=System.currentTimeMillis(); //获取结束时间

        System.out.println("程序运行时间： "+(endTime-startTime)+"ms");

        startTime=System.currentTimeMillis();   //获取开始时间

        StringBuilder stringBuilder = new StringBuilder();
        for(int i=0 ;i<1000000;i++){
            stringBuilder.append("vccc");

        }

        endTime=System.currentTimeMillis(); //获取结束时间

        System.out.println("程序运行时间： "+(endTime-startTime)+"ms");

        startTime=System.currentTimeMillis();   //获取开始时间

        StringBuffer stringBuffer = new StringBuffer();
        for(int i=0 ;i<1000000;i++){
            stringBuffer.append("rbbb");

        }
        endTime=System.currentTimeMillis(); //获取结束时间

        System.out.println("程序运行时间： "+(endTime-startTime)+"ms");

    }
}
