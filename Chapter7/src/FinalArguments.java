/**
 * <pre>
 * desc ：final作为参数,不能重新分配指向
 * author ：lizj
 * date ：2019-07-08 20:28
 * </pre>
 */
public class FinalArguments {
    void with(final Gizmo g){
        //g = new Gizmo();
    }

    public static void main(String[] args) {

    }
}
class Gizmo{
    public void spin(){}
}