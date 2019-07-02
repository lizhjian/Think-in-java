

/**
 * <pre>
 * desc ：TODO
 * author ：lizj
 * date ：2019-07-01 20:42
 * </pre>
 */
public class Ques38 {
    public static void main(String[] args) {
//        Test38 test38 = new Test38();
//        test38.compare("aa","aa");
//        test38.compare(new String("aa"),new String("aa"));
//        test38.compare("aa","ab");
//        test38.compare(new String("aa"),new String("ab"));


        System.out.println("aa"=="aa");   //字符常量比较
        System.out.println((new String("aa")) == (new String("aa")));

    }
}


class Test38{
 void compare(String str1 ,String str2){
     System.out.println("str1 equal str2" + str1.equals(str2));
     System.out.println("str1 == str2"+ (str1 == str2));
     System.out.println("str1 != str2" +(str1 != str2));
 }
}