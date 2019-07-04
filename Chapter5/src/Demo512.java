/**
 * <pre>
 * desc ：TODO
 * author ：lizj
 * date ：2019-07-04 21:41
 * </pre>
 */
public class Demo512 {
    public static void main(String[] args) {
        new Tank(true);
        // System.out.println(tank.flag);
        //  new Tank();
        System.gc();



    }
}


class Tank{
    boolean flag;

    public Tank(boolean flag) {
        this.flag = flag;
    }

    protected void finalize(){
        if(flag == true){
            System.out.println("非法清理");
        }
    }
}

