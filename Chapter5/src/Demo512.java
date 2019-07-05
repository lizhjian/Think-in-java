/**
 * <pre>
 * desc ：TODO
 * author ：lizj
 * date ：2019-07-04 21:41
 * </pre>
 */
public class Demo512 {
    public static void main(String[] args) {
        Tank tank1 = new Tank("aaa",true);

        // System.out.println(tank.flag);
          new Tank("bbb",false);
        tank1 = null;
        System.gc();




    }
}


class Tank{
    boolean flag;

    String name;

    public Tank(String name,boolean flag) {
        this.name = name;
        this.flag = flag;
    }

    protected void finalize(){
        System.out.println("尝试清理--->"+this.name);
        if(flag == true){
            System.out.println("非法清理");
        }
        System.out.println("清理完成.....");
    }
}

