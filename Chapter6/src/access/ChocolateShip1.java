package access;

import access.dessert.Cookie;

/**
 * <pre>
 * desc ����ͬ���ķ���Ȩ��  ����ɷ��ʲ�ͬ���µĸ���protected���� ���ܷ��ʲ�ͬ����default���� ͬ�������඼�ܷ��ʵ���private�ĸ����Ա
 * author ��lizj
 * date ��2019-07-07 14:57
 * </pre>
 */
public class ChocolateShip1 extends Cookie {
    public ChocolateShip1() {
    }

    public void chomp(){
    //    Cookie cookie1 = new Cookie();
    //    cookie1.bite();   //����ֱ�ӷ��ʸ���ķ����Ͷ��常���ٷ��ʸ���ķ������ڸ����͵��(�������Ϊ����super.bite�Լ����常��,�����������ӵĸ���,��ʱ��"����������������"������)
        super.bite();
        this.bite();
        ChocolateShip ship = new ChocolateShip();
        ship.chomp();

    }
}
