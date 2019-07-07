package access;

import access.dessert.Cookie;

/**
 * <pre>
 * desc ：不同包的访问权限  子类可访问不同包下的父类protected方法 不能访问不同包下default方法 同包下子类都能访问到非private的父类成员
 * author ：lizj
 * date ：2019-07-07 14:57
 * </pre>
 */
public class ChocolateShip1 extends Cookie {
    public ChocolateShip1() {
    }

    public void chomp(){
    //    Cookie cookie1 = new Cookie();
    //    cookie1.bite();   //子类直接访问父类的方法和定义父类再访问父类的方法属于概念的偷换(可以理解为不用super.bite自己定义父类,就是抛弃父子的概念,这时是"其他包访问其他包"的现象)
        super.bite();
        this.bite();
        ChocolateShip ship = new ChocolateShip();
        ship.chomp();

    }
}
