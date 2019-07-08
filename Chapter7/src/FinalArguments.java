/**
 * <pre>
 * desc ：final作为参数,不能重新分配指向
 * author ：lizj
 * date ：2019-07-08 20:28
 * </pre>
 */
public class FinalArguments {
    private String str ="abc";
    void with(final Gizmo g){
        //g = new Gizmo();
    }

    public static void main(String[] args) {
        FinalArguments finalArguments = new FinalArguments();
        System.out.println(finalArguments.str);
    }
}
class Gizmo{
    public void spin(){
        FinalArguments finalArguments = new FinalArguments();
        //System.out.println(finalArguments.str);  私有方法除了本类就不好使

    }
}