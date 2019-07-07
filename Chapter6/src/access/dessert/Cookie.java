package access.dessert;

/**
 * <pre>
 * desc ：protected为不同包的子调用父类提供了可能
 * author ：lizj
 * date ：2019-07-07 14:56
 * </pre>
 */
public class Cookie {
    public Cookie() {
    }

    public void bite(){
        System.out.println("bite");
    }
    private void show(){
        this.bite();
    }
}
