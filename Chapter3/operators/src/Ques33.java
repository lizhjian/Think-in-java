/**
 * <pre>
 * desc £ºTODO
 * author £ºlizj
 * date £º2019-06-30 18:31
 * </pre>
 */
public class Ques33 {

    static void set(Model33 model33){
        model33.f = 100f;

    }
    public static void main(String[] args) {
        Model33 model31 = new Model33();
        model31.f = 1.0f;

        Model33 model32 = new Model33();
        model32.f = 2.0f;

        System.out.println(model31.f);
        System.out.println(model32.f);

        model31 = model32;
        System.out.println(model31.f);

        Ques33.set(model32);
        System.out.println(model32.f);



    }
}

class Model33{
    float f;
}