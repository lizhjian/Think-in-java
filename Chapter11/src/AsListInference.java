import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * <pre>
 * desc ��Arrays.List��ʽת������ʾת��
 * author ��lizj
 * date ��2019-07-20 14:14
 * </pre>
 */

class Snow{}

class Powder extends Snow{}

class Light extends Powder{}

class Heavy extends Powder{}

class Crush extends Snow{}

class Slush extends Snow{}



public class AsListInference {

    public static void main(String[] args) {
        //Ĭ�ϰ�����ͼ����ת
        List<Snow> list1 = Arrays.asList(new Powder(),new Heavy(),new Slush());
        //��ʾָ�����߱�������Ҫת��ʲô����
        List<Snow> list2 = Arrays.<Snow>asList(new Powder(),new Heavy());


    }
}
