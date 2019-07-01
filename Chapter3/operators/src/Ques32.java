/**
 * <pre>
 * desc £ºTODO
 * author £ºlizj
 * date £º2019-06-30 18:24
 * </pre>
 */



public class Ques32 {

    public static void main(String[] args) {
        Model32 model1 = new Model32();
        model1.i  =20f;



        Model32 model2 = new Model32();
        model2.i = 21f;

        System.out.println(model1.i);
        System.out.println(model2.i);

        model1 = model2;

        System.out.println(model1.i);
    }





}

class Model32{
    Float i;
}

