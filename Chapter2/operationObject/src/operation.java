/**
 * <pre>
 * desc ������Զ���
 * author ��lizj
 * date ��2019-04-24 22:59
 * </pre>
 */
public class operation {

    public static void main(String[] args) {

        //1.ֻ��һ�������ã���ָ���κζ�������û�취��s����ʵ�ʲ���
        String s;
        //s.length();
        //2.����һ���µĶ���
        String s1 = new String("abc");   //�����ڶ���
        String b = new String("abc");
        System.out.println(s1==b);
        System.out.println(s1.equals(b));
        //3.�����������ŵ���ջ�У�ֱ�Ӵ洢ֵ��
        int a =1;
        //4.���� װ��
        char c='x';
        Character ch = new Character(c);
        char d = ch;
        //5.����
        char[] arr = {};
        System.out.println(arr.length);
        System.out.println(arr[0]);
        //6.������
        {
            int x =12;
            {
                int q =98;
            }
        }



    }
}
