package access.dessert;

/**
 * <pre>
 * desc ��protectedΪ��ͬ�����ӵ��ø����ṩ�˿���
 * author ��lizj
 * date ��2019-07-07 14:56
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
