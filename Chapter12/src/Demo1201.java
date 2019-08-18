/**
 * <pre>
 * desc ��TODO
 * author ��lizj
 * date ��2019-08-18 20:06
 * </pre>
 */
public class Demo1201 {

    public static void main(String[] args) {
        try {
            throw new Exception("抛出异常");
        }catch (Exception e){
            e.printStackTrace(System.out);
        }finally {
            System.out.println("最后执行");
        }
    }
}
