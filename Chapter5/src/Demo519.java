/**
 * <pre>
 * desc £ºTODO
 * author £ºlizj
 * date £º2019-07-07 09:58
 * </pre>
 */
public class Demo519 {
    public static void main(String[] args) {
        String [] strArr = new String[]{"aaa","bbbb"};
        show(strArr);
        show("111","222");
    }



    static void show(String ...args){
        for(String s : args)
            System.out.print(s + " ");
        System.out.println();


    }
}

