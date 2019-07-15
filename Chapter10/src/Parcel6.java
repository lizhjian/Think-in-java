/**
 * <pre>
 * desc ：TODO
 * author ：lizj
 * date ：2019-07-16 06:11
 * </pre>
 */
public class Parcel6 {

    private void internalTracking(boolean b){
        if(b){
            class TrackingSlip{
                private String id;

                public TrackingSlip(String id) {
                    this.id = id;
                }
                String getSlip(){
                    return id;
                }
            }
            TrackingSlip t = new TrackingSlip("slip");
            String s = t.getSlip();
        }
        //在定义内部类的作用域之外, 内部类不可使用
//        TrackingSlip ts = new TrackingSlip("slip");
//        String s1 = ts.getSlip();

    }


    public static void main(String[] args) {

        Parcel6 p = new Parcel6();
        p.internalTracking(true);

    }
}
