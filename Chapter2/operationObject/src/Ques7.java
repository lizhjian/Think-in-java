/**
 * <pre>
 * desc £ºTODO
 * author £ºlizj
 * date £º2019-06-30 08:21
 * </pre>
 */
public class Ques7 {

    static class Incrementable{
         void increment(){
             StaticTest.i ++;
         }
         void show(){
             System.out.println(StaticTest.i);
         }
    }

    public static void main(String[] args) {
        //Ques7.Incrementable incrementable = new Ques7.new Incrementable();
        Incrementable incrementable = new Ques7.Incrementable();
        incrementable.increment();
        incrementable.increment();
        incrementable.show();


    }


}
class StaticTest{
    static int i;
}