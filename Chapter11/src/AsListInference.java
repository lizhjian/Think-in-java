import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * <pre>
 * desc ：Arrays.List隐式转换及显示转换
 * author ：lizj
 * date ：2019-07-20 14:14
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
        //默认按照最低级别的转
        List<Snow> list1 = Arrays.asList(new Powder(),new Heavy(),new Slush());
        //显示指定告诉编译器想要转成什么样的
        List<Snow> list2 = Arrays.<Snow>asList(new Powder(),new Heavy());


    }
}
