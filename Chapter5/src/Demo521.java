/**
 * <pre>
 * desc £ºTODO
 * author £ºlizj
 * date £º2019-07-07 10:13
 * </pre>
 */



public class Demo521 {
    public static void main(String[] args) {
        for (Type type:Type.values()){
            //System.out.println(type +"--->"+type.ordinal());
            Demo521.show(type);
        }
    }

    enum Type{
        MON,
        TUE
    }
    static void show(Type type){
         switch (type){
             case MON:
                 System.out.println("111");break;
             case TUE:
                 System.out.println("222");break;

         }
    }

}
