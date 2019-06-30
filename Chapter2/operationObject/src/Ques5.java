/**
 * <pre>
 * desc £ºTODO
 * author £ºlizj
 * date £º2019-06-30 08:15
 * </pre>
 */
public class Ques5 {

    public static void main(String[] args) {
        DataOnly dataOnly  = new DataOnly();
        dataOnly.setB(true);
        dataOnly.setD(1);
        dataOnly.setI(1);
        dataOnly.show();
    }
}


class DataOnly{
    int i;
    double d;
    boolean b;

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    public double getD() {
        return d;
    }

    public void setD(double d) {
        this.d = d;
    }

    public boolean isB() {
        return b;
    }

    public void setB(boolean b) {
        this.b = b;
    }


    void show(){
        System.out.println(this.getD());
        System.out.println(this.getI());
        System.out.println(this.isB());
    }
}