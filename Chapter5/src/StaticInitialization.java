/**
 * <pre>
 * desc �����У���̬��Ա�������ȳ�ʼ��
 *        ֻ���õ��˾�̬�࣬��̬���ڲ��ĳ�Ա�Żᱻ��ʼ��
 * author ��lizj
 * date ��2019-07-07 07:11
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
        System.out.println(Table.bow2);  //��Ϊ������Table,����table�ڲ��ĳ�Ա��������ʼ��
    }

     //System.out.println(Table.bow2);   //����ֻ�ܶ����Ա����
   //  static Table table = new Table();

}


