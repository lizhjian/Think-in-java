package access;

/**
 * <pre>
 * desc ：不同包的访问权限  子类可访问不同包下的父类protected方法 不能访问不同包下default方法 同包下子类都能访问到非private的父类成员
 * author ：lizj
 * date ：2019-07-07 14:57
 * </pre>
 */
public class ChocolateShip extends Cookie1 {
    public ChocolateShip() {
    }

    void chomp(){
        bite();
    }
}
