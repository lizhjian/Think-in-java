/**
 * <pre>
 * desc ：类中，静态成员变量最先初始化
 *        只用用到了静态类，静态类内部的成员才会被初始化
 * author ：lizj
 * date ：2019-07-07 07:11
 * </pre>
 */


class Bowl
{
    public Bowl(int marker) {
        System.out.println("Bowl+("+marker+")");
    }
}

class Table{
    public static Bowl bowl = new Bowl(1);

    public Table() {
    }
    static Bowl bow2 = new Bowl(3);
}

public class StaticInitialization {
    public static void main(String[] args) {
       // System.out.println(Table.bow2);
        // Table table = new Table();
        System.out.println(Table.bow2);  //因为引用了Table,所以table内部的成员变量被初始化
    }

     //System.out.println(Table.bow2);   //类中只能定义成员变量
   //  static Table table = new Table();

}


