/**
 * <pre>
 * desc £ºTODO
 * author £ºlizj
 * date £º2019-07-15 22:44
 * </pre>
 */
public class Demo1007 {

    private Integer num=1;

    private void show(){
        System.out.println("show");
    }

    protected void say(){
        System.out.println("say..."+num);
    }

    class Inner{
        public void operate(){
            num++;
            say();
        }

        private Integer count=3;
    }

    public void create(){
        this.new Inner().operate();
    }

    public static void main(String[] args) {
        Demo1007 de = new Demo1007();
        System.out.println(de.num);
        de.create();
        System.out.println(de.new Inner().count);
    }

}
